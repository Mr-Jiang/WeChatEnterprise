package wx.app;

/**
 * ClassName: SettingsApp
 * <p>
 * Description: 微信应用管理，设置应用
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
 * @date 2018.08.29 11:29
 */
public class SettingsApp {

	/** 企业应用的id */
	private int agentid;

	/** 企业应用是否打开地理位置上报 0：不上报；1：进入会话上报； */
	private int report_location_flag;

	/** 企业应用头像的mediaid，通过素材管理接口上传图片获得mediaid，上传后会自动裁剪成方形和圆形两个头像 */
	private String logo_mediaid;

	/** 企业应用名称，长度不超过32个字符 */
	private String name;

	/** 企业应用详情，长度为4至120个字符 */
	private String description;

	/** 企业应用可信域名。注意：域名需通过所有权校验，否则jssdk功能将受限，此时返回错误码85005 */
	private String redirect_domain;

	/** 是否上报用户进入应用事件。0：不接收；1：接收。 */
	private int isreportenter;

	/** 应用主页url。url必须以http或者https开头。 */
	private String home_url;

	/**
	 * 获取企业应用的id
	 * 
	 * @return 企业应用的id
	 */
	public int getAgentid() {
		return agentid;
	}

	/**
	 * 设置企业应用的id
	 * 
	 * @param agentid
	 *            企业应用的id
	 */
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}

	/**
	 * 获取地理位置上报值，0：不上报；1：进入会话上报；
	 * 
	 * @return 地理位置上报值，0：不上报；1：进入会话上报；
	 */
	public int getReport_location_flag() {
		return report_location_flag;
	}

	/**
	 * 设置地理位置上报值，0：不上报；1：进入会话上报；
	 * 
	 * @param report_location_flag
	 *            地理位置上报值，0：不上报；1：进入会话上报；
	 */
	public void setReport_location_flag(int report_location_flag) {
		this.report_location_flag = report_location_flag;
	}

	/**
	 * 获取企业应用头像的mediaid
	 * 
	 * @return 企业应用头像的mediaid
	 */
	public String getLogo_mediaid() {
		return logo_mediaid;
	}

	/**
	 * 设置企业应用头像的mediaid
	 * 
	 * @param logo_mediaid
	 *            企业应用头像的mediaid
	 */
	public void setLogo_mediaid(String logo_mediaid) {
		this.logo_mediaid = logo_mediaid;
	}

	/**
	 * 获取企业应用名称
	 * 
	 * @return 企业应用名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置企业应用名称
	 * 
	 * @param name
	 *            企业应用名称，长度不超过32个字符
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取企业应用详情
	 * 
	 * @return 企业应用详情
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置企业应用详情
	 * 
	 * @param description
	 *            企业应用详情，长度为4至120个字符
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取企业应用可信域名
	 * 
	 * @return 企业应用可信域名
	 */
	public String getRedirect_domain() {
		return redirect_domain;
	}

	/**
	 * 设置企业应用可信域名
	 * 
	 * @param redirect_domain
	 *            企业应用可信域名
	 */
	public void setRedirect_domain(String redirect_domain) {
		this.redirect_domain = redirect_domain;
	}

	/**
	 * 获取是否上报用户进入应用事件的值，0：不接收；1：接收
	 * 
	 * @return 是否上报用户进入应用事件的值，0：不接收；1：接收
	 */
	public int getIsreportenter() {
		return isreportenter;
	}

	/**
	 * 设置是否上报用户进入应用事件的值，0：不接收；1：接收
	 * 
	 * @param isreportenter
	 *            是否上报用户进入应用事件的值，0：不接收；1：接收
	 */
	public void setIsreportenter(int isreportenter) {
		this.isreportenter = isreportenter;
	}

	/**
	 * 获取应用主页url
	 * 
	 * @return 应用主页url
	 */
	public String getHome_url() {
		return home_url;
	}

	/**
	 * 设置应用主页url
	 * 
	 * @param home_url
	 *            应用主页url
	 */
	public void setHome_url(String home_url) {
		this.home_url = home_url;
	}

}
