package wx.msg.req;

import wx.msg.Text;

/**
 * ClassName: TextMsg
 * <p>
 * Description: 文本消息
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
 * @date 2018.09.03 16:11
 */
public class TextMsg extends BaseMsg {

	/** 文本消息单元类 */
	private Text text;

	/**
	 * 获取文本消息单元类
	 * 
	 * @return 文本消息单元类
	 */
	public Text getText() {
		return text;
	}

	/**
	 * 设置文本消息单元类
	 * 
	 * @param text
	 *            文本消息单元类
	 */
	public void setText(Text text) {
		this.text = text;
	}

}
