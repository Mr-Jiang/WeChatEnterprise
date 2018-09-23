package wx.menu;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.ThreadPoolManager;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: WXMenuManager
 * <p>
 * Description: 微信导航栏、菜单管理
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
 * @date 2018.08.27 17:34
 */
public class WXMenuManager {

	private WXMenuManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 生成微信导航栏post数据
	 * 
	 * @return 微信导航栏bean
	 */
	private static WXNavigationBar createWXNavigationBar() {

		// click类型菜单(点击推事件)
		WXClickMenu menu1 = new WXClickMenu();
		menu1.setName("接入游戏");
		menu1.setType("click");
		menu1.setKey("1");

		// view类型菜单(跳转URL)
		WXViewMenu menu2 = new WXViewMenu();
		menu2.setName("授权登录");
		menu2.setType("view");
		menu2.setUrl(WXApi.getOauth2CodeUrl(1000002));

		// location_select类型即位置选择发送菜单(弹出地理位置选择器)
		WXClickMenu menu3 = new WXClickMenu();
		menu3.setName("发送位置");
		menu3.setType("location_select");
		menu3.setKey("3");

		// scancode_push 扫码事件推送类型菜单(扫码推事件)
		WXClickMenu menu4 = new WXClickMenu();
		menu4.setName("扫描事件");
		menu4.setType("scancode_push");
		menu4.setKey("4");

		// scancode_waitmsg 扫描提示类型菜单(扫码推事件 且弹出“消息接收中”提示框)
		WXClickMenu menu5 = new WXClickMenu();
		menu5.setName("扫描提示");
		menu5.setType("scancode_waitmsg");
		menu5.setKey("5");

		// pic_sysphoto 弹出系统拍照发图菜单(弹出系统拍照发图)
		WXClickMenu menu6 = new WXClickMenu();
		menu6.setName("系统拍照");
		menu6.setType("pic_sysphoto");
		menu6.setKey("6");

		// pic_photo_or_album 弹出拍照或者相册发图
		WXClickMenu menu7 = new WXClickMenu();
		menu7.setName("拍照相册");
		menu7.setType("pic_photo_or_album");
		menu7.setKey("7");

		// pic_weixin 弹出企业微信相册发图器
		WXClickMenu menu8 = new WXClickMenu();
		menu8.setName("微信相册");
		menu8.setType("pic_weixin");
		menu8.setKey("8");

		// 主菜单：点击位置，包含3个二级菜单(view、click、location_select)
		WXMainMenu mainMenu1 = new WXMainMenu();
		mainMenu1.setName("点击位置");
		mainMenu1.setSub_button(new WXBaseMenu[] { menu1, menu2, menu3 });

		// 主菜单：扫描事件，包含2个二级菜单(scancode_push、scancode_waitmsg)
		WXMainMenu mainMenu2 = new WXMainMenu();
		mainMenu2.setName("扫描事件");
		mainMenu2.setSub_button(new WXBaseMenu[] { menu4, menu5 });

		// 主菜单：拍照相册，包含3个二级菜单(pic_sysphoto、pic_photo_or_album、pic_weixin)
		WXMainMenu mainMenu3 = new WXMainMenu();
		mainMenu3.setName("拍照相册");
		mainMenu3.setSub_button(new WXBaseMenu[] { menu6, menu7, menu8 });

		// 导航栏-包含3个主菜单-(点击位置、扫描事件、拍照相册)
		WXNavigationBar mWXNavigationBar = new WXNavigationBar();
		mWXNavigationBar.setButton(new WXBaseMenu[] { mainMenu1, mainMenu2,
				mainMenu3 });

		return mWXNavigationBar;
	}

	/**
	 * 创建菜单
	 * 
	 * @param access_token
	 *            凭证
	 * @param agentid
	 *            应用id
	 */
	public static void createMenu(String access_token, int agentid) {

		// url
		final String url = String.format(WXApi.WX_CREATE_MENU, access_token,
				agentid);
		// data
		final String data = JSONObject.fromObject(createWXNavigationBar())
				.toString();
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
	 * 获取菜单
	 * 
	 * @param access_token
	 *            凭证
	 * @param agentid
	 *            应用id
	 */
	public static void getMenu(String access_token, int agentid) {

		// url
		final String url = String.format(WXApi.WX_GET_MENU, access_token,
				agentid);
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
	 * 删除菜单
	 * 
	 * @param access_token
	 *            凭证
	 * @param agentid
	 *            应用id
	 */
	public static void deleteMenu(String access_token, int agentid) {

		// url
		final String url = String.format(WXApi.WX_DELETE_MENU, access_token,
				agentid);
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
