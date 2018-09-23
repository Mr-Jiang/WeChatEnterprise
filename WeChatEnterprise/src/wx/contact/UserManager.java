package wx.contact;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.contact.MiNiProgramAttr.MiNiProgram;
import wx.contact.TextAttr.Text;
import wx.contact.User.AttrsItem;
import wx.contact.User.Extattr;
import wx.contact.User.ExternalProfile;
import wx.contact.WebAttr.Web;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: UserManager
 * <p>
 * Description: 成员管理
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
 * @date 2018.09.07 11:37
 */
public class UserManager {

	private UserManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 创建成员
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void createUser(String access_token) {

		User user = new User();
		user.setUserid("userid");
		user.setName("name");
		user.setAlias("alias");
		user.setMobile("mobile");

		List<Integer> department = new ArrayList<Integer>();
		department.add(1);
		department.add(2);

		List<Integer> order = new ArrayList<Integer>();
		order.add(10);
		order.add(40);

		user.setDepartment(department);
		user.setOrder(order);
		user.setPosition("position");
		user.setGender("1");
		user.setEmail("email");
		user.setIsleader(1);
		user.setEnable(1);
		user.setAvatar_mediaid("avatar_mediaid");
		user.setTelephone("telephone");

		Extattr extattr = new Extattr();

		List<AttrsItem> attrs = new ArrayList<AttrsItem>();

		AttrsItem item1 = new AttrsItem();
		item1.setName("爱好");
		item1.setValue("旅游");

		AttrsItem item2 = new AttrsItem();
		item2.setName("卡号");
		item2.setValue("1234567234");

		attrs.add(item1);
		attrs.add(item2);

		extattr.setAttrs(attrs);
		user.setExtattr(extattr);
		user.setTo_invite(true);

		ExternalProfile external_profile = new ExternalProfile();

		List<BaseAttr> external_attr = new ArrayList<BaseAttr>();

		TextAttr textAttr = new TextAttr();

		Text text = new Text();
		text.setValue("文本");

		textAttr.setType(0);
		textAttr.setName("文本名称");
		textAttr.setText(text);

		WebAttr webAttr = new WebAttr();

		Web web = new Web();
		web.setTitle("engineer-jsp");
		web.setUrl("http://www.engineer-jsp.cn");

		webAttr.setType(1);
		webAttr.setName("web名称");
		webAttr.setWeb(web);

		MiNiProgramAttr mimiprogramAttr = new MiNiProgramAttr();

		MiNiProgram miniprogram = new MiNiProgram();
		miniprogram.setAppid("wx8bd80126147df384");
		miniprogram.setPagepath("/index");
		miniprogram.setTitle("my miniprogram");

		mimiprogramAttr.setType(2);
		mimiprogramAttr.setName("小程序名称");
		mimiprogramAttr.setMiniprogram(miniprogram);

		external_attr.add(textAttr);
		external_attr.add(webAttr);
		external_attr.add(mimiprogramAttr);

		external_profile.setExternal_attr(external_attr);
		user.setExternal_profile(external_profile);

		// url
		final String url = String.format(WXApi.WX_CREATE_USER, access_token);
		// data
		final String data = JSONObject.fromObject(user).toString();
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
	 * 读取(获取)成员
	 * 
	 * @param access_token
	 *            凭证
	 * @param userid
	 *            成员UserID
	 */
	public static void readUser(String access_token, String userid) {

		// url
		final String url = String.format(WXApi.WX_GET_USER, access_token,
				userid);
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
	 * 更新成员
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void updateUser(String access_token) {

		User user = new User();
		user.setUserid("userid");
		user.setName("name");
		user.setAlias("alias");
		user.setMobile("mobile");

		List<Integer> department = new ArrayList<Integer>();
		department.add(1);

		List<Integer> order = new ArrayList<Integer>();
		order.add(10);

		user.setDepartment(department);
		user.setOrder(order);
		user.setPosition("position");
		user.setGender("1");
		user.setEmail("email");
		user.setIsleader(1);
		user.setEnable(1);
		user.setAvatar_mediaid("avatar_mediaid");
		user.setTelephone("telephone");

		Extattr extattr = new Extattr();

		List<AttrsItem> attrs = new ArrayList<AttrsItem>();

		AttrsItem item1 = new AttrsItem();
		item1.setName("爱好");
		item1.setValue("旅游");

		AttrsItem item2 = new AttrsItem();
		item2.setName("卡号");
		item2.setValue("1234567234");

		attrs.add(item1);
		attrs.add(item2);

		extattr.setAttrs(attrs);
		user.setExtattr(extattr);
		user.setTo_invite(true);

		ExternalProfile external_profile = new ExternalProfile();

		List<BaseAttr> external_attr = new ArrayList<BaseAttr>();

		TextAttr textAttr = new TextAttr();

		Text text = new Text();
		text.setValue("文本");

		textAttr.setType(0);
		textAttr.setName("文本名称");
		textAttr.setText(text);

		WebAttr webAttr = new WebAttr();

		Web web = new Web();
		web.setTitle("engineer-jsp");
		web.setUrl("http://www.engineer-jsp.cn");

		webAttr.setType(1);
		webAttr.setName("web名称");
		webAttr.setWeb(web);

		MiNiProgramAttr mimiprogramAttr = new MiNiProgramAttr();

		MiNiProgram miniprogram = new MiNiProgram();
		miniprogram.setAppid("wx8bd80126147df384");
		miniprogram.setPagepath("/index");
		miniprogram.setTitle("my miniprogram");

		mimiprogramAttr.setType(2);
		mimiprogramAttr.setName("小程序名称");
		mimiprogramAttr.setMiniprogram(miniprogram);

		external_attr.add(textAttr);
		external_attr.add(webAttr);
		external_attr.add(mimiprogramAttr);

		external_profile.setExternal_attr(external_attr);
		user.setExternal_profile(external_profile);

		// url
		final String url = String.format(WXApi.WX_UPDATE_USER, access_token);
		// data
		final String data = JSONObject.fromObject(user).toString();
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
	 * 删除成员
	 * 
	 * @param access_token
	 *            凭证
	 * @param userid
	 *            成员UserID
	 */
	public static void deleteUser(String access_token, String userid) {

		// url
		final String url = String.format(WXApi.WX_DELETE_USER, access_token,
				userid);
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
	 * 批量删除成员
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void batch_deleteUser(String access_token) {

		// data format
		String dataFormat = "{\"useridlist\":%s}";

		// userid list
		List<String> useridlist = new ArrayList<String>();

		// add zhangsan
		useridlist.add("\"zhangsan\"");
		// add lisi
		useridlist.add("\"lisi\"");
		// add wangwu
		useridlist.add("\"wangwu\"");
		// add...

		// url
		final String url = String.format(WXApi.WX_BATCH_DELETE_USER,
				access_token);
		// data
		final String data = String.format(dataFormat, useridlist.toString());
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
	 * 获取部门成员
	 * 
	 * @param access_token
	 *            凭证
	 * @param department_id
	 *            获取的部门id
	 * @param fetch_child
	 *            1/0：是否递归获取子部门下面的成员
	 */
	public static void getPartyforUser(String access_token, int department_id,
			int fetch_child) {

		// url
		final String url = String.format(WXApi.WX_GET_PATRY_USER, access_token,
				department_id, fetch_child);
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
	 * 获取部门成员详情
	 * 
	 * @param access_token
	 *            凭证
	 * @param department_id
	 *            获取的部门id
	 * @param fetch_child
	 *            1/0：是否递归获取子部门下面的成员
	 */
	public static void getPartyforUserInfo(String access_token,
			int department_id, int fetch_child) {

		// url
		final String url = String.format(WXApi.WX_GET_PATRY_USER_INFO,
				access_token, department_id, fetch_child);
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
	 * userid to openid
	 * 
	 * @param access_token
	 *            凭证
	 * @param userid
	 *            企业内的成员id
	 */
	public static void userid2OpenId(String access_token, String userid) {

		// data format
		String dataFormat = "{\"userid\":\"%s\"}";
		// url
		final String url = String.format(WXApi.WX_USERID_TO_OPENID,
				access_token);
		// data
		final String data = String.format(dataFormat, userid);
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
	 * openid to userid
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void openid2UserId(String access_token, String openid) {

		// data format
		String dataFormat = "{\"openid\":\"%s\"}";
		// url
		final String url = String.format(WXApi.WX_OPENID_TO_USERID,
				access_token);
		// data
		final String data = String.format(dataFormat, openid);
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
	 * 二次验证
	 * 
	 * @param access_token
	 *            凭证
	 * @param userid
	 *            成员UserID。对应管理端的帐号
	 */
	public static void SecondaryVerification(String access_token, String userid) {

		// url
		final String url = String.format(WXApi.WX_SECONDARY_VALIDATION,
				access_token, userid);
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
	 * 邀请成员
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void InvitationUser(String access_token) {

		// data format
		String dataFormat = "{\"user\" : %s , \"party\" : %s , \"tag\" : %s}";

		// user list
		List<String> user = new ArrayList<String>();
		// add zhangsan
		user.add("\"zhangsan\"");
		// add lisi
		user.add("\"lisi\"");
		// add wangwu
		user.add("\"wangwu\"");

		// party list
		List<Integer> party = new ArrayList<Integer>();
		// add party id 1
		party.add(1);
		// add party id 2
		party.add(2);

		// tag list
		List<Integer> tag = new ArrayList<Integer>();
		// add tag id 1
		tag.add(1);
		// add tag id 2
		tag.add(2);

		// url
		final String url = String
				.format(WXApi.WX_INVITATION_USER, access_token);
		// data
		final String data = String.format(dataFormat, user.toString(), party
				.toString(), tag.toString());
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
	 * 获取外部联系人详情
	 * 
	 * @param access_token
	 *            凭证
	 * @param external_userid
	 *            外部联系人的userid，注意不是企业成员的帐号
	 */
	public static void getExternalContactInfo(String access_token,
			String external_userid) {

		// url
		final String url = String.format(WXApi.WX_GET_EXTERNAL_CONTACT_INFO,
				access_token, external_userid);
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
