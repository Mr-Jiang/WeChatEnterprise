package wx.contact;

import java.util.List;

/**
 * ClassName: User
 * <p>
 * Description: 成员
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
 * @date 2018.09.11 14:14
 */
public class User {

	/** 成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节 */
	private String userid;

	/** 成员名称。长度为1~64个字符 */
	private String name;

	/** 成员别名。长度1~32个字符 */
	private String alias;

	/** 手机号码。企业内必须唯一，mobile/email二者不能同时为空 */
	private String mobile;

	/** 成员所属部门id列表,不超过20个 */
	private List<Integer> department;

	/**
	 * 部门内的排序值，默认为0，成员次序以创建时间从小到大排列。数量必须和department一致，数值越大排序越前面。有效的值范围是[0, 2^32)
	 */
	private List<Integer> order;

	/** 职务信息。长度为0~128个字符 */
	private String position;

	/** 性别。1表示男性，2表示女性 */
	private String gender;

	/** 邮箱。长度不超过64个字节，且为有效的email格式。企业内必须唯一，mobile/email二者不能同时为空 */
	private String email;

	/** 座机。由1-32位的纯数字或’-‘号组成。 */
	private String telephone;

	/** 上级字段，标识是否为上级。在审批等应用里可以用来标识上级审批人 */
	private int isleader;

	/** 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid */
	private String avatar_mediaid;

	/** 启用/禁用成员。1表示启用成员，0表示禁用成员 */
	private int enable;

	/** 自定义字段-拓展属性 */
	private Extattr extattr;

	/** 是否邀请该成员使用企业微信（将通过微信服务通知或短信或邮件下发邀请，每天自动下发一次，最多持续3个工作日），默认值为true */
	private boolean to_invite = true;

	/** 成员对外属性 */
	private ExternalProfile external_profile;

	/**
	 * 获取成员UserID
	 * 
	 * @return 成员UserID
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 设置成员UserID
	 * 
	 * @param userid
	 *            成员UserID
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获取成员名称
	 * 
	 * @return 成员名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置成员名称
	 * 
	 * @param name
	 *            成员名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取成员别名
	 * 
	 * @return 成员别名
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * 设置成员别名
	 * 
	 * @param alias
	 *            成员别名
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * 获取手机号码
	 * 
	 * @return 手机号码
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置手机号码
	 * 
	 * @param mobile
	 *            手机号码
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取成员所属部门id列表
	 * 
	 * @return 成员所属部门id列表
	 */
	public List<Integer> getDepartment() {
		return department;
	}

	/**
	 * 设置成员所属部门id列表
	 * 
	 * @param department
	 *            成员所属部门id列表
	 */
	public void setDepartment(List<Integer> department) {
		this.department = department;
	}

	/**
	 * 获取部门内的排序值
	 * 
	 * @return 部门内的排序值
	 */
	public List<Integer> getOrder() {
		return order;
	}

	/**
	 * 设置部门内的排序值
	 * 
	 * @param order
	 *            部门内的排序值
	 */
	public void setOrder(List<Integer> order) {
		this.order = order;
	}

	/**
	 * 获取职务信息
	 * 
	 * @return 职务信息
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * 设置职务信息
	 * 
	 * @param position
	 *            职务信息
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * 获取性别，1表示男性，2表示女性
	 * 
	 * @return 性别，1表示男性，2表示女性
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 设置性别，1表示男性，2表示女性
	 * 
	 * @param gender
	 *            性别，1表示男性，2表示女性
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 获取邮箱
	 * 
	 * @return 邮箱
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置邮箱
	 * 
	 * @param email
	 *            邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取座机
	 * 
	 * @return 座机
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * 设置座机
	 * 
	 * @param telephone
	 *            座机
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * 获取上级字段
	 * 
	 * @return 上级字段
	 */
	public int getIsleader() {
		return isleader;
	}

	/**
	 * 设置上级字段
	 * 
	 * @param isleader
	 *            上级字段
	 */
	public void setIsleader(int isleader) {
		this.isleader = isleader;
	}

