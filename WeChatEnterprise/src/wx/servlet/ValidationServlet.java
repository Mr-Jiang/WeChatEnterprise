package wx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.oauth2.WXOAuth2;
import wx.util.WXHttpUtil;

/**
 * ClassName: ValidationServlet
 * <p>
 * Description: 微信二次验证，重定向的Servlet
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
 * @date 2018.09.15 09:10
 */
public class ValidationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(final HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// type
		req.setAttribute("type", "validation");
		
		// result
		String result = "1";
		
		final String code = req.getParameter("code");

		if (code != null) {

			System.out.println("validation start , code = " + code);

			// get access_token
			String access_token = WXApi.getAccessToken4Blocking();

			System.out.println("validation start , access_token = "
					+ access_token);

			if (access_token != null) {

				// get userid
				JSONObject userid_object = WXOAuth2.getCodeToUserId4Blocking(
						access_token, code);

				String userid = null;

				if (userid_object != null) {

					if (userid_object.has("UserId")) {
						userid = userid_object.getString("UserId");
					} else {
						
						System.out
								.println("validation userid not exists , userid_object = "
										+ userid_object.toString());
					}
				}

				if (userid != null) {

					System.out.println("validation start , userid = " + userid);

					// get validation result
					JSONObject object = getValidationResult(access_token, userid);

					if(object!=null){
						
						int errcode = object.getInt("errcode");
						
						// validation success
						if (errcode == 0) {
							result = "0";
						}
						// validation failed
						else{
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

	/**
	 * 对uesrid进行二次验证
	 * 
	 * @param access_token
	 *            凭证
	 * @param userid 成员userid
	 * @return JSONObject
	 */
	private JSONObject getValidationResult(String access_token,
			String userid) {
		// url
		final String url = String.format(WXApi.WX_SECONDARY_VALIDATION,
				access_token, userid);
		// request
		return WXHttpUtil.HttpRequest4Blocking(url, WXApi.GET);
	}

}
