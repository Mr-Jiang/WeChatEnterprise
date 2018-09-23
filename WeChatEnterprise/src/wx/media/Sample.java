package wx.media;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.WXHttpUtil.HttpResponse;
import wx.util.WXMessageUtil;

/**
 * ClassName: Sample
 * <p>
 * Description: 微信上传临时素材、获取临时素材、上传图片样例
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
 * @date 2018.08.29 18:10
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

					// 上传临时素材
					MaterialManager.uploadTemporaryMaterial(access_token,
							WXMessageUtil.MESSAGE_TYPE_FILE,
							"http://localhost:8080/images/test.pdf",
							new HttpResponse() {

								public void onOk(JSONObject object) {
									// TODO Auto-generated method stub

								}

								public void onError(Throwable cause) {
									// TODO Auto-generated method stub

								}
							});

					// 获取临时素材
					MaterialManager.getTemporaryMaterial(access_token,
							"mediaId", "E:/TomCat/webapps/images",
							new HttpResponse() {

								public void onOk(JSONObject object) {
									// TODO Auto-generated method stub

								}

								public void onError(Throwable cause) {
									// TODO Auto-generated method stub

								}
							});

					// 上传图片
					MaterialManager.uploadPicture(access_token,
							"http://localhost:8080/images/android.jpg",
							new HttpResponse() {

								public void onOk(JSONObject object) {
									// TODO Auto-generated method stub

								}

								public void onError(Throwable cause) {
									// TODO Auto-generated method stub

								}
							});
				}

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}

		});

	}

}
