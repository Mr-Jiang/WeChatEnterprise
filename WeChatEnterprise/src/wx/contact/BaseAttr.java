package wx.contact;

/**
 * ClassName: BaseAttr
 * <p>
 * Description: 成员对外属性-基类
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
 * @date 2018.09.11 16:33
 */
public class BaseAttr {

	/** 属性类型: 0-本文 1-网页 2-小程序 */
	private int type;

	/** 属性名称： 需要先确保在管理端有创建改属性，否则会忽略 */
	private String name;

	/**
	 * 获取属性类型
	 * 
	 * @return 属性类型
	 */
	public int getType() {
		return type;
	}

	/**
	 * 设置属性类型: 0-本文 1-网页 2-小程序
	 * 
	 * @param type
	 *            属性类型: 0-本文 1-网页 2-小程序
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * 获取属性名称
	 * 
	 * @return 属性名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置属性名称： 需要先确保在管理端有创建改属性，否则会忽略
	 * 
	 * @param name
	 *            属性名称： 需要先确保在管理端有创建改属性，否则会忽略
	 */
	public void setName(String name) {
		this.name = name;
	}

}
