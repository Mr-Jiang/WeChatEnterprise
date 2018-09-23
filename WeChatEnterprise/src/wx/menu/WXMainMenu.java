package wx.menu;

/**
 * ClassName: WXMainMenu
 * <p>
 * Description: 微信主菜单，应用主菜单最多只能有5个子菜单
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
 * @date 2018.08.27 15:54
 */
public class WXMainMenu extends WXBaseMenu {

	/**
	 * 微信主菜单(由微信基础菜单数组组成)，用于装载主菜单下的子菜单(最多不超过5个，若mWXBaseMenus长度为0，表示该主菜单没有子菜单)
	 */
	private WXBaseMenu[] mWXBaseMenus;

	/**
	 * 获取微信主菜单(由微信基础菜单数组组成)
	 * 
	 * @return 微信主菜单(由微信基础菜单数组组成)
	 */
	public WXBaseMenu[] getSub_button() {
		return mWXBaseMenus;
	}

	/**
	 * 设置微信主菜单(由微信基础菜单数组组成)
	 * 
	 * @param mainMenus
	 *            微信主菜单(由微信基础菜单数组组成)
	 */
	public void setSub_button(WXBaseMenu[] mWXBaseMenus) {
		this.mWXBaseMenus = mWXBaseMenus;
	}
}
