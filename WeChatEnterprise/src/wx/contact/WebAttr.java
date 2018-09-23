package wx.contact;

/**
 * ClassName: WebAttr
 * <p>
 * Description: 成员对外属性-Web类型
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
 * @date 2018.09.11 16:42
 */
public class WebAttr extends BaseAttr {

	/** web属性 */
	private Web web;

	/**
	 * 获取web属性
	 * 
	 * @return web属性
	 */
	public Web getWeb() {
		return web;
	}

	/**
	 * 设置web属性
	 * 
	 * @param web
	 *            web属性
	 */
	public void setWeb(Web web) {
		this.web = web;
	}

	/**
	 * web属性
	 */
	public static class Web {

		/** 网页的url,必须包含http或者https头 */
		private String url;

		/** 网页的展示标题,长度限制12个UTF8字符 */
		private String title;

		/**
		 * 获取网页的url
		 * 
		 * @return 网页的url
		 */
		public String getUrl() {
			return url;
		}

		/**
		 * 设置网页的url,必须包含http或者https头
		 * 
		 * @param url
		 *            网页的url,必须包含http或者https头
		 */
		public void setUrl(String url) {
			this.url = url;
		}

		/**
		 * 获取设置网页的展示标题
		 * 
		 * @return 设置网页的展示标题
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * 设置网页的展示标题,长度限制12个UTF8字符
		 * 
		 * @param title
		 *            网页的展示标题,长度限制12个UTF8字符
		 */
		public void setTitle(String title) {
			this.title = title;
		}

	}
}
