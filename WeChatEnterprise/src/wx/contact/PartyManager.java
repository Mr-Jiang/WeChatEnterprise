package wx.contact;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: PartyManager
 * <p>
 * Description: 部门管理
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
 * @date 2018.09.07 11:34
 */
public class PartyManager {

	private PartyManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 创建部门
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void createParty(String access_token) {

		Party party = new Party();
		party.setName("name");
		party.setParentid(1);
		party.setOrder(1);
		party.setId(2);

		// url
		final String url = String.format(WXApi.WX_CREATE_PARTY, access_token);
		// data
		final String data = JSONObject.fromObject(party).toString();
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
	 * 更新部门
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void updateParty(String access_token) {

		Party party = new Party();
		party.setName("name");
		party.setParentid(1);
		party.setOrder(1);
		party.setId(2);

		// url
		final String url = String.format(WXApi.WX_UPDATE_PARTY, access_token);
		// data
		final String data = JSONObject.fromObject(party).toString();
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
	 * 删除部门
	 * 
	 * @param access_token
	 *            凭证
	 * @param id
	 *            部门id。（注：不能删除根部门；不能删除含有子部门、成员的部门）
	 */
	public static void deleteParty(String access_token, int id) {

		// url
		final String url = String.format(WXApi.WX_DELETE_PARTY, access_token,
				id);
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
	 * 获取部门列表
	 * 
	 * @param access_token
	 *            凭证
	 * @param id
	 *            应用id
	 */
	public static void getPartyList(String access_token, int id) {

		// url
		final String url = String.format(WXApi.WX_GET_PARTY_LIST, access_token,
				id);
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
