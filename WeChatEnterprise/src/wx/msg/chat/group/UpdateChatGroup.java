package wx.msg.chat.group;

import java.util.List;

/**
 * ClassName: UpdateChatGroup
 * <p>
 * Description: 微信修改更新群聊组
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
 * @date 2018.09.05 10:40
 */
public class UpdateChatGroup extends BaseChatGroup {

	/** 添加成员的id列表 */
	private List<String> add_user_list;

	/** 踢出成员的id列表 */
	private List<String> del_user_list;

	/**
	 * 获取添加成员的id列表
	 * 
	 * @return 添加成员的id列表
	 */
	public List<String> getAdd_user_list() {
		return add_user_list;
	}

	/**
	 * 设置添加成员的id列表
	 * 
	 * @param add_user_list
	 *            添加成员的id列表
	 */
	public void setAdd_user_list(List<String> add_user_list) {
		this.add_user_list = add_user_list;
	}

	/**
	 * 获取踢出成员的id列表
	 * 
	 * @return 踢出成员的id列表
	 */
	public List<String> getDel_user_list() {
		return del_user_list;
	}

	/**
	 * 设置踢出成员的id列表
	 * 
	 * @param add_user_list
	 *            踢出成员的id列表
	 */
	public void setDel_user_list(List<String> del_user_list) {
		this.del_user_list = del_user_list;
	}

}
