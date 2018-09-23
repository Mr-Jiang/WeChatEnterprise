package wx.msg;

/**
 * ClassName: Video
 * <p>
 * Description: 微信视频
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
 * @date 2018.09.05 15:18
 */
public class Video {

	/** 视频媒体文件id，可以调用上传临时素材接口获取 */
	private String media_id;

	/** 视频消息的标题，不超过128个字节，超过会自动截断 */
	private String title;

	/** 视频消息的描述，不超过512个字节，超过会自动截断 */
	private String description;

	/**
	 * 获取视频媒体文件id
	 * 
	 * @return 视频媒体文件id
	 */
	public String getMedia_id() {
		return media_id;
	}

	/**
	 * 设置视频媒体文件id
	 * 
	 * @param media_id
	 *            视频媒体文件id
	 */
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	/**
	 * 获取视频消息的标题
	 * 
	 * @return 视频消息的标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置 视频消息的标题
	 * 
	 * @param title
	 *            视频消息的标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取视频消息的描述
	 * 
	 * @return 视频消息的描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置视频消息的描述
	 * 
	 * @param description
	 *            视频消息的描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
