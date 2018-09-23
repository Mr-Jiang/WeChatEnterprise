package wx.msg.push;

/**
 * ClassName: BaseMsg
 * <p>
 * Description: 基础消息
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
 * @date 2018.09.05 11:47
 */
public class BaseMsg {

	/** 群聊id */
	private String chatid;

	/** 消息类型 */
	private String msgtype;

	/** 表示是否是保密消息，0表示否，1表示是，默认0 */
	private int safe;

	/**
	 * 获取群聊id
	 * 
	 * @return 群聊id
	 */
	public String getChatid() {
		return chatid;
	}

	/**
	 * 设置群聊id
	 * 
	 * @param chatid
	 *            群聊id
	 */
	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	/**
	 * 获取消息类型
	 * 
	 * @return 消息类型
	 */
	public String getMsgtype() {
		return msgtype;
	}

	/**
	 * 设置消息类型
	 * 
	 * @param msgtype
	 *            消息类型
	 */
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	/**
	 * 是否是保密消息，0表示否，1表示是，默认0
	 * 
	 * @return 是否是保密消息，0表示否，1表示是，默认0
	 */
	public int getSafe() {
		return safe;
	}

	/**
	 * 设置是否是保密消息，0表示否，1表示是，默认0
	 * 
	 * @param safe
	 *            是否是保密消息，0表示否，1表示是，默认0
	 */
	public void setSafe(int safe) {
		this.safe = safe;
	}
}
