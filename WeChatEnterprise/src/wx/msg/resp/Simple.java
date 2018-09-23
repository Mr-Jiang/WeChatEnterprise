package wx.msg.resp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import wx.msg.resp.WXTextMsg;
import wx.msg.resp.WXArticleMsg.Article;
import wx.msg.resp.WXImageMsg.Image;
import wx.msg.resp.WXMusicMsg.Music;
import wx.msg.resp.WXVideoMsg.Video;
import wx.msg.resp.WXVoiceMsg.Voice;
import wx.util.WXMessageUtil;

/**
 * ClassName: Simple
 * <p>
 * Description: 微信被动响应消息(response)正确性验证
 * <p>
 * Copyright: Copyright (c) 2018
 * <p>
 * GitHub:<a href="https://github.com/Mr-Jiang">https://github.com/Mr-Jiang</a>
 * <p>
 * Blog:
 * <a href="https://blog.csdn.net/jspping?viewmode=contents">https://blog.csdn.
 * net/jspping?viewmode=contents</a>
 * <p>
 * Personal Home Page:
 * <a href="http://www.engineer-jsp.cn/">http://www.engineer-jsp.cn/</a>
 * 
 * @author <a href="https://github.com/Mr-Jiang">Mr-Jiang</a>
 * @date 2018.08.31 16:24
 */
public class Simple {

	/** 接收方账号 */
	private static final String FromUserName = "FromUserName";

	/** 发送方账号 */
	private static final String ToUserName = "ToUserName";

	public static void main(String[] args) {

		// 检测文本消息转xml是否正确
		WXTextMsgToXmlTest();

		// 检测音乐消息转xml是否正确
		WXMusicMsgToXmlTest();

		// 检测图片消息转xml是否正确
		WXImageMsgToXmlTest();

		// 检测音频消息转xml是否正确
		WXVoiceMsgToXmlTest();

		// 检测视频消息转xml是否正确
		WXVideoMsgToXmlTest();

		// 检测图文消息转xml是否正确
		WXArticleMsgToXmlTest();

	}

	/**
	 * 文本消息转成xml正确性测试
	 */
	private static void WXTextMsgToXmlTest() {

		WXTextMsg mWXTextMsg = new WXTextMsg();
		mWXTextMsg.setToUserName(FromUserName);
		mWXTextMsg.setFromUserName(ToUserName);
		mWXTextMsg.setCreateTime(new Date().getTime());
		mWXTextMsg.setMsgType(WXMessageUtil.MESSAGE_TYPE_TEXT);
		mWXTextMsg.setContent("Content");

		System.out.println(WXMessageUtil.WXTextMsgToXml(mWXTextMsg) + "\n");
	}

	/**
	 * 音乐消息转成xml正确性测试
	 */
	private static void WXMusicMsgToXmlTest() {

		Music music = new Music();
		music.setTitle("title");
		music.setMusicUrl("musicUrl");
		music.setDescription("description");
		music.setHQMusicUrl("hq_musicUrl");

		WXMusicMsg mWXMusicMsg = new WXMusicMsg();
		mWXMusicMsg.setToUserName(FromUserName);
		mWXMusicMsg.setFromUserName(ToUserName);
		mWXMusicMsg.setCreateTime(new Date().getTime());
		mWXMusicMsg.setMsgType(WXMessageUtil.MESSAGE_TYPE_MUSIC);
		mWXMusicMsg.setMusic(music);

		System.out.println(WXMessageUtil.WXMusicMsgToXml(mWXMusicMsg) + "\n");
	}

	/**
	 * 图片消息转成xml正确性测试
	 */
	private static void WXImageMsgToXmlTest() {

		Image image = new Image();
		image.setMediaId("mediaId");

		WXImageMsg mWXImageMsg = new WXImageMsg();
		mWXImageMsg.setToUserName(FromUserName);
		mWXImageMsg.setFromUserName(ToUserName);
		mWXImageMsg.setCreateTime(new Date().getTime());
		mWXImageMsg.setMsgType(WXMessageUtil.MESSAGE_TYPE_IMAGE);
		mWXImageMsg.setImage(image);

		System.out.println(WXMessageUtil.WXImageMsgToXml(mWXImageMsg) + "\n");
	}

	/**
	 * 音频消息转成xml正确性测试
	 */
	private static void WXVoiceMsgToXmlTest() {

		Voice voice = new Voice();
		voice.setMediaId("mediaId");

		WXVoiceMsg mWXVoiceMsg = new WXVoiceMsg();
		mWXVoiceMsg.setToUserName(FromUserName);
		mWXVoiceMsg.setFromUserName(ToUserName);
		mWXVoiceMsg.setCreateTime(new Date().getTime());
		mWXVoiceMsg.setMsgType(WXMessageUtil.MESSAGE_TYPE_VOICE);
		mWXVoiceMsg.setVoice(voice);

		System.out.println(WXMessageUtil.WXVoiceMsgToXml(mWXVoiceMsg) + "\n");
	}

	/**
	 * 视频消息转成xml正确性测试
	 */
	private static void WXVideoMsgToXmlTest() {

		Video video = new Video();
		video.setTitle("title");
		video.setMediaId("mediaId");
		video.setDescription("description");

		WXVideoMsg mWXVideoMsg = new WXVideoMsg();
		mWXVideoMsg.setToUserName(FromUserName);
		mWXVideoMsg.setFromUserName(ToUserName);
		mWXVideoMsg.setCreateTime(new Date().getTime());
		mWXVideoMsg.setMsgType(WXMessageUtil.MESSAGE_TYPE_VIDEO);
		mWXVideoMsg.setVideo(video);

		System.out.println(WXMessageUtil.WXVideoMsgToXml(mWXVideoMsg) + "\n");
	}

	/**
	 * 图文消息转成xml正确性测试
	 */
	private static void WXArticleMsgToXmlTest() {

		List<Article> articles = new ArrayList<Article>();

		Article article1 = new Article();
		article1.setTitle("title1");
		article1.setPicUrl("picUrl1");
		article1.setDescription("description1");
		article1.setUrl("url1");

		Article article2 = new Article();
		article2.setTitle("title2");
		article2.setPicUrl("picUrl2");
		article2.setDescription("description2");
		article2.setUrl("url2");

		articles.add(article1);
		articles.add(article2);

		WXArticleMsg mWXArticleMsg = new WXArticleMsg();
		mWXArticleMsg.setToUserName(FromUserName);
		mWXArticleMsg.setFromUserName(ToUserName);
		mWXArticleMsg.setCreateTime(new Date().getTime());
		mWXArticleMsg.setMsgType(WXMessageUtil.MESSAGE_TYPE_NEWS);
		mWXArticleMsg.setArticles(articles);
		mWXArticleMsg.setArticleCount(articles.size());

		System.out.println(WXMessageUtil.WXArticleMsgToXml(mWXArticleMsg) + "\n");
	}
}
