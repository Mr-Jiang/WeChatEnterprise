package wx.protocol;

import java.util.Map;

/**
 * ClassName: WXImageProtocol
 * <p>
 * Description: WeChatEnterprise框架图片消息协议
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
 * @date 2018.08.24 17:22
 */
public class WXImageProtocol extends WXBaseProtocol {

	/**
	 * 图片消息协议构造方法
	 * 
	 * @param requestMap
	 */
	protected WXImageProtocol(Map<String, String> requestMap) {
		super(requestMap);
		// 微信图片协议分发
		dispatchWXImageProtocol();
	}

	/**
	 * 微信图片协议分发
	 */
	private void dispatchWXImageProtocol() {
		// 响应给关注者的文本内容
		respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "您发送的是图片消息");
	}
}
