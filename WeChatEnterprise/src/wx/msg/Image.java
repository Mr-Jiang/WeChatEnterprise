package wx.msg;

/**
 * ClassName: Image
 * <p>
 * Description: 微信图片
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
 * @date 2018.09.05 15:15
 */
public class Image {

	/** 图片媒体文件id，可以调用上传临时素材接口获取 */
	private String media_id;

	/**
	 * 获取图片媒体文件id
	 * 
	 * @return 图片媒体文件id
	 */
	public String getMedia_id() {
		return media_id;
	}

	/**
	 * 设置图片媒体文件id
	 * 
	 * @param media_id
	 *            图片媒体文件id
	 */
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
}
