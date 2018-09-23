package wx.msg.resp;

import java.util.List;

/**
 * ClassName: WXArticleMsg
 * <p>
 * Description: 微信图文类型消息(被动回复、响应的消息格式)
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
 * @date 2018.08.24 15:19
 */
public class WXArticleMsg extends WXBaseMsg {

	/** 图文消息的数量，限制为10条以内 */
	private int ArticleCount;

	/** 多条图文消息信息，默认第一个item为大图 */
	private List<Article> Articles;

	/**
	 * 获取图文消息的数量
	 * 
	 * @return 图文消息的数量
	 */
	public int getArticleCount() {
		return ArticleCount;
	}

	/**
	 * 设置图文消息的数量
	 * 
	 * @param articleCount
	 *            图文消息的数量
	 */
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	/**
	 * 获取图文列表
	 * 
	 * @return 图文列表
	 */
	public List<Article> getArticles() {
		return Articles;
	}

	/**
	 * 设置图文列表
	 * 
	 * @param news
	 *            图文列表
	 */
	public void setArticles(List<Article> articles) {
		Articles = articles;
	}

	/**
	 * 图文类型单元
	 */
	public static class Article {

		/** 图文标题 */
		private String Title;

		/** 图文描述 */
		private String Description;

		/**
		 * 图片链接，支持JPG、PNG格式，较好的效果为大图640*320，小图80*80，
		 * 限制图片链接的域名需要与开发者填写的基本资料中的Url一致
		 */
		private String PicUrl;

		/** 点击图文消息跳转链接 */
		private String Url;

		/**
		 * 获取图文标题
		 * 
		 * @return 图文标题
		 */
		public String getTitle() {
			return Title;
		}

		/**
		 * 设置图文标题
		 * 
		 * @param title
		 *            图文标题
		 */
		public void setTitle(String title) {
			Title = title;
		}

		/**
		 * 获取图文描述
		 * 
		 * @return 图文描述
		 */
		public String getDescription() {
			return null == Description ? "" : Description;
		}

		/**
		 * 设置图文描述
		 * 
		 * @param description
		 *            图文描述
		 */
		public void setDescription(String description) {
			Description = description;
		}

		/**
		 * 获取图片链接
		 * 
		 * @return 图片链接
		 */
		public String getPicUrl() {
			return null == PicUrl ? "" : PicUrl;
		}

		/**
		 * 设置图片链接
		 * 
		 * @param picUrl
		 *            图片链接
		 */
		public void setPicUrl(String picUrl) {
			PicUrl = picUrl;
		}

		/**
		 * 获取点击图文消息跳转链接
		 * 
		 * @return 点击图文消息跳转链接
		 */
		public String getUrl() {
			return null == Url ? "" : Url;
		}

		/**
		 * 设置点击图文消息跳转链接
		 * 
		 * @param url
		 *            点击图文消息跳转链接
		 */
		public void setUrl(String url) {
			Url = url;
		}

	}
}
