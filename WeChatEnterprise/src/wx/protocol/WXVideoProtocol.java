package wx.protocol;

import java.util.Map;

/**
 * ClassName: WXVideoProtocol
 * <p>
 * Description: WeChatEnterprise框架视频消息协议
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
 * @date 2018.08.24 17:24
 */
public class WXVideoProtocol extends WXBaseProtocol {

	/**
	 * 视频消息协议构造方法
	 * 
	 * @param requestMap
	 */
	protected WXVideoProtocol(Map<String, String> requestMap) {
		super(requestMap);
		// 微信视频协议分发
		dispatchWXVideoProtocol();
	}

	/**
	 * 微信视频协议分发
	 */
	private void dispatchWXVideoProtocol() {
		// 响应给关注者的文本内容
		respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "您发送的是视频消息");
	}

}
