package wx.contact;

/**
 * ClassName: MiNiProgramAttr
 * <p>
 * Description: 成员对外属性-MiNiProgram类型
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
 * @date 2018.09.11 16:43
 */
public class MiNiProgramAttr extends BaseAttr {

	/** MiNiProgram属性 */
	private MiNiProgram miniprogram;

	/**
	 * 获取MiNiProgram属性
	 * 
	 * @return MiNiProgram属性
	 */
	public MiNiProgram getMiniprogram() {
		return miniprogram;
	}

	/**
	 * 设置MiNiProgram属性
	 * 
	 * @param miniprogram
	 *            MiNiProgram属性
	 */
	public void setMiniprogram(MiNiProgram miniprogram) {
		this.miniprogram = miniprogram;
	}

	/**
	 * MiNiProgram属性
	 */
	public static class MiNiProgram {

		/** 小程序appid，必须是有在本企业安装授权的小程序，否则会被忽略 */
		private String appid;

		/** 小程序的页面路径 */
		private String pagepath;

		/** 小程序的展示标题,长度限制12个UTF8字符 */
		private String title;

		/**
		 * 获取小程序appid
		 * 
		 * @return 小程序appid
		 */
		public String getAppid() {
			return appid;
		}

		/**
		 * 设置小程序appid
		 * 
		 * @param appid
		 *            小程序appid
		 */
		public void setAppid(String appid) {
			this.appid = appid;
		}

		/**
		 * 获取小程序的页面路径
		 * 
		 * @return 小程序的页面路径
		 */
		public String getPagepath() {
			return pagepath;
		}

		/**
		 * 设置小程序的页面路径
		 * 
		 * @param pagepath
		 *            小程序的页面路径
		 */
		public void setPagepath(String pagepath) {
			this.pagepath = pagepath;
		}

		/**
		 * 获取小程序的展示标题
		 * 
		 * @return 小程序的展示标题
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * 设置小程序的展示标题
		 * 
		 * @param title
		 *            小程序的展示标题
		 */
		public void setTitle(String title) {
			this.title = title;
		}

	}
}
