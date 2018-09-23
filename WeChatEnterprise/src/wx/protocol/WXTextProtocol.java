package wx.protocol;

import java.util.Map;

/**
 * ClassName: WXTextProtocol
 * <p>
 * Description: WeChatEnterprise框架文本消息协议
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
 * @date 2018.08.24 17:18
 */
public class WXTextProtocol extends WXBaseProtocol {

	/**
	 * 文本消息协议构造方法
	 * 
	 * @param requestMap
	 */
	protected WXTextProtocol(Map<String, String> requestMap) {
		super(requestMap);
		// 微信文本协议分发
		dispatchWXTextProtocol();
	}

	/**
	 * 微信文本协议分发
	 */
	private void dispatchWXTextProtocol() {
		// 响应给关注者的文本内容
		respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "您发送的是文本消息，消息内容：" + Content);
	}

}
