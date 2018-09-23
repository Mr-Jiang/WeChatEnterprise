package wx.menu;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: Sample
 * <p>
 * Description: 微信创建菜单、获取菜单、删除菜单样例
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
 * @date 2018.08.27 17:17
 */
public class Sample {

	public static void main(String[] args) {

		// get access_token
		WXApi.getAccessToken(new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

				if (object != null && object.has("access_token")) {

					// parse access_token
					String access_token = object.getString("access_token");

					// create menu
					WXMenuManager.createMenu(access_token, 1000002);
					// get menu
					WXMenuManager.getMenu(access_token, 1000002);
					// delete menu
					WXMenuManager.deleteMenu(access_token, 1000002);

				}
			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}

		});

	}

}
