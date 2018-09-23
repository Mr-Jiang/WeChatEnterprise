package wx.msg;

import java.util.List;

/**
 * ClassName: News
 * <p>
 * Description: 微信news图文
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
 * @date 2018.09.05 15:22
 */
public class News {

	/** 图文消息集合 */
	private List<Article> articles;

	/**
	 * 获取图文消息集合
	 * 
	 * @return 图文消息集合
	 */
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * 设置图文消息集合
	 * 
	 * @param articles
	 *            图文消息集合
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	/**
	 * 图文消息单元类
	 */
	public static class Article {

		/** 标题，不超过128个字节，超过会自动截断 */
		private String title;

		/** 描述，不超过512个字节，超过会自动截断 */
		private String description;

		/** 点击后跳转的链接 */
		private String url;

		/** 图文消息的图片链接，支持JPG、PNG格式，较好的效果为大图 640x320，小图80x80 */
		private String picurl;

		/**
		 * 按钮文字，仅在图文数为1条时才生效。 默认为“阅读全文”，
		 * 不超过4个文字，超过自动截断。该设置只在企业微信上生效，微工作台（原企业号）上不生效
		 */
		private String btntxt;

		/**
		 * 获取标题，不超过128个字节，超过会自动截断
		 * 
		 * @return 标题
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * 设置标题
		 * 
		 * @param title
		 *            标题
		 */
		public void setTitle(String title) {
			this.title = title;
		}

		/**
		 * 获取描述，不超过512个字节，超过会自动截断
		 * 
		 * @return 描述
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * 设置描述
		 * 
		 * @param description
		 *            描述
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * 获取点击后跳转的链接
		 * 
		 * @return 点击后跳转的链接
		 */
		public String getUrl() {
			return url;
		}

		/**
		 * 设置点击后跳转的链接
		 * 
		 * @param url
		 *            点击后跳转的链接
		 */
		public void setUrl(String url) {
			this.url = url;
		}

		/**
		 * 获取图文消息的图片链接，支持JPG、PNG格式，较好的效果为大图 640x320，小图80x80
		 * 
		 * @return 图文消息的图片链接
		 */
		public String getPicurl() {
			return picurl;
		}

		/**
		 * 设置图文消息的图片链接，支持JPG、PNG格式，较好的效果为大图 640x320，小图80x80
		 * 
		 * @param picurl
		 *            图文消息的图片链接
		 */
		public void setPicurl(String picurl) {
			this.picurl = picurl;
		}

		/**
		 * 获取按钮文字，仅在图文数为1条时才生效。 默认为“阅读全文”，
		 * 不超过4个文字，超过自动截断。该设置只在企业微信上生效，微工作台（原企业号）上不生效
		 * 
		 * @return 按钮文字
		 */
		public String getBtntxt() {
			return btntxt;
		}

		/**
		 * 设置按钮文字，仅在图文数为1条时才生效。 默认为“阅读全文”，
		 * 不超过4个文字，超过自动截断。该设置只在企业微信上生效，微工作台（原企业号）上不生效
		 * 
		 * @param btntxt
		 *            按钮文字
		 */
		public void setBtntxt(String btntxt) {
			this.btntxt = btntxt;
		}
	}
}
