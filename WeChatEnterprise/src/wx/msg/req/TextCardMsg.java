package wx.msg.req;

import wx.msg.TextCard;

/**
 * ClassName: TextCardMsg
 * <p>
 * Description: 文本卡片消息
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
 * @date 2018.09.03 16:31
 */
public class TextCardMsg extends BaseMsg {

	/** 文本卡片消息单元类 */
	private TextCard textcard;

	/**
	 * 获取文本卡片消息单元类
	 * 
	 * @return 文本卡片消息单元类
	 */
	public TextCard getTextcard() {
		return textcard;
	}

	/**
	 * 设置文本卡片消息单元类
	 * 
	 * @param textcard
	 *            文本卡片消息单元类
	 */
	public void setTextcard(TextCard textcard) {
		this.textcard = textcard;
	}

}
