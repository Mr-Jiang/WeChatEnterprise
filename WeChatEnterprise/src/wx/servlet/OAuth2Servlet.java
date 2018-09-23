package wx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.oauth2.WXOAuth2;

/**
 * ClassName: OAuth2Servlet
 * <p>
 * Description: 微信网页授权登录，重定向的Servlet
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
 * @date 2018.08.31 15:50
 */
public class OAuth2Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(final HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// type
		req.setAttribute("type", "oauth2");
		
		// result
		String result = "1";
		
		final String code = req.getParameter("code");

		if (code != null) {

			System.out.println("oauth2 start , code = " + code);

			// get access_token
			String access_token = WXApi.getAccessToken4Blocking();

			System.out.println("oauth2 start , access_token = " + access_token);

			if (access_token != null) {

				// get user_ticket
				JSONObject user_ticket_object = WXOAuth2
						.getCodeToUserId4Blocking(access_token, code);

				String user_ticket = null;

				if (user_ticket_object != null
						&& user_ticket_object.has("user_ticket"))
					user_ticket = user_ticket_object.getString("user_ticket");

				if (user_ticket != null) {

					System.out.println("oauth2 start , user_ticket = "
							+ user_ticket);

					// get user info
					JSONObject userinfo_object = WXOAuth2
							.getTicketToUserInfo4Blocking(access_token,
									user_ticket);

					if(userinfo_object != null){
						
						int errcode = userinfo_object.getInt("errcode");
						
						if (errcode == 0) {
							
							result = "0";
							
							// avatar
							req.setAttribute("avatar", userinfo_object.getString("avatar"));
							// name
							req.setAttribute("name", userinfo_object.getString("name"));
							// gender
							req.setAttribute("gender", userinfo_object.getString("gender"));
							// user id
							req.setAttribute("userid", userinfo_object.getString("userid"));
							// mobile
							req.setAttribute("mobile", userinfo_object.getString("mobile"));
							// email
							req.setAttribute("email", userinfo_object.getString("email"));
							// qr_code
							req.setAttribute("qr_code", userinfo_object.getString("qr_code"));
							
						}else{
							// errcode
							req.setAttribute("errcode", errcode);
						}
					}
					
				}
				
			}

		} else {

			result = "1";
			
			System.out.println("oauth2 failed , code = "
					+ (code == null ? "null" : code));
			
		}
		
		System.out.println(" ");
		System.out.println("*******************分割线************************");
		System.out.println(" ");

		// result
		req.setAttribute("result", result);
		// 跳转到index.jsp
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
