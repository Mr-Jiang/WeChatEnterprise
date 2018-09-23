package wx.msg.resp;

/**
 * ClassName: WXMusicMsg
 * <p>
 * Description: 微信音乐类型消息(被动回复、响应的消息格式)
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
 * @date 2018.08.24 15:02
 */
public class WXMusicMsg extends WXBaseMsg {

	/** 音乐类型单元 */
	private Music Music;

	/**
	 * 获取音乐类型单元
	 * 
	 * @return 音乐类型单元
	 */
	public Music getMusic() {
		return Music;
	}

	/**
	 * 设置音乐类型单元
	 * 
	 * @param music
	 *            音乐类型单元
	 */
	public void setMusic(Music music) {
		Music = music;
	}

	/**
	 * 音乐类型单元
	 */
	public static class Music {

		/** 音乐名称 */
		private String Title;

		/** 音乐描述 */
		private String Description;

		/** 音乐链接 */
		private String MusicUrl;

		/** 高质量音乐链接，WIFI环境优先使用该链接播放音乐 */
		private String HQMusicUrl;

		/**
		 * 获取音乐名称
		 * 
		 * @return 音乐名称
		 */
		public String getTitle() {
			return Title;
		}

		/**
		 * 设置音乐名称
		 * 
		 * @param title
		 *            音乐名称
		 */
		public void setTitle(String title) {
			Title = title;
		}

		/**
		 * 获取音乐描述
		 * 
		 * @return 音乐描述
		 */
		public String getDescription() {
			return Description;
		}

		/**
		 * 设置音乐描述
		 * 
		 * @param description
		 *            音乐描述
		 */
		public void setDescription(String description) {
			Description = description;
		}

		/**
		 * 获取音乐链接
		 * 
		 * @return 音乐链接
		 */
		public String getMusicUrl() {
			return MusicUrl;
		}

		/**
		 * 设置音乐链接
		 * 
		 * @param musicUrl
		 *            音乐链接
		 */
		public void setMusicUrl(String musicUrl) {
			MusicUrl = musicUrl;
		}

		/**
		 * 获取高质量音乐链接
		 * 
		 * @return 高质量音乐链接
		 */
		public String getHQMusicUrl() {
			return HQMusicUrl;
		}

		/**
		 * 设置高质量音乐链接
		 * 
		 * @param musicUrl
		 *            高质量音乐链接
		 */
		public void setHQMusicUrl(String musicUrl) {
			HQMusicUrl = musicUrl;
		}

	}
}
