package wx.contact;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: Simple
 * <p>
 * Description: 通讯录管理-成员管理、部门管理、标签管理样例
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
 * @date 2018.09.11 13:50
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

					// 成员管理测试
					userManagerTest(access_token);
					// 部门管理测试
					partyManagerTest(access_token);
					// 标签管理测试
					tagManagerTest(access_token);
				}
			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}

		});
	}

	/**
	 * 成员管理测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	private static void userManagerTest(String access_token) {

		// 创建成员
		UserManager.createUser(access_token);
		// 读取(获取)成员
		UserManager.readUser(access_token, "userid");
		// 更新成员
		UserManager.updateUser(access_token);
		// 删除成员
		UserManager.deleteUser(access_token, "userid");
		// 批量删除成员
		UserManager.batch_deleteUser(access_token);
		// 获取部门成员
		UserManager.getPartyforUser(access_token, 1, 0);
		// 获取部门成员详情
		UserManager.getPartyforUserInfo(access_token, 1, 0);
		// userid to openid
		UserManager.userid2OpenId(access_token, "userid");
		// openid to userid
		UserManager.openid2UserId(access_token, "openid");
		// 二次验证
		UserManager.SecondaryVerification(access_token, "userid");

		// 邀请成员
		UserManager.InvitationUser(access_token);
		// 获取外部联系人详情
		UserManager.getExternalContactInfo(access_token, "external_userid");
	}

	/**
	 * 部门管理测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	private static void partyManagerTest(String access_token) {

		// 创建部门
		PartyManager.createParty(access_token);
		// 更新部门
		PartyManager.updateParty(access_token);
		// 删除部门
		PartyManager.deleteParty(access_token, 1);
		// 获取部门列表
		PartyManager.getPartyList(access_token, 1);
	}

	/**
	 * 标签管理测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	private static void tagManagerTest(String access_token) {

		// 创建标签
		TagManager.createTag(access_token);
		// 更新标签名字
		TagManager.updateTagName(access_token);
		// 删除标签
		TagManager.deleteTag(access_token, 1);
		// 获取标签成员
		TagManager.getTagUser(access_token, 1);
		// 增加标签成员
		TagManager.addTagUser(access_token);
		// 删除标签成员
		TagManager.deleteTagUser(access_token);
		// 获取标签列表
		TagManager.getTagList(access_token);
	}
}
