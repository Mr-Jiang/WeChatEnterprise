package wx.msg.resp;

/**
 * ClassName: WXVideoMsg
 * <p>
 * Description: 微信视频类型消息(被动回复、响应的消息格式)
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
 * @date 2018.08.24 15:18
 */
public class WXVideoMsg extends WXBaseMsg {

	/** 视频类型单元 */
	private Video Video;

	/**
	 * 获取视频类型单元
	 * 
	 * @return 视频类型单元
	 */
	public Video getVideo() {
		return Video;
	}

	/**
	 * 设置视频类型单元
	 * 
	 * @param video
	 *            视频类型单元
	 */
	public void setVideo(Video video) {
		Video = video;
	}

	/**
	 * 视频类型单元
	 */
	public static class Video {

		/** 媒体文件id */
		private String MediaId;

		/** 视频消息的标题 */
		private String Title;

		/** 视频消息的描述 */
		private String Description;

		/**
		 * 获取媒体文件id
		 * 
		 * @return 媒体文件id
		 */
		public String getMediaId() {
			return MediaId;
		}

		/**
		 * 设置媒体文件id
		 * 
		 * @param mediaId
		 *            媒体文件id
		 */
		public void setMediaId(String mediaId) {
			MediaId = mediaId;
		}

		/**
		 * 获取视频消息的标题
		 * 
		 * @return 视频消息的标题
		 */
		public String getTitle() {
			return Title;
		}

		/**
		 * 设置视频消息的标题
		 * 
		 * @param title
		 *            视频消息的标题
		 */
		public void setTitle(String title) {
			Title = title;
		}

		/**
		 * 获取视频消息的描述
		 * 
		 * @return 视频消息的描述
		 */
		public String getDescription() {
			return Description;
		}

		/**
		 * 设置视频消息的描述
		 * 
		 * @param description
		 *            视频消息的描述
		 */
		public void setDescription(String description) {
			Description = description;
		}

	}
}
