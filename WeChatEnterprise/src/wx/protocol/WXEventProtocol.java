package wx.protocol;

import java.util.Map;

import wx.util.WXMessageUtil;

/**
 * ClassName: WXEventProtocol
 * <p>
 * Description: WeChatEnterprise框架事件消息协议
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
 * @date 2018.08.24 17:27
 */
public class WXEventProtocol extends WXBaseProtocol {

	/**
	 * 事件消息协议构造方法
	 * 
	 * @param requestMap
	 */
	protected WXEventProtocol(Map<String, String> requestMap) {
		super(requestMap);
		// 微信事件协议分发
		dispatchWXEventProtocol();
	}

	/**
	 * 微信事件协议分发
	 */
	private void dispatchWXEventProtocol() {

		// 用户关注
		if (Event.equals(WXMessageUtil.EVENT_TYPE_SUBSCRIBE)) {

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "谢谢您的关注");
		}
		// 取消关注
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
			// TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
		}
		// 成员进入应用的事件
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_ENTER_AGENT)) {
			// TODO 成员进入应用的事件

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "成员进入应用的事件");
		}
		// 上报地理位置
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_LOCATION)) {
			// TODO 处理上报地理位置事件

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "地理位置上报事件");
		}
		// 异步任务完成事件推送
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_JOB_DONE)) {
			// TODO 处理异步任务完成事件推送

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "异步任务完成事件推送");
		}
		// 通讯录变更事件
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_CHANGE_CONTACT)) {
			// TODO 处理通讯录变更事件

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "通讯录变更事件推送");

			// 新增成员事件
			if (ChangeType.equals(WXMessageUtil.CHANGE_CONTACT_CREATE_USER)) {

				// 响应给关注者的文本内容
				respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "新增成员");
			}
			// 更新成员事件
			else if (ChangeType.equals(WXMessageUtil.CHANGE_CONTACT_UPDATE_USER)) {

				// 响应给关注者的文本内容
				respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "更新成员");
			}
			// 删除成员事件
			else if (ChangeType.equals(WXMessageUtil.CHANGE_CONTACT_DELETE_USER)) {

				// 响应给关注者的文本内容
				respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "删除成员");
			}
			// 新增部门事件
			else if (ChangeType.equals(WXMessageUtil.CHANGE_CONTACT_CREATE_PARTY)) {

				// 响应给关注者的文本内容
				respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "新增部门");
			}
			// 更新部门事件
			else if (ChangeType.equals(WXMessageUtil.CHANGE_CONTACT_UPDATE_PARTY)) {

				// 响应给关注者的文本内容
				respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "更新部门");
			}
			// 删除部门事件
			else if (ChangeType.equals(WXMessageUtil.CHANGE_CONTACT_DELETE_PARTY)) {

				// 响应给关注者的文本内容
				respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "删除部门");
			}
			// 标签成员变更事件
			else if (ChangeType.equals(WXMessageUtil.CHANGE_CONTACT_UPDATE_TAG)) {

				// 响应给关注者的文本内容
				respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "标签成员变更");
			}
		}
		// 自定义菜单点击事件-click
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_CLICK)) {
			// TODO 处理菜单点击事件

			// 事件KEY值，与创建自定义菜单时指定的KEY值对应
			if (EventKey.equals("1")) {
				// TODO 处理菜单点击事件
			}

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "菜单点击事件，菜单KEY值" + EventKey);
		}
		// 点击菜单跳转链接的事件推送-view
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_VIEW)) {

			// 事件KEY值，与创建自定义菜单时指定的url值对应
			if (EventKey.equals("www.engineer-jsp.cn")) {
				// TODO 处理菜单点击事件
			}

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "菜单点击事件，url = " + EventKey);
		}
		// 扫码推事件的事件推送
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_SCANCODE_PUSH)) {

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "扫码推事件，事件KEY值" + EventKey);
		}
		// 扫码推事件且弹出“消息接收中”提示框的事件推送
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_SCANCODE_WAITMSG)) {

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "扫码推事件且弹出“消息接收中”提示框，事件KEY值" + EventKey);
		}
		// 弹出系统拍照发图的事件推送
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_PIC_SYSPHOTO)) {

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "弹出系统拍照发图，事件KEY值" + EventKey);
		}
		// 弹出拍照或者相册发图的事件推送
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_PIC_PHOTO_OR_ALBUM)) {

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "弹出拍照或者相册发图，事件KEY值" + EventKey);
		}
		// 弹出微信相册发图器的事件推送
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_PIC_WEIXIN)) {

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "弹出微信相册发图器，事件KEY值" + EventKey);
		}
		// 弹出地理位置选择器的事件推送
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_LOCATION_SELECT)) {

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "弹出地理位置选择器，事件KEY值" + EventKey);
		}
		// 扫描带参数二维码
		else if (Event.equals(WXMessageUtil.EVENT_TYPE_SCAN)) {
			// TODO 处理扫描带参数二维码事件

			// 响应给关注者的文本内容
			respXml = WXProtocolManager.respWXTextMsgToXml(requestMap, "扫描带参数二维码事件");
		}

	}

}
