package wx.msg.chat.group;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: UpdateChatSession
 * <p>
 * Description: 微信创建、修改、获取群聊会话样例
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
 * @date 2018.09.05 11:15
 */
public class Simple {

	public static void main(String[] args) {

		// get access_token
		WXApi.getAccessToken(new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

				if (object != null && object.has("access_token")) {

					// parse access_token
					String access_token = object.getString("access_token");

					// create chat group
					ChatGroupManager.createChatSession(access_token);
					// update chat group
					ChatGroupManager.updateChatSession(access_token);
					// get chat group
					ChatGroupManager.getChatSession(access_token, "chatid");
				}
			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}

		});
	}
}
