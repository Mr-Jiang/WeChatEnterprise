package wx.protocol;

import java.util.Map;

/**
 * ClassName: WXLocationProtocol
 * <p>
 * Description: WeChatEnterprise框架位置消息协议
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
 * @date 2018.08.24 17:26
 */
public class WXLocationProtocol extends WXBaseProtocol {

	/**
	 * 位置消息协议构造方法
	 * 
	 * @param requestMap
	 */
	protected WXLocationProtocol(Map<String, String> requestMap) {
		super(requestMap);
		// 微信位置协议分发
		dispatchWXLocationProtocol();
	}

	/**
	 * 微信位置协议下分发
	 */
	private void dispatchWXLocationProtocol() {
		// 响应给关注者的文本内容
		respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "您发送的是位置消息");
	}
}
