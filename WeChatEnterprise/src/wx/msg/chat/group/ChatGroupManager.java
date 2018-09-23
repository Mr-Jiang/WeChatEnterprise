package wx.msg.chat.group;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: ChatGroupManager
 * <p>
 * Description: 微信群聊管理
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
 * @date 2018.09.05 09:25
 */
public class ChatGroupManager {

	private ChatGroupManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 创建群聊租
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void createChatSession(String access_token) {

		List<String> userlist = new ArrayList<String>();

		userlist.add("userid1");
		userlist.add("userid2");
		userlist.add("userid3");

		CreateChatGroup mCreateChatSession = new CreateChatGroup();
		mCreateChatSession.setName("name");
		mCreateChatSession.setOwner("userid1");
		mCreateChatSession.setChatid("chatid");
		mCreateChatSession.setUserlist(userlist);

		// url
		final String url = String.format(WXApi.WX_CREATE_CHAT_SESSION,
				access_token);
		// data
		final String data = JSONObject.fromObject(mCreateChatSession)
				.toString();
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
	 * 修改群聊租
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void updateChatSession(String access_token) {

		List<String> add_user_list = new ArrayList<String>();
		List<String> del_user_list = new ArrayList<String>();

		add_user_list.add("userid1");
		add_user_list.add("userid2");
		add_user_list.add("userid3");

		del_user_list.add("userid3");
		del_user_list.add("userid4");

		UpdateChatGroup mUpdateChatSession = new UpdateChatGroup();
		mUpdateChatSession.setName("name");
		mUpdateChatSession.setOwner("userid1");
		mUpdateChatSession.setChatid("chatid");
		mUpdateChatSession.setAdd_user_list(add_user_list);
		mUpdateChatSession.setDel_user_list(del_user_list);

		// url
		final String url = String.format(WXApi.WX_UPDATE_CHAT_SESSION,
				access_token);
		// data
		final String data = JSONObject.fromObject(mUpdateChatSession)
				.toString();
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
	 * 获取群聊租
	 * 
	 * @param access_token
	 *            凭证
	 * @param chatid
	 *            群聊id
	 */
	public static void getChatSession(String access_token, String chatid) {

		// url
		final String url = String.format(WXApi.WX_GET_CHAT_SESSION,
				access_token, chatid);
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
