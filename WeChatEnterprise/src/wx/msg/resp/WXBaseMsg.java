package wx.msg.resp;

/**
 * ClassName: WXBaseMsg
 * <p>
 * Description: 微信基础类型消息(被动回复、响应的消息格式)
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
 * @date 2018.08.24 14:24
 */
public class WXBaseMsg {

	/** 接收方账号，收到的OpenID */
	private String ToUserName;

	/** 发送方账号 */
	private String FromUserName;

	/** 消息创建时间 ，长整型 */
	private long CreateTime;

	/** 消息类型 */
	private String MsgType;

	/**
	 * 获取接收方账号
	 * 
	 * @return 接收方账号
	 */
	public String getToUserName() {
		return ToUserName;
	}

	/**
	 * 设置接收方账号
	 * 
	 * @param toUserName
	 *            接收方账号
	 */
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	/**
	 * 获取发送方账号
	 * 
	 * @return 发送方账号
	 */
	public String getFromUserName() {
		return FromUserName;
	}

	/**
	 * 设置发送方账号
	 * 
	 * @param fromUserName
	 *            发送方账号
	 */
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	/**
	 * 获取消息创建时间
	 * 
	 * @return 消息创建时间
	 */
	public long getCreateTime() {
		return CreateTime;
	}

	/**
	 * 设置消息创建时间
	 * 
	 * @param createTime
	 *            消息创建时间
	 */
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	/**
	 * 获取消息类型
	 * 
	 * @return 消息类型
	 */
	public String getMsgType() {
		return MsgType;
	}

	/**
	 * 设置消息类型
	 * 
	 * @param msgType
	 *            消息类型
	 */
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

}
