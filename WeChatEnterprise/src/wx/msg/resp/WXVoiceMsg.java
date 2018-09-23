package wx.msg.resp;

/**
 * ClassName: WXVoiceMsg
 * <p>
 * Description: 微信音频类型消息(被动回复、响应的消息格式)
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
public class WXVoiceMsg extends WXBaseMsg {

	/** 音频类型单元 */
	private Voice Voice;

	/**
	 * 获取音频类型单元
	 * 
	 * @return 音频类型单元
	 */
	public Voice getVoice() {
		return Voice;
	}

	/**
	 * 设置音频类型单元
	 * 
	 * @param voice
	 *            音频类型单元
	 */
	public void setVoice(Voice voice) {
		Voice = voice;
	}

	/**
	 * 音频类型单元
	 */
	public static class Voice {

		/** 媒体文件id */
		private String MediaId;

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
	}

}
