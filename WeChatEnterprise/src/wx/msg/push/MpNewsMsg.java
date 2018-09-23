package wx.msg.push;

import wx.msg.MpNews;

/**
 * ClassName: MpNewsMsg
 * <p>
 * Description: mpnews图文消息
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
 * @date 2018.09.05 14:06
 */
public class MpNewsMsg extends BaseMsg {

	/** 图文消息单元类集合 */
	private MpNews mpnews;

	/**
	 * 获取图文消息单元类集合
	 * 
	 * @return 图文消息单元类集合
	 */
	public MpNews getMpnews() {
		return mpnews;
	}

	/**
	 * 设置图文消息单元类集合
	 * 
	 * @param mpnews
	 *            图文消息单元类集合
	 */
	public void setMpnews(MpNews mpnews) {
		this.mpnews = mpnews;
	}

}
