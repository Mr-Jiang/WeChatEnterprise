package wx.msg.resp;

/**
 * ClassName: WXTextMsg
 * <p>
 * Description: 微信文本类型消息(被动回复、响应的消息格式)
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
 * @date 2018.08.24 14:58
 */
public class WXTextMsg extends WXBaseMsg {

	/** 消息内容 */
	private String Content;

	/**
	 * 获取消息内容
	 * 
	 * @return 消息内容
	 */
	public String getContent() {
		return Content;
	}

	/**
	 * 设置消息内容
	 * 
	 * @param content
	 *            消息内容
	 */
	public void setContent(String content) {
		Content = content;
	}

}
