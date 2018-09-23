package wx.msg.req;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.msg.File;
import wx.msg.Image;
import wx.msg.MpNews;
import wx.msg.News;
import wx.msg.News.Article;
import wx.msg.Text;
import wx.msg.TextCard;
import wx.msg.Video;
import wx.msg.Voice;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;
import wx.util.WXMessageUtil;

/**
 * ClassName: WXAppMsgSend
 * <p>
 * Description: 发送应用消息类
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
 * @date 2018.09.03 15:26
 */
public class WXAppMsgSend {

	private WXAppMsgSend() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 发送应用消息(应用支持发送文本、图片、视频、文件、图文等类型)
	 * 
	 * @param access_token
	 *            凭证
	 * @param data
	 *            post数据
	 * @param resp
	 *            请求结果回调接口
	 */
	private static void sendWXAppMsg(String access_token, final String data,
			final HttpResponse resp) {

		// url
		final String url = String.format(WXApi.WX_SNED_APP_MSG, access_token);
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {

				// request
				WXHttpUtil.HttpRequest(url, WXApi.POST, data, resp);
			}
		});
	}

	/**
	 * 发送微信应用文本消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppTextMsgTest(String access_token) {

		Text text = new Text();
		text.setContent("content");

		TextMsg mWXAppTextMsg = new TextMsg();
		mWXAppTextMsg.setTouser("touser");
		mWXAppTextMsg.setToparty("toparty");
		mWXAppTextMsg.setTotag("totag");
		mWXAppTextMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_TEXT);
		mWXAppTextMsg.setAgentid(1);
		mWXAppTextMsg.setText(text);
		mWXAppTextMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppTextMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 发送微信应用图片消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppImageMsgTest(String access_token) {

		Image image = new Image();
		image.setMedia_id("media_id");

		ImageMsg mWXAppImageMsg = new ImageMsg();
		mWXAppImageMsg.setTouser("touser");
		mWXAppImageMsg.setToparty("toparty");
		mWXAppImageMsg.setTotag("totag");
		mWXAppImageMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_IMAGE);
		mWXAppImageMsg.setAgentid(1);
		mWXAppImageMsg.setImage(image);
		mWXAppImageMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppImageMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 发送微信应用语音消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppVoiceMsgTest(String access_token) {

		Voice voice = new Voice();
		voice.setMedia_id("media_id");

		VoiceMsg mWXAppVoiceMsg = new VoiceMsg();
		mWXAppVoiceMsg.setTouser("touser");
		mWXAppVoiceMsg.setToparty("toparty");
		mWXAppVoiceMsg.setTotag("totag");
		mWXAppVoiceMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_VOICE);
		mWXAppVoiceMsg.setAgentid(1);
		mWXAppVoiceMsg.setVoice(voice);
		mWXAppVoiceMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppVoiceMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 发送微信应用视频消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppVideoMsgTest(String access_token) {

		Video video = new Video();
		video.setMedia_id("media_id");
		video.setTitle("title");
		video.setDescription("description");

		VideoMsg mWXAppVideoMsg = new VideoMsg();
		mWXAppVideoMsg.setTouser("touser");
		mWXAppVideoMsg.setToparty("toparty");
		mWXAppVideoMsg.setTotag("totag");
		mWXAppVideoMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_VIDEO);
		mWXAppVideoMsg.setAgentid(1);
		mWXAppVideoMsg.setVideo(video);
		mWXAppVideoMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppVideoMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 发送微信应用文件消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppFileMsgTest(String access_token) {

		File file = new File();
		file.setMedia_id("media_id");

		FileMsg mWXAppFileMsg = new FileMsg();
		mWXAppFileMsg.setTouser("touser");
		mWXAppFileMsg.setToparty("toparty");
		mWXAppFileMsg.setTotag("totag");
		mWXAppFileMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_FILE);
		mWXAppFileMsg.setAgentid(1);
		mWXAppFileMsg.setFile(file);
		mWXAppFileMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppFileMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 发送微信应用文本卡片消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppTextCardMsgTest(String access_token) {

		TextCard textcard = new TextCard();
		textcard.setTitle("title");
		textcard.setDescription("description");
		textcard.setUrl("url");
		textcard.setBtntxt("btntxt");

		TextCardMsg mWXAppTextCardMsg = new TextCardMsg();
		mWXAppTextCardMsg.setTouser("touser");
		mWXAppTextCardMsg.setToparty("toparty");
		mWXAppTextCardMsg.setTotag("totag");
		mWXAppTextCardMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_TEXTCARD);
		mWXAppTextCardMsg.setAgentid(1);
		mWXAppTextCardMsg.setTextcard(textcard);
		mWXAppTextCardMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppTextCardMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 发送微信应用图文消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppNewsMsgTest(String access_token) {

		List<Article> articles = new ArrayList<Article>();

		Article article1 = new Article();
		article1.setTitle("title");
		article1.setDescription("description");
		article1.setUrl("url");
		article1.setPicurl("picurl");
		article1.setBtntxt("btntxt");

		articles.add(article1);

		News news = new News();
		news.setArticles(articles);

		NewsMsg mWXAppNewsMsg = new NewsMsg();
		mWXAppNewsMsg.setTouser("touser");
		mWXAppNewsMsg.setToparty("toparty");
		mWXAppNewsMsg.setTotag("totag");
		mWXAppNewsMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_NEWS);
		mWXAppNewsMsg.setAgentid(1);
		mWXAppNewsMsg.setNews(news);
		mWXAppNewsMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppNewsMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 发送微信应用图文消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void sendWXAppMpNewsMsgTest(String access_token) {

		List<MpNews.Article> articles = new ArrayList<MpNews.Article>();

		MpNews.Article article1 = new MpNews.Article();
		article1.setTitle("title");
		article1.setThumb_media_id("thumb_media_id");
		article1.setAuthor("author");
		article1.setContent_source_url("content_source_url");
		article1.setContent("content");
		article1.setDigest("digest");

		articles.add(article1);

		MpNews mpnews = new MpNews();
		mpnews.setArticles(articles);

		MpNewsMsg mWXAppMpNewsMsg = new MpNewsMsg();
		mWXAppMpNewsMsg.setTouser("touser");
		mWXAppMpNewsMsg.setToparty("toparty");
		mWXAppMpNewsMsg.setTotag("totag");
		mWXAppMpNewsMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_MPNEWS);
		mWXAppMpNewsMsg.setAgentid(1);
		mWXAppMpNewsMsg.setMpnews(mpnews);
		mWXAppMpNewsMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mWXAppMpNewsMsg).toString();
		// send
		sendWXAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}
}
