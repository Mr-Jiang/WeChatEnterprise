package wx.msg.req;

import wx.msg.Image;

/**
 * ClassName: ImageMsg
 * <p>
 * Description: 图片消息
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
 * @date 2018.09.03 16:17
 */
public class ImageMsg extends BaseMsg {

	/** 图片消息单元类 */
	private Image image;

	/**
	 * 图片消息单元类
	 * 
	 * @return 图片消息单元类
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * 设置图片消息单元类
	 * 
	 * @param image
	 *            图片消息单元类
	 */
	public void setImage(Image image) {
		this.image = image;
	}

}
