package wx.api;

import net.sf.json.JSONObject;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: WXApi
 * <p>
 * Description: 全局常量、变量类
 * <p>
 * Copyright: Copyright (c) 2018
 * <p>
 * GitHub:<a href="https://github.com/Mr-Jiang">https://github.com/Mr-Jiang</a>
 * <p>
 * Blog: <a
 * href="https://blog.csdn.net/jspping?viewmode=contents">https://blog.csdn.
 * net/jspping?viewmode=contents</a>
 * <p>
 * Personal Home Page: <a
 * href="http://www.engineer-jsp.cn/">http://www.engineer-jsp.cn/</a>
 * 
 * @author <a href="https://github.com/Mr-Jiang">Mr-Jiang</a>
 * @date 2018.08.24 11:23
 */
public class WXApi {

	private WXApi() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * *********************************
	 * 
	 * ************ global constant ****
	 * 
	 * *********************************
	 */

	/** Token */
	public static final String Token = "WeChatEnterprise";

	/** 后台随机生成的加密签名 */
	public static final String EncodingAesKey = "EncodingAesKey";

	/** 企业号CorpId */
	public static final String CorpId = "CorpId";

	/** Secret */
	public static final String Secret = "Secret";

	/*
	 * *********************************
	 * 
	 * ************ request way ********
	 * 
	 * *********************************
	 */

	/** get请求 */
	public static final String GET = "GET";

	/** post请求 */
	public static final String POST = "POST";

	/*
	 * *********************************
	 * 
	 * ************ token **************
	 * 
	 * *********************************
	 */

	/** 获取accessToken */
	private final static String WX_GET_ACCESSTOKEN = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=%s&corpsecret=%s";

	/*
	 * *********************************
	 * 
	 * ************ wechat menu ********
	 * 
	 * *********************************
	 */

	/** 创建菜单 */
	public static final String WX_CREATE_MENU = "https://qyapi.weixin.qq.com/cgi-bin/menu/create?access_token=%s&agentid=%d";

	/** 获取菜单 */
	public static final String WX_GET_MENU = "https://qyapi.weixin.qq.com/cgi-bin/menu/get?access_token=%s&agentid=%d";

	/** 删除菜单 */
	public static final String WX_DELETE_MENU = "https://qyapi.weixin.qq.com/cgi-bin/menu/delete?access_token=%s&agentid=%d";

	/*
	 * *********************************
	 * 
	 * ************ wechat app manager *
	 * 
	 * *********************************
	 */

	/** 获取应用 */
	public static final String WX_GET_APP = "https://qyapi.weixin.qq.com/cgi-bin/agent/get?access_token=%s&agentid=%d";

	/** 设置应用 */
	public static final String WX_SETTINGS_APP = "https://qyapi.weixin.qq.com/cgi-bin/agent/set?access_token=%s";

	/** 获取应用列表 */
	public static final String WX_GET_APP_LIST = "https://qyapi.weixin.qq.com/cgi-bin/agent/list?access_token=%s";

	/*
	 * *********************************
	 * 
	 * ************ material manager ***
	 * 
	 * *********************************
	 */

	/** 上传临时素材 */
	public static final String WX_UPLOAD_TEMPORARY_MATERIAL = "https://qyapi.weixin.qq.com/cgi-bin/media/upload?access_token=%s&type=%s";

	/** 获取临时素材 */
	public static final String WX_GET_TEMPORARY_MATERIAL = "https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=%s&media_id=%s";

	/** 上传图片 */
	public static final String WX_UPLOAD_PICTURE = "https://qyapi.weixin.qq.com/cgi-bin/media/uploadimg?access_token=%s";

	/*
	 * *********************************
	 * 
	 * ************ wechat oauth2 ******
	 * 
	 * *********************************
	 */

	/** 网页授权登录，获取code */
	private static final String WX_GET_OAUTH2_CODE = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=%s&agentid=%d&state=%s#wechat_redirect";

	/** 网页授权登录，OAuth2 重定向回调地址 */
	private static final String WX_OAUTH2_REDIRECT_URI = "http://www.engineer-jsp.cn/WeChatEnterprise/oauth2Servlet";

	/** 根据code获取成员信息 */
	public static final String WX_OAUTH2_CODE_TO_USERID = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=%s&code=%s";

	/** 使用user_ticket获取成员详情 */
	public static final String WX_OAUTH2_TICKET_TO_USERINFO = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserdetail?access_token=%s";

