package wx.oauth2;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: WXOAuth2
 * <p>
 * Description: 微信网页授权登录
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
 * @date 2018.08.31 15:25
 */
public class WXOAuth2 {

	private WXOAuth2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 根据code获取成员信息-异步式
	 * 
	 * @param access_token
	 *            凭证
	 * @param code
	 *            通过成员授权获取到的code，最大为512字节。每次成员授权带上的code将不一样，code只能使用一次，
	 *            5分钟未被使用自动过期
	 * @param resp
	 *            请求结果回调接口
	 */
	public static void getCodeToUserId(String access_token, String code,
			final HttpResponse resp) {

		// url
		final String url = String.format(WXApi.WX_OAUTH2_CODE_TO_USERID,
				access_token, code);
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {

				// request
				WXHttpUtil.HttpRequest(url, WXApi.GET, resp);
			}
		});
	}

	/**
	 * 根据code获取成员信息-阻塞式
	 * 
	 * @param access_token
	 *            凭证
	 * @param code
	 *            通过成员授权获取到的code，最大为512字节。每次成员授权带上的code将不一样，code只能使用一次，
	 *            5分钟未被使用自动过期
	 * @return JSONObject
	 */
	public static JSONObject getCodeToUserId4Blocking(String access_token,
			String code) {
		// url
		final String url = String.format(WXApi.WX_OAUTH2_CODE_TO_USERID,
				access_token, code);
		// request
		return WXHttpUtil.HttpRequest4Blocking(url, WXApi.GET);
	}

	/**
	 * 根据user_ticket换取用户信息-异步式
	 * 
	 * @param access_token
	 *            凭证
	 * @param user_ticket
	 *            成员票据
	 * @param resp
	 *            请求结果回调接口
	 */
	public static void getTicketToUserInfo(String access_token,
			String user_ticket, final HttpResponse resp) {

		// format data
		String format = "{\"user_ticket\":\"%s\"}";

		// url
		final String url = String.format(WXApi.WX_OAUTH2_TICKET_TO_USERINFO,
				access_token);
		// data
		final String data = String.format(format, user_ticket);
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {

				// request
				WXHttpUtil.HttpRequest(url, WXApi.POST, data, resp);
			}
		});
	}

	/**
	 * 根据user_ticket换取用户信息-阻塞式
	 * 
	 * @param access_token
	 *            凭证
	 * @param user_ticket
	 *            成员票据
	 * @return JSONObject
	 */
	public static JSONObject getTicketToUserInfo4Blocking(String access_token,
			String user_ticket) {

		// format data
		String format = "{\"user_ticket\":\"%s\"}";

		// url
		final String url = String.format(WXApi.WX_OAUTH2_TICKET_TO_USERINFO,
				access_token);
		// data
		final String data = String.format(format, user_ticket);

		// request
		JSONObject object = WXHttpUtil.HttpRequest4Blocking(url, WXApi.POST,
				data);

		if (object != null)
			return object;

		return null;
	}

}
