package wx.contact;

import java.util.List;

/**
 * ClassName: TagUser
 * <p>
 * Description: 标签成员
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
 * @date 2018.09.11 10:50
 */
public class TagUser {

	/** 标签id，非负整型，指定此参数时新增的标签会生成对应的标签id，不指定时则以目前最大的id自增 */
	private int tagid;

	/** 企业成员ID列表，注意：userlist、partylist不能同时为空 */
	private List<String> userlist;

	/** 企业部门ID列表，注意：userlist、partylist不能同时为空 */
	private List<Integer> partylist;

	/**
	 * 获取标签id
	 * 
	 * @return 标签id
	 */
	public int getTagid() {
		return tagid;
	}

	/**
	 * 设置标签id，非负整型，指定此参数时新增的标签会生成对应的标签id，不指定时则以目前最大的id自增
	 * 
	 * @param tagid
	 *            标签id
	 */
	public void setTagid(int tagid) {
		this.tagid = tagid;
	}

	/**
	 * 获取企业成员ID列表
	 * 
	 * @return 企业成员ID列表
	 */
	public List<String> getUserlist() {
		return userlist;
	}

	/**
	 * 设置企业成员ID列表
	 * 
	 * @param userlist
	 *            企业成员ID列表
	 */
	public void setUserlist(List<String> userlist) {
		this.userlist = userlist;
	}

	/**
	 * 获取企业部门ID列表
	 * 
	 * @return 企业部门ID列表
	 */
	public List<Integer> getPartylist() {
		return partylist;
	}

	/**
	 * 设置企业部门ID列表
	 * 
	 * @param partylist
	 *            企业部门ID列表
	 */
	public void setPartylist(List<Integer> partylist) {
		this.partylist = partylist;
	}

}