	/*
	 * *********************************
	 * 
	 * **** send application message ***
	 * 
	 * *********************************
	 */

	/** 发送应用消息 */
	public static final String WX_SNED_APP_MSG = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=%s";

	/*
	 * *********************************
	 * 
	 * **** push application message ***
	 * 
	 * *********************************
	 */

	/** 推送应用消息 */
	public static final String WX_PUSH_APP_MSG = "https://qyapi.weixin.qq.com/cgi-bin/appchat/send?access_token=%s";

	/*
	 * *********************************
	 * 
	 * ************ wechat group *******
	 * 
	 * *********************************
	 */

	/** 微信-创建群聊会话 */
	public static final String WX_CREATE_CHAT_SESSION = "https://qyapi.weixin.qq.com/cgi-bin/appchat/create?access_token=%s";

	/** 微信-修改更新群聊会话 */
	public static final String WX_UPDATE_CHAT_SESSION = "https://qyapi.weixin.qq.com/cgi-bin/appchat/update?access_token=%s";

	/** 微信-获取群聊会话 */
	public static final String WX_GET_CHAT_SESSION = "https://qyapi.weixin.qq.com/cgi-bin/appchat/get?access_token=%s&chatid=%s";

	/*
	 * *********************************
	 * 
	 * ************ party manager ******
	 * 
	 * *********************************
	 */

	/** 微信-创建部门 */
	public static final String WX_CREATE_PARTY = "https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token=%s";

	/** 微信-更新部门 */
	public static final String WX_UPDATE_PARTY = "https://qyapi.weixin.qq.com/cgi-bin/department/update?access_token=%s";

	/** 微信-删除部门 */
	public static final String WX_DELETE_PARTY = "https://qyapi.weixin.qq.com/cgi-bin/department/delete?access_token=%s&id=%d";

	/** 微信-获取部门列表 */
	public static final String WX_GET_PARTY_LIST = "https://qyapi.weixin.qq.com/cgi-bin/department/list?access_token=%s&id=%d";

	/*
	 * *********************************
	 * 
	 * ************ tag manager ********
	 * 
	 * *********************************
	 */

	/** 微信-创建标签 */
	public static final String WX_CREATE_TAG = "https://qyapi.weixin.qq.com/cgi-bin/tag/create?access_token=%s";

	/** 微信-更新标签名字 */
	public static final String WX_UPDATE_TAG_NAME = "https://qyapi.weixin.qq.com/cgi-bin/tag/update?access_token=%s";

	/** 微信-删除标签 */
	public static final String WX_DELETE_TAG = "https://qyapi.weixin.qq.com/cgi-bin/tag/delete?access_token=%s&tagid=%d";

	/** 微信-获取标签成员 */
	public static final String WX_GET_TAG_USER = "https://qyapi.weixin.qq.com/cgi-bin/tag/get?access_token=%s&tagid=%d";

	/** 微信-增加标签成员 */
	public static final String WX_ADD_TAG_USER = "https://qyapi.weixin.qq.com/cgi-bin/tag/addtagusers?access_token=%s";

	/** 微信-删除标签成员 */
	public static final String WX_DELETE_TAG_USER = "https://qyapi.weixin.qq.com/cgi-bin/tag/deltagusers?access_token=%s";

	/** 微信-获取标签列表 */
	public static final String WX_GET_TAG_LIST = "https://qyapi.weixin.qq.com/cgi-bin/tag/list?access_token=%s";

	/*
	 * *********************************
	 * 
	 * ************ user manager *******
	 * 
	 * *********************************
	 */

	/** 微信-创建成员 */
	public static final String WX_CREATE_USER = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=%s";

	/** 微信-读取(获取)成员 */
	public static final String WX_GET_USER = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=%s&userid=%s";

	/** 微信-更新成员 */
	public static final String WX_UPDATE_USER = "https://qyapi.weixin.qq.com/cgi-bin/user/update?access_token=%s";

	/** 微信-删除成员 */
	public static final String WX_DELETE_USER = "https://qyapi.weixin.qq.com/cgi-bin/user/delete?access_token=%s&userid=%s";

	/** 微信-批量删除成员 */
	public static final String WX_BATCH_DELETE_USER = "https://qyapi.weixin.qq.com/cgi-bin/user/batchdelete?access_token=%s";

