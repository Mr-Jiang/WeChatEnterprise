package wx.menu;

/**
 * ClassName: WXNavigationBar
 * <p>
 * Description: 微信导航栏，应用导航栏最多只能有3个主菜单
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
 * @date 2018.08.27 16:57
 */
public class WXNavigationBar {

	/**
	 * 微信导航栏(由微信主菜单数组组成)，用于装载主菜单(最多不超过3个，若mWXMainMenus长度为0，表示该导航栏没有主菜单)
	 */
	private WXBaseMenu[] mWXMainMenus;

	/**
	 * 获取微信导航栏(由微信主菜单数组组成)
	 * 
	 * @return 微信导航栏(由微信主菜单数组组成)
	 */
	public WXBaseMenu[] getButton() {
		return mWXMainMenus;
	}

	/**
	 * 设置微信导航栏(由微信主菜单数组组成)
	 * 
	 * @param mWXMainMenus
	 *            微信导航栏(由微信主菜单数组组成)
	 */
	public void setButton(WXBaseMenu[] mWXMainMenus) {
		this.mWXMainMenus = mWXMainMenus;
	}
}
