package wx.msg.push;

import wx.msg.File;

/**
 * ClassName: FileMsg
 * <p>
 * Description: 文件消息
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
 * @date 2018.09.05 14:02
 */
public class FileMsg extends BaseMsg {

	/** 文件消息单元类 */
	private File file;

	/**
	 * 获取文件消息单元类
	 * 
	 * @return 文件消息单元类
	 */
	public File getFile() {
		return file;
	}

	/**
	 * 设置文件消息单元类
	 * 
	 * @param file
	 *            文件消息单元类
	 */
	public void setFile(File file) {
		this.file = file;
	}

}
