package wx.protocol;

import java.util.Date;
import java.util.Map;

import wx.msg.resp.WXTextMsg;
import wx.util.WXMessageUtil;

/**
 * ClassName: WXProtocolManager
 * <p>
 * Description: WeChatEnterprise框架协议管理、分发
 * <p>
 * Copyright: Copyright (c) 2018
 * <p>
 * GitHub:<a href="https://github.com/Mr-Jiang">https://github.com/Mr-Jiang</a>
 * <p>
 * Blog: <a
 * href="https://blog.csdn.net/jspping?viewmode=contents">https://blog.csdn.
 * net/jspping?viewmode=contents</a>
 * <p>
 * Personal Home Page: <a
 * href="http://www.engineer-jsp.cn/">http://www.engineer-jsp.cn/</a>
 * 
 * @author <a href="https://github.com/Mr-Jiang">Mr-Jiang</a>
 * @date 2018.08.24 11:59
 */
public class WXProtocolManager {

	private WXProtocolManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 微信协议解析
	 * 
	 * @param DecryptMsg
	 *            解密后的请求数据
	 * @return xml响应数据
	 */
	public static String WXProtocolAnalysis(String DecryptMsg) {

		// 调用parseXml方法解析解密后的请求消息
		Map<String, String> requestMap = null;

		try {
			requestMap = WXMessageUtil.parseXml(DecryptMsg);
			if (requestMap.size() > 0) {
				return dispatchProtocol(requestMap);
			}
		} catch (Exception e) {
			System.out.println(e.getCause().toString());
		}

		return respWXTextMsgToXml(requestMap, "消息有误");
	}

	/**
	 * 协议分发
	 * 
	 * @param requestMap
	 *            参数map
	 * @return xml响应数据
	 */
	private static String dispatchProtocol(Map<String, String> requestMap) {

		WXBaseProtocol mWXBaseProtocol = null;

		try {

			// 消息类型
			String msgType = requestMap.get("MsgType");

			if (msgType == null)
				return respWXTextMsgToXml(requestMap, "未知错误");

			// 文本消息
			if (msgType.equals(WXMessageUtil.MESSAGE_TYPE_TEXT)) {
				mWXBaseProtocol = new WXTextProtocol(requestMap);
			}
			// 图片消息
			else if (msgType.equals(WXMessageUtil.MESSAGE_TYPE_IMAGE)) {
				mWXBaseProtocol = new WXImageProtocol(requestMap);
			}
			// 语音消息
			else if (msgType.equals(WXMessageUtil.MESSAGE_TYPE_VOICE)) {
				mWXBaseProtocol = new WXVoiceProtocol(requestMap);
			}
			// 视频消息
			else if (msgType.equals(WXMessageUtil.MESSAGE_TYPE_VIDEO)) {
				mWXBaseProtocol = new WXVideoProtocol(requestMap);
			}
			// 地理位置消息
			else if (msgType.equals(WXMessageUtil.MESSAGE_TYPE_LOCATION)) {
				mWXBaseProtocol = new WXLocationProtocol(requestMap);
			}
			// 链接消息
			else if (msgType.equals(WXMessageUtil.MESSAGE_TYPE_LINK)) {
				mWXBaseProtocol = new WXLinkProtocol(requestMap);
			}
			// 事件推送
			else if (msgType.equals(WXMessageUtil.MESSAGE_TYPE_EVENT)) {
				mWXBaseProtocol = new WXEventProtocol(requestMap);
			}

		} catch (Exception e) {
			System.out.println(e.getCause().toString());
		}

		if (mWXBaseProtocol != null) {
			String respXml = mWXBaseProtocol.protocolToXml();
			mWXBaseProtocol.releasProtocol();
			return respXml;
		}

		return respWXTextMsgToXml(requestMap, "未知的消息类型");
	}

	/**
	 * 返回文本消息
	 * 
	 * @param requestMap
	 *            请求参数map
	 * @param msg
	 *            要发送的文本消息
	 * @return 默认的文本消息
	 */
	protected static String respWXTextMsgToXml(Map<String, String> requestMap,
			String msg) {
		WXTextMsg mWXTextMsg = new WXTextMsg();
		mWXTextMsg.setToUserName(requestMap.get("FromUserName"));
		mWXTextMsg.setFromUserName(requestMap.get("ToUserName"));
		mWXTextMsg.setCreateTime(new Date().getTime());
		mWXTextMsg.setMsgType(WXMessageUtil.MESSAGE_TYPE_TEXT);
		mWXTextMsg.setContent(msg);
		return WXMessageUtil.WXTextMsgToXml(mWXTextMsg);
	}
}
