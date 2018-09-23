package wx.msg;

import java.util.List;

/**
 * ClassName: MpNews
 * <p>
 * Description: 微信mpnews图文
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
 * @date 2018.09.05 15:25
 */
public class MpNews {

	/** 图文消息单元类集合 */
	private List<Article> articles;

	/**
	 * 获取图文消息单元类集合
	 * 
	 * @return 图文消息单元类集合
	 */
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * 设置图文消息单元类集合
	 * 
	 * @param articles
	 *            图文消息单元类集合
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

		/** 图文消息缩略图的media_id, 可以通过素材管理接口获得。此处thumb_media_id即上传接口返回的media_id */
		private String thumb_media_id;

		/** 图文消息的作者，不超过64个字节 */
		private String author;

		/** 图文消息点击“阅读原文”之后的页面链接 */
		private String content_source_url;

		/** 图文消息的内容，支持html标签，不超过666 K个字节 */
		private String content;

		/** 图文消息的描述，不超过512个字节，超过会自动截断 */
		private String digest;

		/**
		 * 获取标题，不超过128个字节，超过会自动截断
		 * 
		 * @return 标题
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * 设置标题，不超过128个字节，超过会自动截断
		 * 
		 * @param title
		 *            标题
		 */
		public void setTitle(String title) {
			this.title = title;
		}

		/**
		 * 获取图文消息缩略图的media_id, 可以通过素材管理接口获得。此处thumb_media_id即上传接口返回的media_id
		 * 
		 * @return 图文消息缩略图的media_id
		 */
		public String getThumb_media_id() {
			return thumb_media_id;
		}

		/**
		 * 设置图文消息缩略图的media_id, 可以通过素材管理接口获得。此处thumb_media_id即上传接口返回的media_id
		 * 
		 * @param thumb_media_id
		 *            图文消息缩略图的media_id
		 */
		public void setThumb_media_id(String thumb_media_id) {
			this.thumb_media_id = thumb_media_id;
		}

		/**
		 * 获取图文消息的作者，不超过64个字节
		 * 
		 * @return 图文消息的作者
		 */
		public String getAuthor() {
			return author;
		}

		/**
		 * 设置图文消息的作者，不超过64个字节
		 * 
		 * @param author
		 *            图文消息的作者
		 */
		public void setAuthor(String author) {
			this.author = author;
		}

		/**
		 * 获取图文消息点击“阅读原文”之后的页面链接
		 * 
		 * @return 图文消息点击“阅读原文”之后的页面链接
		 */
		public String getContent_source_url() {
			return content_source_url;
		}

		/**
		 * 设置图文消息点击“阅读原文”之后的页面链接
		 * 
		 * @param content_source_url
		 *            图文消息点击“阅读原文”之后的页面链接
		 */
		public void setContent_source_url(String content_source_url) {
			this.content_source_url = content_source_url;
		}

		/**
		 * 获取图文消息的内容，支持html标签，不超过666 K个字节
		 * 
		 * @return 图文消息的内容
		 */
		public String getContent() {
			return content;
		}

		/**
		 * 设置图文消息的内容，支持html标签，不超过666 K个字节
		 * 
		 * @param content
		 *            图文消息的内容
		 */
		public void setContent(String content) {
			this.content = content;
		}

		/**
		 * 获取图文消息的描述，不超过512个字节，超过会自动截断
		 * 
		 * @return 图文消息的描述
		 */
		public String getDigest() {
			return digest;
		}

		/**
		 * 设置图文消息的描述，不超过512个字节，超过会自动截断
		 * 
		 * @param digest
		 *            图文消息的描述
		 */
		public void setDigest(String digest) {
			this.digest = digest;
		}
	}
}
