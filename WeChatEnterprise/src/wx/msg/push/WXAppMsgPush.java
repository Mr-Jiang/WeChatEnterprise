package wx.msg.push;

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
import wx.util.WXMessageUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: WXAppMsgPush
 * <p>
 * Description: 推送应用消息类(群聊)
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
 * @date 2018.09.05 11:38
 */
public class WXAppMsgPush {

	private WXAppMsgPush() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 推送应用消息(应用支持推送文本、图片、视频、文件、图文等类型)
	 * 
	 * @param access_token
	 *            凭证
	 * @param data
	 *            post数据
	 * @param resp
	 *            请求结果回调接口
	 */
	private static void pushAppMsg(String access_token, final String data,
			final HttpResponse resp) {

		// url
		final String url = String.format(WXApi.WX_PUSH_APP_MSG, access_token);
		// io
		ThreadPoolManager.getManager().postRunnable(new Runnable() {

			public void run() {

				// request
				WXHttpUtil.HttpRequest(url, WXApi.POST, data, resp);
			}
		});
	}

	/**
	 * 微信推送应用文本消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppTextMsgTest(String access_token) {

		Text text = new Text();
		text.setContent("content");

		TextMsg mPushAppTextMsg = new TextMsg();
		mPushAppTextMsg.setChatid("chatid");
		mPushAppTextMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_TEXT);
		mPushAppTextMsg.setText(text);
		mPushAppTextMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppTextMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 微信推送应用图片消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppImageMsgTest(String access_token) {

		Image image = new Image();
		image.setMedia_id("media_id");

		ImageMsg mPushAppImageMsg = new ImageMsg();
		mPushAppImageMsg.setChatid("chatid");
		mPushAppImageMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_IMAGE);
		mPushAppImageMsg.setImage(image);
		mPushAppImageMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppImageMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 微信推送应用语音消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppVoiceMsgTest(String access_token) {

		Voice voice = new Voice();
		voice.setMedia_id("media_id");

		VoiceMsg mPushAppVoiceMsg = new VoiceMsg();
		mPushAppVoiceMsg.setChatid("chatid");
		mPushAppVoiceMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_VOICE);
		mPushAppVoiceMsg.setVoice(voice);
		mPushAppVoiceMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppVoiceMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 微信推送应用视频消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppVideoMsgTest(String access_token) {

		Video video = new Video();
		video.setMedia_id("media_id");
		video.setDescription("description");

		VideoMsg mPushAppVideoMsg = new VideoMsg();
		mPushAppVideoMsg.setChatid("chatid");
		mPushAppVideoMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_VIDEO);
		mPushAppVideoMsg.setVideo(video);
		mPushAppVideoMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppVideoMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 微信推送应用文件消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppFileMsgTest(String access_token) {

		File file = new File();
		file.setMedia_id("media_id");

		FileMsg mPushAppFileMsg = new FileMsg();
		mPushAppFileMsg.setChatid("chatid");
		mPushAppFileMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_FILE);
		mPushAppFileMsg.setFile(file);
		mPushAppFileMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppFileMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 微信推送应用文本卡片消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppTextCardMsgTest(String access_token) {

		TextCard textcard = new TextCard();
		textcard.setTitle("title");
		textcard.setDescription("description");
		textcard.setUrl("url");
		textcard.setBtntxt("btntxt");

		TextCardMsg mPushAppTextCardMsg = new TextCardMsg();
		mPushAppTextCardMsg.setChatid("chatid");
		mPushAppTextCardMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_TEXTCARD);
		mPushAppTextCardMsg.setTextcard(textcard);
		mPushAppTextCardMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppTextCardMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 微信推送应用图文消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppNewsMsgTest(String access_token) {

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

		NewsMsg mPushAppNewsMsg = new NewsMsg();
		mPushAppNewsMsg.setChatid("chatid");
		mPushAppNewsMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_NEWS);
		mPushAppNewsMsg.setNews(news);
		mPushAppNewsMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppNewsMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 微信推送应用图文消息测试
	 * 
	 * @param access_token
	 *            凭证
	 */
	public static void pushAppMpNewsMsgTest(String access_token) {

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

		MpNewsMsg mPushAppMpNewsMsg = new MpNewsMsg();
		mPushAppMpNewsMsg.setChatid("chatid");
		mPushAppMpNewsMsg.setMsgtype(WXMessageUtil.MESSAGE_TYPE_MPNEWS);
		mPushAppMpNewsMsg.setMpnews(mpnews);
		mPushAppMpNewsMsg.setSafe(0);

		// data
		String data = JSONObject.fromObject(mPushAppMpNewsMsg).toString();
		System.out.println(data);
		// send
		pushAppMsg(access_token, data, new HttpResponse() {

			public void onOk(JSONObject object) {
				// TODO Auto-generated method stub

			}

			public void onError(Throwable cause) {
				// TODO Auto-generated method stub

			}
		});
	}
}
