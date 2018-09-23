package wx.msg.req;

import wx.msg.Video;

/**
 * ClassName: VideoMsg
 * <p>
 * Description: 视频消息
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
 * @date 2018.09.03 16:22
 */
public class VideoMsg extends BaseMsg {

	/** 视频消息单元类 */
	private Video video;

	/**
	 * 获取视频消息单元类
	 * 
	 * @return 视频消息单元类
	 */
	public Video getVideo() {
		return video;
	}

	/**
	 * 设置视频消息单元类
	 * 
	 * @param video
	 *            视频消息单元类
	 */
	public void setVideo(Video video) {
		this.video = video;
	}

}
