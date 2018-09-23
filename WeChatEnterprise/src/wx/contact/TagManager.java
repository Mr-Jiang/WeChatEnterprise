package wx.contact;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: TagManager
 * <p>
 * Description: 标签管理
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
 * @date 2018.09.07 11:36
 */
public class TagManager {

	private TagManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 创建标签
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void createTag(String access_token) {

		Tag tag = new Tag();
		tag.setTagname("tagname");
		tag.setTagid(1);

		// url
		final String url = String.format(WXApi.WX_CREATE_TAG, access_token);
		// data
		final String data = JSONObject.fromObject(tag).toString();
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
	 * 更新标签名字
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void updateTagName(String access_token) {

		Tag tag = new Tag();
		tag.setTagname("new_tagname");
		tag.setTagid(1);

		// url
		final String url = String
				.format(WXApi.WX_UPDATE_TAG_NAME, access_token);
		// data
		final String data = JSONObject.fromObject(tag).toString();
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
	 * 删除标签
	 * 
	 * @param access_token
	 *            凭证
	 * @param tagid
	 *            标签id
	 */
	public static void deleteTag(String access_token, int tagid) {

		// url
		final String url = String.format(WXApi.WX_DELETE_TAG, access_token,
				tagid);
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
	 * 获取标签成员
	 * 
	 * @param access_token
	 *            凭证
	 * @param tagid
	 *            标签id
	 */
	public static void getTagUser(String access_token, int tagid) {

		// url
		final String url = String.format(WXApi.WX_GET_TAG_USER, access_token,
				tagid);
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
	 * 增加标签成员
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void addTagUser(String access_token) {

		List<String> userlist = new ArrayList<String>();
		userlist.add("user1");
		userlist.add("user2");

		List<Integer> partylist = new ArrayList<Integer>();
		partylist.add(4);

		TagUser tagUser = new TagUser();
		tagUser.setTagid(1);
		tagUser.setUserlist(userlist);
		tagUser.setPartylist(partylist);

		// url
		final String url = String.format(WXApi.WX_ADD_TAG_USER, access_token);
		// data
		final String data = JSONObject.fromObject(tagUser).toString();
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
	 * 删除标签成员
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void deleteTagUser(String access_token) {

		List<String> userlist = new ArrayList<String>();
		userlist.add("user1");
		userlist.add("user2");

		List<Integer> partylist = new ArrayList<Integer>();
		partylist.add(2);
		partylist.add(4);

		TagUser tagUser = new TagUser();
		tagUser.setTagid(1);
		tagUser.setUserlist(userlist);
		tagUser.setPartylist(partylist);

		// url
		final String url = String
				.format(WXApi.WX_DELETE_TAG_USER, access_token);
		// data
		final String data = JSONObject.fromObject(tagUser).toString();
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
	 * 获取标签列表
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void getTagList(String access_token) {

		// url
		final String url = String.format(WXApi.WX_GET_TAG_LIST, access_token);
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
