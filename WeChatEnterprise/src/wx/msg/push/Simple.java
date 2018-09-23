package wx.msg.push;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: Simple
 * <p>
 * Description: 微信推送应用消息样例
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
 * @date 2018.09.05 14:07
 */
public class Simple {

	public static void main(String[] args) {

		// 发送应用消息
		// get access_token
		WXApi.getAccessToken(new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

				if (object != null && object.has("access_token")) {

					// parse access_token
					String access_token = object.getString("access_token");

					// 微信推送应用文本消息测试
					WXAppMsgPush.pushAppTextMsgTest(access_token);
					// 微信推送应用图片消息测试
					WXAppMsgPush.pushAppImageMsgTest(access_token);
					// 微信推送应用语音消息测试
					WXAppMsgPush.pushAppVoiceMsgTest(access_token);
					// 微信推送应用视频消息测试
					WXAppMsgPush.pushAppVideoMsgTest(access_token);
					// 微信推送应用文件消息测试
					WXAppMsgPush.pushAppFileMsgTest(access_token);
					// 微信推送应用文本卡片消息测试
					WXAppMsgPush.pushAppTextCardMsgTest(access_token);
					// 微信推送应用news图文消息测试
					WXAppMsgPush.pushAppNewsMsgTest(access_token);
					// 微信推送应用mpnews消息测试
					WXAppMsgPush.pushAppMpNewsMsgTest(access_token);
				}
			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}

		});
	}

}
