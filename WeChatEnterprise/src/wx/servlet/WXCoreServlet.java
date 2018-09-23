package wx.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import wx.api.WXApi;
import wx.encryption.AesException;
import wx.encryption.WXBizMsgCrypt;
import wx.protocol.WXProtocolManager;

/**
 * ClassName: WXCoreServlet
 * <p>
 * Description: 微信企业号核心Servlet
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
 * @date 2018.08.24 10:55
 */
public class WXCoreServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 获取微信加密签名
		String msgSignature = req.getParameter("msg_signature");
		// 获取时间戳
		String timeStamp = req.getParameter("timestamp");
		// 获取随机数
		String nonce = req.getParameter("nonce");
		// 获取随机字符串
		String echoStr = req.getParameter("echostr");

		// getWriter
		PrintWriter out = resp.getWriter();

		try {

			WXBizMsgCrypt mWXBizMsgCrypt = new WXBizMsgCrypt(WXApi.Token,
					WXApi.EncodingAesKey, WXApi.CorpId);
			// 验证URL
			String DecryptEchostr = mWXBizMsgCrypt.VerifyURL(msgSignature,
					timeStamp, nonce, echoStr);

			// 验证失败
			if (DecryptEchostr == null)
				// 默认以下字符
				DecryptEchostr = "url verify error";

			out.print(DecryptEchostr);
			out.close();

		} catch (AesException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 将请求的编码设置为UTF-8，防止中文乱码
		req.setCharacterEncoding("UTF-8");
		// 将响应的编码设置为UTF-8，防止中文乱码
		resp.setCharacterEncoding("UTF-8");

		// 获取微信加密签名
		String msgSignature = req.getParameter("msg_signature");
		// 获取时间戳
		String timeStamp = req.getParameter("timestamp");
		// 获取随机数
		String nonce = req.getParameter("nonce");

		// 从请求中读取post数据的流
		InputStream inputStream = req.getInputStream();
		// 获取post string
		String post = IOUtils.toString(inputStream, "UTF-8");

		try {

			WXBizMsgCrypt mWXBizMsgCrypt = new WXBizMsgCrypt(WXApi.Token,
					WXApi.EncodingAesKey, WXApi.CorpId);
			// 检验消息的真实性，并且获取解密后的明文
			String DecryptMsg = mWXBizMsgCrypt.DecryptMsg(msgSignature,
					timeStamp, nonce, post);
			// 调用微信协议管理类，接收消息、解析消息、协议分发、处理消息、响应消息
			String respMsg = WXProtocolManager.WXProtocolAnalysis(DecryptMsg);

			// 响应消息不为null
			if (respMsg != null) {

				// 加密响应的消息
				String encryptMsg = mWXBizMsgCrypt.EncryptMsg(respMsg,
						timeStamp, nonce);
				// getWriter
				PrintWriter out = resp.getWriter();
				// 响应消息
				out.print(encryptMsg);
				// 关闭流
				out.close();
			}

		} catch (AesException e) {
			System.out.println(e.getCause().toString());
		}

	}

}
