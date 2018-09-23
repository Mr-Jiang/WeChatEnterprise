package wx.msg;

/**
 * ClassName: File
 * <p>
 * Description: 微信文件
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
 * @date 2018.09.05 15:20
 */
public class File {

	/** 文件id，可以调用上传临时素材接口获取 */
	private String media_id;

	/**
	 * 获取文件id
	 * 
	 * @return 文件id
	 */
	public String getMedia_id() {
		return media_id;
	}

	/**
	 * 设置文件id
	 * 
	 * @param media_id
	 *            文件id
	 */
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
}
