package wx.app;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: Sample
 * <p>
 * Description: 微信获取应用、设置应用、获取应用列表样例
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
 * @date 2018.08.29 11:24
 */
public class Sample {

	public static void main(String[] args) {

		// get access_token
		WXApi.getAccessToken(new HttpResponse() {

			public void onOk(JSONObject object) {

				if (object != null && object.has("access_token")) {

					// parse access_token
					String access_token = object.getString("access_token");

					// get app
					WXAppManager.getApp(access_token, 1);

					SettingsApp mSettingsApp = new SettingsApp();
					mSettingsApp.setAgentid(1);
					mSettingsApp.setReport_location_flag(1);
					mSettingsApp.setLogo_mediaid("logo_mediaid");
					mSettingsApp.setName("name");
					mSettingsApp.setDescription("description");
					mSettingsApp.setRedirect_domain("redirect_domain");
					mSettingsApp.setIsreportenter(1);
					mSettingsApp.setHome_url("home_url");

					// settings app
					WXAppManager.settingApp(access_token, mSettingsApp);

					// get app list
					WXAppManager.getAppList(access_token);

				}
			}

			public void onError(Throwable cause) {

			}

		});

	}

}