	/**
	 * 获取成员头像的mediaid
	 * 
	 * @return 成员头像的mediaid
	 */
	public String getAvatar_mediaid() {
		return avatar_mediaid;
	}

	/**
	 * 设置成员头像的mediaid
	 * 
	 * @param avatar_mediaid
	 *            成员头像的mediaid
	 */
	public void setAvatar_mediaid(String avatar_mediaid) {
		this.avatar_mediaid = avatar_mediaid;
	}

	/**
	 * 获取启用/禁用成员
	 * 
	 * @return 启用/禁用成员。1表示启用成员，0表示禁用成员
	 */
	public int getEnable() {
		return enable;
	}

	/**
	 * 设置启用/禁用成员。1表示启用成员，0表示禁用成员
	 * 
	 * @param enable
	 *            启用/禁用成员。1表示启用成员，0表示禁用成员
	 */
	public void setEnable(int enable) {
		this.enable = enable;
	}

	/**
	 * 获取自定义字段-拓展属性
	 * 
	 * @return 自定义字段-拓展属性
	 */
	public Extattr getExtattr() {
		return extattr;
	}

	/**
	 * 设置自定义字段-拓展属性
	 * 
	 * @param extattr
	 *            自定义字段-拓展属性
	 */
	public void setExtattr(Extattr extattr) {
		this.extattr = extattr;
	}

	/**
	 * 获取是否邀请该成员使用企业微信，默认值为true
	 * 
	 * @return 是否邀请该成员使用企业微信，默认值为true
	 */
	public boolean getTo_invite() {
		return to_invite;
	}

	/**
	 * 设置是否邀请该成员使用企业微信，默认值为true
	 * 
	 * @param to_invite
	 *            是否邀请该成员使用企业微信，默认值为true
	 */
	public void setTo_invite(boolean to_invite) {
		this.to_invite = to_invite;
	}

	/**
	 * 获取成员对外属性
	 * 
	 * @return 成员对外属性
	 */
	public ExternalProfile getExternal_profile() {
		return external_profile;
	}

	/**
	 * 设置成员对外属性
	 * 
	 * @param external_profile
	 *            成员对外属性
	 */
	public void setExternal_profile(ExternalProfile external_profile) {
		this.external_profile = external_profile;
	}

	/**
	 * 拓展属性
	 */
	public static class Extattr {

		/** 属性子项集合 */
		private List<AttrsItem> attrs;

		/**
		 * 获取属性子项集合
		 * 
		 * @return 属性子项集合
		 */
		public List<AttrsItem> getAttrs() {
			return attrs;
		}

		/**
		 * 设置属性子项集合
		 * 
		 * @param attrs
		 *            属性子项集合
		 */
		public void setAttrs(List<AttrsItem> attrs) {
			this.attrs = attrs;
		}

	}

	/**
	 * 属性子项
	 */
	public static class AttrsItem {

		/** 名称 */
		private String name;

		/** 值 */
		private String value;

		/**
		 * 获取名称
		 * 
		 * @return 名称
		 */
		public String getName() {
			return name;
		}

		/**
		 * 设置名称
		 * 
		 * @param name
		 *            名称
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * 获取值
		 * 
		 * @return 值
		 */
		public String getValue() {
			return value;
		}

		/**
		 * 设置值
		 * 
		 * @param value
		 *            值
		 */
		public void setValue(String value) {
			this.value = value;
		}

	}

	/**
	 * 成员对外属性
	 */
	public static class ExternalProfile {

		/** 成员对外属性集合 */
		private List<BaseAttr> external_attr;

		/**
		 * 获取成员对外属性集合
		 * 
		 * @return 成员对外属性集合
		 */
		public List<BaseAttr> getExternal_attr() {
			return external_attr;
		}

		/**
		 * 设设置成员对外属性集合
		 * 
		 * @param external_attr
		 *            成员对外属性集合
		 */
		public void setExternal_attr(List<BaseAttr> external_attr) {
			this.external_attr = external_attr;
		}

	}

}
