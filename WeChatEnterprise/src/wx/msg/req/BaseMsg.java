package wx.msg.req;

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
 * @date 2018.09.03 15:54
 */
public class BaseMsg {

	/** 成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个）。特殊情况：指定为@all，则向该企业应用的全部成员发送 */
	private String touser;

	/** 部门ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数 */
	private String toparty;

	/** 标签ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数 */
	private String totag;

	/** 消息类型 */
	private String msgtype;

	/** 企业应用的id */
	private int agentid;

	/** 表示是否是保密消息，0表示否，1表示是，默认0 */
	private int safe;

	/**
	 * 获取成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个）。特殊情况：指定为@all，则向该企业应用的全部成员发送
	 * 
	 * @return 获取成员ID列表
	 */
	public String getTouser() {
		return touser;
	}

	/**
	 * 设置成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个）。特殊情况：指定为@all，则向该企业应用的全部成员发送
	 * 
	 * @param touser
	 *            成员ID列表
	 */
	public void setTouser(String touser) {
		this.touser = touser;
	}

	/**
	 * 获取部门ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数
	 * 
	 * @return 部门ID列表
	 */
	public String getToparty() {
		return toparty;
	}

	/**
	 * 设置部门ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数
	 * 
	 * @param toparty
	 *            部门ID列表
	 */
	public void setToparty(String toparty) {
		this.toparty = toparty;
	}

	/**
	 * 获取标签ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数
	 * 
	 * @return 标签ID列表
	 */
	public String getTotag() {
		return totag;
	}

	/**
	 * 设置标签ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数
	 * 
	 * @param totag
	 *            标签ID列表
	 */
	public void setTotag(String totag) {
		this.totag = totag;
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
	 * 获取企业应用的id
	 * 
	 * @return 企业应用的id
	 */
	public int getAgentid() {
		return agentid;
	}

	/**
	 * 设置 企业应用的id
	 * 
	 * @param agentid
	 *            企业应用的id
	 */
	public void setAgentid(int agentid) {
		this.agentid = agentid;
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
