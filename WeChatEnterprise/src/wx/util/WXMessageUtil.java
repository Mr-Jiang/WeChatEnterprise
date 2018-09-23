package wx.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import wx.msg.resp.WXArticleMsg;
import wx.msg.resp.WXImageMsg;
import wx.msg.resp.WXMusicMsg;
import wx.msg.resp.WXTextMsg;
import wx.msg.resp.WXVideoMsg;
import wx.msg.resp.WXVoiceMsg;

/**
 * ClassName: WXMessageUtil
 * <p>
 * Description: WeChatEnterprise框架消息处理工具类
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
 * @date 2018.08.24 13:48
 */
public class WXMessageUtil {

	private WXMessageUtil() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * *********************************
	 * 
	 * ************ message type *******
	 * 
	 * *********************************
	 */

	/** 消息类型：文本 */
	public static final String MESSAGE_TYPE_TEXT = "text";

	/** 消息类型：链接 */
	public static final String MESSAGE_TYPE_LINK = "link";

	/** 消息类型：图片 */
	public static final String MESSAGE_TYPE_IMAGE = "image";

	/** 消息类型：地理位置 */
	public static final String MESSAGE_TYPE_LOCATION = "location";

	/** 消息类型：音乐 */
	public static final String MESSAGE_TYPE_MUSIC = "music";

	/** 消息类型：音频 */
	public static final String MESSAGE_TYPE_VOICE = "voice";

	/** 消息类型：视频 */
	public static final String MESSAGE_TYPE_VIDEO = "video";

	/** 消息类型：文件 */
	public static final String MESSAGE_TYPE_FILE = "file";

	/** 消息类型：文本卡片 */
	public static final String MESSAGE_TYPE_TEXTCARD = "textcard";

	/** 消息类型：news图文 */
	public static final String MESSAGE_TYPE_NEWS = "news";

	/** 消息类型：mpnews图文 */
	public static final String MESSAGE_TYPE_MPNEWS = "mpnews";

	/** 消息类型：事件推送 */
	public static final String MESSAGE_TYPE_EVENT = "event";

	/*
	 * *********************************
	 * 
	 * ************ event type *********
	 * 
	 * *********************************
	 */

	/** 事件类型：subscribe(关注) */
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";

	/** 事件类型：unsubscribe(取消关注) */
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";

	/** 事件类型：成员进入应用 */
	public static final String EVENT_TYPE_ENTER_AGENT = "enter_agent";

	/** 事件类型：地理位置上报 */
	public static final String EVENT_TYPE_LOCATION = "LOCATION";

	/** 事件类型：异步任务完成事件推送 */
	public static final String EVENT_TYPE_JOB_DONE = "batch_job_result";

	/** 事件类型：通讯录变更事件 */
	public static final String EVENT_TYPE_CHANGE_CONTACT = "change_contact";

	/** 事件类型：click(自定义菜单点击事件) */
	public static final String EVENT_TYPE_CLICK = "click";

	/** 事件类型：view(点击菜单跳转链接的事件推送) */
	public static final String EVENT_TYPE_VIEW = "view";

	/** 事件类型：扫码推事件的事件推送 */
	public static final String EVENT_TYPE_SCANCODE_PUSH = "scancode_push";

	/** 事件类型：扫码推事件且弹出“消息接收中”提示框的事件推送 */
	public static final String EVENT_TYPE_SCANCODE_WAITMSG = "scancode_waitmsg";

	/** 弹出系统拍照发图的事件推送 */
	public static final String EVENT_TYPE_PIC_SYSPHOTO = "pic_sysphoto";

	/** 弹出拍照或者相册发图的事件推送 */
	public static final String EVENT_TYPE_PIC_PHOTO_OR_ALBUM = "pic_photo_or_album";

	/** 弹出微信相册发图器的事件推送 */
	public static final String EVENT_TYPE_PIC_WEIXIN = "pic_weixin";

	/** 弹出地理位置选择器的事件推送 */
	public static final String EVENT_TYPE_LOCATION_SELECT = "location_select";

	/** 事件类型：扫二维码 */
	public static final String EVENT_TYPE_SCAN = "scan";

	/*
	 * *********************************
	 * 
	 * ************ change contact type*
	 * 
	 * *********************************
	 */

	/** 更改类型：新增成员事件 */
	public static final String CHANGE_CONTACT_CREATE_USER = "create_user";

	/** 更改类型：更新成员事件 */
	public static final String CHANGE_CONTACT_UPDATE_USER = "update_user";

	/** 更改类型：删除成员事件 */
	public static final String CHANGE_CONTACT_DELETE_USER = "delete_user";

