package wx.msg.chat.group;

/**
 * ClassName: BaseChatGroup
 * <p>
 * Description: 微信基础群聊组
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
 * @date 2018.09.05 10:29
 */
public class BaseChatGroup {

	/** 群聊名 */
	private String name;

	/** 指定群主的id。如果不指定，系统会随机从userlist中选一人作为群主 */
	private String owner;

	/** 群聊的唯一标志，不能与已有的群重复；字符串类型，最长32个字符。只允许字符0-9及字母a-zA-Z。如果不填，系统会随机生成群id */
	private String chatid;

	/**
	 * 获取群聊名
	 * 
	 * @return 群聊名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置群聊名
	 * 
	 * @param name
	 *            群聊名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取群主的id
	 * 
	 * @return 群主的id
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * 设置群主的id
	 * 
	 * @param owner
	 *            群主的id
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * 获取群聊的唯一标志
	 * 
	 * @return 群聊的唯一标志
	 */
	public String getChatid() {
		return chatid;
	}

	/**
	 * 设置群聊的唯一标志
	 * 
	 * @param chatid
	 *            群聊的唯一标志
	 */
	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

}
