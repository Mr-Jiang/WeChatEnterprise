package wx.menu;

/**
 * ClassName: WXClickMenu
 * <p>
 * Description: 微信点击菜单
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
 * @date 2018.08.27 15:43
 */
public class WXClickMenu extends WXBaseMenu {

	/** key值 */
	private String key;

	/**
	 * 获取key值
	 * 
	 * @return key值
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 设置key值
	 * 
	 * @param key
	 *            key值
	 */
	public void setKey(String key) {
		this.key = key;
	}
}
