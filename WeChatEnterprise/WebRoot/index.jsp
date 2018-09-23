<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>WeChatEnterprise</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>
		<center>
			This is WeChatEnterprise @author Engineer-Jsp.
			<br>
			<p>
				GitHub
				<a href="https://github.com/Mr-Jiang">https://github.com/Mr-Jiang</a>
			</p>
			<p>
				CSDN Blog
				<a href="https://blog.csdn.net/jspping?viewmode=contents">https://blog.csdn.net/jspping?viewmode=contents</a>
			</p>
			<p>
				Personal Home Page
				<a href="http://www.engineer-jsp.cn/">http://www.engineer-jsp.cn/</a>
			</p>
			<br>
			<%
		Object object_type = request.getAttribute("type");

		if (object_type != null) {

			String type = object_type.toString();

			if (type != null) {

				Object object_result = request.getAttribute("result");

				if (object_result != null) {

					String result = object_result.toString();

					if (result != null) {

						// oauth2
						if (type.equals("oauth2")) {

							// oauth2 success
							if (result.equals("0")) {

								Object object_avatar = request.getAttribute("avatar");
								if (object_avatar != null) {
									String avatar = object_avatar.toString();
									if (avatar != null) {
										out.print("------ 授权成功 ------");
										out.print("<br>");
										out.print("<br>");

										String format = "<img width=\"%d\" height=\"%d\" src=\"%s\">";
										out.print(String.format(format, 200, 200, avatar));
										out.print("<br>");
										out.print("<br>");
									}
								}

								Object object_name = request.getAttribute("name");
								if (object_name != null) {
									String name = object_name.toString();
									if (name != null) {
										out.print("姓名 : " + name);
										out.print("<br>");
									}
								}

								Object object_gender = request.getAttribute("gender");
								if (object_gender != null) {
									String gender = object_gender.toString();
									if (gender != null) {
										out.print("性别 : " + (gender.equals("1") ? "男" : "女"));
										out.print("<br>");
										out.print("<br>");
									}
								}

								Object object_userid = request.getAttribute("userid");
								if (object_userid != null) {
									String userid = object_userid.toString();
									if (userid != null) {
										out.print("userid : " + userid);
										out.print("<br>");
									}
								}

								Object object_mobile = request.getAttribute("mobile");
								if (object_mobile != null) {
									String mobile = object_mobile.toString();
									if (mobile != null) {
										out.print("电话 : " + mobile);
										out.print("<br>");
									}
								}

								Object object_email = request.getAttribute("email");
								if (object_email != null) {
									String email = object_email.toString().trim();
									if (email != null && email.getBytes().length > 2) {
										out.print("邮箱 : " + email);
										out.print("<br>");
									} else {
										out.print("邮箱 : " + "未设置邮箱");
										out.print("<br>");
									}
								}

								Object object_qr_code = request.getAttribute("qr_code");
								if (object_qr_code != null) {
									String qr_code = object_qr_code.toString();
									if (qr_code != null) {
										String format = "<img src=\"%s\">";
										out.print(String.format(format, qr_code));
									}
								}
							} else {
							
								out.print("------ 授权失败 ------");
								out.print("<br>");
								out.print("<br>");
								
								Object object_errcode = request.getAttribute("errcode");
								if (object_errcode != null) {
									String errcode = object_errcode.toString();
									if (errcode != null) {
										out.print("返回码 : " + errcode);
									}
								}
							}
						}
						// validation
						else if (type.equals("validation")) {

							if (result.equals("0")) {
								out.print("------ 二次验证成功 ------");
							} else {
							
								out.print("------ 二次验证失败 ------");
								out.print("<br>");
								out.print("<br>");
								
								Object object_errcode = request.getAttribute("errcode");
								if (object_errcode != null) {
									String errcode = object_errcode.toString();
									if (errcode != null) {
										out.print("返回码 : " + errcode);
									}
								}
							}
						}

					}

				}
			}
		}				
			%>
		</center>
	</body>
</html>
