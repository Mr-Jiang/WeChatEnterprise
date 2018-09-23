package wx.msg.chat.group;

import java.util.List;

/**
 * ClassName: CreateChatGroup
 * <p>
 * Description: 微信创建群聊组
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
 * @date 2018.09.05 10:39
 */
public class CreateChatGroup extends BaseChatGroup {

	/** 群成员id列表。至少2人，至多500人 */
	private List<String> userlist;

	/**
	 * 获取群成员id列表
	 * 
	 * @return 群成员id列表
	 */
	public List<String> getUserlist() {
		return userlist;
	}

	/**
	 * 设置群成员id列表
	 * 
	 * @param userlist
	 *            群成员id列表
	 */
	public void setUserlist(List<String> userlist) {
		this.userlist = userlist;
	}

}
