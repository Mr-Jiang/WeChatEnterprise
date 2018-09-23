package wx.msg.req;

import wx.msg.News;

/**
 * ClassName: NewsMsg
 * <p>
 * Description: news图文消息
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
 * @date 2018.09.03 16:42
 */
public class NewsMsg extends BaseMsg {

	/** 图文消息单元类集合 */
	private News news;

	/**
	 * 获取图文消息单元类集合
	 * 
	 * @return 图文消息单元类集合
	 */
	public News getNews() {
		return news;
	}

	/**
	 * 设置图文消息单元类集合
	 * 
	 * @param news
	 *            图文消息单元类集合
	 */
	public void setNews(News news) {
		this.news = news;
	}

}
