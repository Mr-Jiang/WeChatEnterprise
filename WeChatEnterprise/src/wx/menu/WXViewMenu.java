package wx.menu;

/**
 * ClassName: WXViewMenu
 * <p>
 * Description: 微信view菜单(点击之后，直接跳转到设置的url页面)
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
 * @date 2018.08.27 15:46
 */
public class WXViewMenu extends WXBaseMenu {

	/** 需要跳转的url页面地址 */
	private String url;

	/**
	 * 获取跳转的url页面地址
	 * 
	 * @return 跳转的url页面地址
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置跳转的url页面地址
	 * 
	 * @param url
	 *            跳转的url页面地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
