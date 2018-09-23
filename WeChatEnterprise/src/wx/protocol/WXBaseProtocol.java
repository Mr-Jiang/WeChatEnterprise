package wx.protocol;

import java.util.Map;

/**
 * ClassName: WXBaseProtocol
 * <p>
 * Description: WeChatEnterprise框架基础协议
 * <p>
 * Copyright: Copyright (c) 2018
 * <p>
 * GitHub:<a href="https://github.com/Mr-Jiang">https://github.com/Mr-Jiang</a>
 * <p>
 * Blog:
 * <a href="https://blog.csdn.net/jspping?viewmode=contents">https://blog.csdn.
 * net/jspping?viewmode=contents</a>
 * <p>
 * Personal Home Page:
 * <a href="http://www.engineer-jsp.cn/">http://www.engineer-jsp.cn/</a>
 * 
 * @author <a href="https://github.com/Mr-Jiang">Mr-Jiang</a>
 * @date 2018.08.24 16:55
 */
public abstract class WXBaseProtocol {

	/** 请求参数的缓存 */
	protected Map<String, String> requestMap;

	/** 发送方帐号 */
	protected String FromUserName;

	/** 接收方帐号 */
	protected String ToUserName;

	/** 消息类型 */
	protected String MsgType;

	/** 关注者发送的消息 */
	protected String Content;

	/** 事件类型 */
	protected String Event;

	/** 事件KEY值 */
	protected String EventKey;

	/** 通讯录更改事件类型 */
	protected String ChangeType;

	/** xml格式的响应消息数据 */
	protected String respXml;

	/**
	 * 基础协议的构造方法
	 * 
	 * @param requestMap
	 */
	protected WXBaseProtocol(Map<String, String> requestMap) {

		this.requestMap = requestMap;

		// 发送方帐号
		FromUserName = requestMap.get("FromUserName");
		// 开发者微信号
		ToUserName = requestMap.get("ToUserName");
		// 消息类型
		MsgType = requestMap.get("MsgType");

		// 关注者发送的消息
		Content = requestMap.get("Content");
		// 关注者发送的消息
		Event = requestMap.get("Event");
		// 关注者发送的消息
		EventKey = requestMap.get("EventKey");
		// 通讯录更改事件类型
		ChangeType = requestMap.get("ChangeType");
	}

	/**
	 * 协议转换成xml
	 * 
	 * @return xml
	 */
	protected String protocolToXml() {
		return respXml;
	}

	/**
	 * 释放当前协议场景
	 */
	protected void releasProtocol() {
		respXml = null;
	}

}