	/** 更改类型：新增部门事件 */
	public static final String CHANGE_CONTACT_CREATE_PARTY = "create_party";

	/** 更改类型：更新部门事件 */
	public static final String CHANGE_CONTACT_UPDATE_PARTY = "update_party";

	/** 更改类型：删除部门事件 */
	public static final String CHANGE_CONTACT_DELETE_PARTY = "delete_party";

	/** 更改类型：标签成员变更事件 */
	public static final String CHANGE_CONTACT_UPDATE_TAG = "update_tag";

	/**
	 * 解析微信发来的请求（XML）
	 * 
	 * @param request
	 * @return Map
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> parseXml(String request) throws Exception {

		// 将解析结果存储在HashMap中
		Map<String, String> map = new HashMap<String, String>();
		// 从request中取得输入流
		InputStream inputStream = new ByteArrayInputStream(request
				.getBytes("UTF-8"));
		// 读取输入流
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		// 得到xml根元素
		Element root = document.getRootElement();
		// 得到根元素的所有子节点
		List<Element> elementList = root.elements();

		// 遍历所有子节点
		for (Element e : elementList)
			map.put(e.getName(), e.getText());

		// 释放资源
		inputStream.close();
		inputStream = null;

		return map;
	}

	/**
	 * 微信文本类型消息对象转换成xml
	 * 
	 * @param mWXTextMsg
	 *            微信文本类型消息对象
	 * @return xml
	 */
	public static String WXTextMsgToXml(WXTextMsg mWXTextMsg) {
		xstream.alias("xml", mWXTextMsg.getClass());
		return xstream.toXML(mWXTextMsg);
	}

	/**
	 * 微信音乐类型消息对象转换成xml
	 * 
	 * @param mWXMusicMsg
	 *            微信音乐类型消息对象
	 * @return xml
	 */
	public static String WXMusicMsgToXml(WXMusicMsg mWXMusicMsg) {
		xstream.alias("xml", mWXMusicMsg.getClass());
		return xstream.toXML(mWXMusicMsg);
	}

	/**
	 * 微信图片类型消息对象转换成xml
	 * 
	 * @param mWXImageMsg
	 *            微信图片类型消息对象
	 * @return xml
	 */
	public static String WXImageMsgToXml(WXImageMsg mWXImageMsg) {
		xstream.alias("xml", mWXImageMsg.getClass());
		return xstream.toXML(mWXImageMsg);
	}

	/**
	 * 微信音频类型消息对象转换成xml
	 * 
	 * @param mWXVoiceMsg
	 *            微信音频类型消息对象
	 * @return xml
	 */
	public static String WXVoiceMsgToXml(WXVoiceMsg mWXVoiceMsg) {
		xstream.alias("xml", mWXVoiceMsg.getClass());
		return xstream.toXML(mWXVoiceMsg);
	}

	/**
	 * 微信视频类型消息对象转换成xml
	 * 
	 * @param mWXVideoMsg
	 *            微信视频类型消息对象
	 * @return xml
	 */
	public static String WXVideoMsgToXml(WXVideoMsg mWXVideoMsg) {
		xstream.alias("xml", mWXVideoMsg.getClass());
		return xstream.toXML(mWXVideoMsg);
	}

	/**
	 * 微信图文类型消息对象转换成xml
	 * 
	 * @param mWXNewsMsg
	 *            微信图文类型消息对象
	 * @return xml
	 */
	public static String WXArticleMsgToXml(WXArticleMsg mWXArticleMsg) {
		xstream.alias("xml", mWXArticleMsg.getClass());
		xstream.alias("item", new WXArticleMsg.Article().getClass());
		return xstream.toXML(mWXArticleMsg);
	}

	/**
	 * 扩展xstream，使其支持CDATA块
	 * 
	 * @date 2013-05-19
	 */
	private static XStream xstream = new XStream(new XppDriver() {
		public HierarchicalStreamWriter createWriter(Writer out) {
			return new PrettyPrintWriter(out) {
				// 对所有xml节点的转换都增加CDATA标记
				boolean cdata = true;

				public void startNode(String name, Class clazz) {
					super.startNode(name, clazz);
				}

				protected void writeText(QuickWriter writer, String text) {
					if (cdata) {
						writer.write("<![CDATA[");
						writer.write(text);
						writer.write("]]>");
					} else {
						writer.write(text);
					}
				}
			};
		}
	});

	/**
	 * emoji表情转换(hex -> utf-16)
	 * 
	 * @param hexEmoji
	 * @return U+替换为0x（零x）
	 */
	public static String Hex2Emoji(int hexEmoji) {
		return String.valueOf(Character.toChars(hexEmoji));
	}
}