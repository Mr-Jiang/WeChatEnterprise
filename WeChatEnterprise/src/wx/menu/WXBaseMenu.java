package wx.menu;

/**
 * ClassName: WXBaseMenu
 * <p>
 * Description: 微信基础菜单
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
 * @date 2018.08.27 15:36
 */
public class WXBaseMenu {

	/** 菜单名称 */
	private String name;

	/** 菜单类型 */
	private String type;

	/**
	 * 获取菜单名称
	 * 
	 * @return 菜单名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置菜单名称
	 * 
	 * @param name
	 *            菜单名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取菜单类型
	 * 
	 * @return 菜单类型
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置菜单类型
	 * 
	 * @param type
	 *            菜单类型
	 */
	public void setType(String type) {
		this.type = type;
	}
}
