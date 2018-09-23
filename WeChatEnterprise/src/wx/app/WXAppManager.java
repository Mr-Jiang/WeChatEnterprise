package wx.app;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: WXAppManager
 * <p>
 * Description: 微信应用管理
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
 * @date 2018.08.29 11:05
 */
public class WXAppManager {

	private WXAppManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取应用
	 * 
	 * @param access_token
	 *            凭证
	 * @param agentid
	 *            应用id
	 */
	public static void getApp(String access_token, int agentid) {

		// url
		final String url = String.format(WXApi.WX_GET_APP, access_token,
				agentid);
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {

				// request
				WXHttpUtil.HttpRequest(url, WXApi.GET, new HttpResponse() {

					public void onOk(JSONObject object) {

					}

					public void onError(Throwable cause) {

					}

				});

			}
		});
	}

	/**
	 * 设置应用
	 * 
	 * @param access_token
	 *            凭证
	 * @param agentid
	 *            应用id
	 */
	public static void settingApp(String access_token, SettingsApp mSettingsApp) {

		// url
		final String url = String.format(WXApi.WX_SETTINGS_APP, access_token);
		// data
		final String data = JSONObject.fromObject(mSettingsApp).toString();
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {

				// request
				WXHttpUtil.HttpRequest(url, WXApi.POST, data,
						new HttpResponse() {

							public void onOk(JSONObject object) {

							}

							public void onError(Throwable cause) {

							}

						});

			}
		});
	}

	/**
	 * 获取应用列表
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void getAppList(String access_token) {

		// url
		final String url = String.format(WXApi.WX_GET_APP_LIST, access_token);
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {

				// request
				WXHttpUtil.HttpRequest(url, WXApi.GET, new HttpResponse() {

					public void onOk(JSONObject object) {

					}

					public void onError(Throwable cause) {

					}

				});

			}
		});
	}
}