	/** 微信-获取部门成员 */
	public static final String WX_GET_PATRY_USER = "https://qyapi.weixin.qq.com/cgi-bin/user/simplelist?access_token=%s&department_id=%d&fetch_child=%d";

	/** 微信-获取部门成员详情 */
	public static final String WX_GET_PATRY_USER_INFO = "https://qyapi.weixin.qq.com/cgi-bin/user/list?access_token=%s&department_id=%d&fetch_child=%d";

	/** 微信-userid转openid */
	public static final String WX_USERID_TO_OPENID = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_openid?access_token=%s";

	/** 微信-openid转userid */
	public static final String WX_OPENID_TO_USERID = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_userid?access_token=%s";

	/** 微信-二次验证 */
	public static final String WX_SECONDARY_VALIDATION = "https://qyapi.weixin.qq.com/cgi-bin/user/authsucc?access_token=%s&userid=%s";

	/** 微信-邀请成员 */
	public static final String WX_INVITATION_USER = "https://qyapi.weixin.qq.com/cgi-bin/batch/invite?access_token=%s";

	/** 微信-获取外部联系人详情 */
	public static final String WX_GET_EXTERNAL_CONTACT_INFO = "https://qyapi.weixin.qq.com/cgi-bin/crm/get_external_contact?access_token=%s&external_userid=%s";

	/**
	 * 获取accessToken-异步
	 * 
	 * @param resp
	 *            请求结果回调
	 */
	public static void getAccessToken(final HttpResponse resp) {

		// url
		final String url = String.format(WXApi.WX_GET_ACCESSTOKEN, CorpId,
				Secret);
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {
				WXHttpUtil.HttpRequest(url, GET, resp);
			}

		});
	}

	/**
	 * 获取accessToken-阻塞式
	 * 
	 * @return accessToken
	 */
	public static String getAccessToken4Blocking() {
		// url
		final String url = String.format(WXApi.WX_GET_ACCESSTOKEN, CorpId,
				Secret);
		// request
		JSONObject object = WXHttpUtil.HttpRequest4Blocking(url, GET);
		// parse
		if (object != null && object.has("access_token"))
			// parse access_token
			return object.getString("access_token");
		
		return null;
	}

	/**
	 * 获取Oauth2授权的code地址
	 * 
	 * @param agentid
	 *            企业应用的id
	 *            <p>
	 *            当scope是snsapi_userinfo或snsapi_privateinfo时，该参数必填
	 *            <p>
	 *            注意redirect_uri的域名必须与该应用的可信域名一致
	 * @return 网页授权登录，获取code的url
	 */
	public static String getOauth2CodeUrl(int agentid) {
		return formatOauth2Url(CorpId, WXHttpUtil
				.URLEncoder(WX_OAUTH2_REDIRECT_URI), "snsapi_privateinfo",
				agentid, "acebdf13572468");
	}

	/**
	 * 格式化Oauth2 Url
	 * 
	 * @param appid
	 *            企业的CorpID
	 * @param redirect_uri
	 *            授权后重定向的回调链接地址，请使用urlencode对链接进行处理
	 * @param scope
	 *            应用授权作用域
	 *            <p>
	 *            snsapi_base：静默授权，可获取成员的的基础信息（UserId与DeviceId）
	 *            <p>
	 *            snsapi_userinfo：静默授权，可获取成员的详细信息，但不包含手机、邮箱
	 *            <p>
	 *            snsapi_privateinfo：手动授权，可获取成员的详细信息，包含手机、邮箱
	 *            <p>
	 *            注意：企业自建应用可以根据userid获取成员详情
	 *            <p>
	 *            无需使用snsapi_userinfo和snsapi_privateinfo两种scope
	 * @param agentid
	 *            企业应用的id
	 *            <p>
	 *            当scope是snsapi_userinfo或snsapi_privateinfo时，该参数必填
	 *            <p>
	 *            注意redirect_uri的域名必须与该应用的可信域名一致
	 * @param state
	 *            重定向后会带上state参数，企业可以填写a-zA-Z0-9的参数值，长度不可超过128个字节
	 * @return 网页授权登录，获取code的授权url
	 */
	private static String formatOauth2Url(String appid, String redirect_uri,
			String scope, int agentid, String state) {

		return String.format(WX_GET_OAUTH2_CODE, appid, redirect_uri, scope,
				agentid, state);
	}
}
