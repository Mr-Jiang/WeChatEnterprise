package wx.contact;

/**
 * ClassName: Party
 * <p>
 * Description: 部门
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
 * @date 2018.09.07 11:50
 */
public class Party {

	/** 部门名称。长度限制为1~32个字符，字符不能包括\:?”<>｜ */
	private String name;

	/** 父部门id，32位整型 */
	private int parentid;

	/** 在父部门中的次序值。order值大的排序靠前。有效的值范围是[0, 2^32) */
	private int order;

	/** 部门id，32位整型，指定时必须大于1。若不填该参数，将自动生成id */
	private int id;

	/**
	 * 获取部门名称
	 * 
	 * @return 部门名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置部门名称。长度限制为1~32个字符，字符不能包括\:?”<>｜
	 * 
	 * @param name
	 *            部门名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取父部门id，32位整型
	 * 
	 * @return 父部门id
	 */
	public int getParentid() {
		return parentid;
	}

	/**
	 * 设置父部门id，32位整型
	 * 
	 * @param parentid
	 *            父部门id
	 */
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	/**
	 * 获取在父部门中的次序值
	 * 
	 * @return 在父部门中的次序值
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * 设置在父部门中的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
	 * 
	 * @param order
	 *            在父部门中的次序值
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * 获取部门id
	 * 
	 * @return 部门id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置部门id，32位整型，指定时必须大于1。若不填该参数，将自动生成id
	 * 
	 * @param id
	 *            部门id
	 */
	public void setId(int id) {
		this.id = id;
	}

}
