package wx.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONObject;

/**
 * ClassName: WXHttpUtil
 * <p>
 * Description: 微信网络请求工具类
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
 * @date 2018.08.28 15:32
 */
public class WXHttpUtil {

	private WXHttpUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * HttpRequest 请求结果回调接口
	 */
	public static interface HttpResponse {

		/**
		 * 请求成功
		 * 
		 * @param object
		 *            JSONObject
		 */
		void onOk(JSONObject object);

		/**
		 * 请求失败
		 * 
		 * @param cause
		 *            异常
		 */
		void onError(Throwable cause);
	}

	/**
	 * 发起网络请求-异步式
	 * 
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @param resp
	 *            请求结果回调
	 */
	public static void HttpRequest(String requestUrl, String requestMethod,
			HttpResponse resp) {
		HttpRequest(requestUrl, requestMethod, null, resp);
	}

	/**
	 * 发起网络请求-异步式
	 * 
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @param outputStr
	 *            提交的数据
	 * @param resp
	 *            请求结果回调
	 */
	public static void HttpRequest(String requestUrl, String requestMethod,
			String outputStr, HttpResponse resp) {

		try {

			// buffer 缓冲流
			StringBuffer buffer = new StringBuffer();
			// 建立连接
			URL url = new URL(requestUrl);
			// 获取 HttpURLConnection对象
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			// 设置输出流
			connection.setDoOutput(true);
			// 设置输入流
			connection.setDoInput(true);
			// 是否使用缓存
			connection.setUseCaches(false);
			// 请求方式
			connection.setRequestMethod(requestMethod);

			// 流不为空
			if (outputStr != null) {
				// 获取流
				OutputStream out = connection.getOutputStream();
				// 写数据流 UTF-8 编码
				out.write(outputStr.getBytes("UTF-8"));
				// 关闭
				out.close();
			}

			// 流处理
			InputStream input = connection.getInputStream();
			// 读取流 UTF-8 编码
			InputStreamReader inputReader = new InputStreamReader(input,
					"UTF-8");
			// 缓冲流 buffer
			BufferedReader reader = new BufferedReader(inputReader);

			// 定义 String
			String line;
			// 循环读取每一行，知道数据没有了，意思是读取完了
			while ((line = reader.readLine()) != null) {
				// 添加到StringBuffer字符流里面
				buffer.append(line);
			}

			// 关闭连接、释放资源
			reader.close();
			// 关闭
			inputReader.close();
			// 关闭
			input.close();
			// 释放、待gc
			input = null;
			// 关闭连接
			connection.disconnect();

			if (resp != null)
				resp.onOk(JSONObject.fromObject(buffer.toString()));

		} catch (Exception e) {

			if (resp != null)
				resp.onError(e.getCause());
		}

	}

	/**
	 * 发起网络请求-阻塞式
	 * 
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @return JSONObject
	 */
	public static JSONObject HttpRequest4Blocking(String requestUrl,
			String requestMethod) {
		return HttpRequest4Blocking(requestUrl, requestMethod, null);
	}

	/**
	 * 发起网络请求-阻塞式
	 * 
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @param outputStr
	 *            提交的数据
	 * @return JSONObject
	 */
	public static JSONObject HttpRequest4Blocking(String requestUrl,
			String requestMethod, String outputStr) {

		try {

			// buffer 缓冲流
			StringBuffer buffer = new StringBuffer();
			// 建立连接
			URL url = new URL(requestUrl);
			// 获取 HttpURLConnection对象
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			// 设置输出流
			connection.setDoOutput(true);
			// 设置输入流
			connection.setDoInput(true);
			// 是否使用缓存
			connection.setUseCaches(false);
			// 请求方式
			connection.setRequestMethod(requestMethod);

			// 流不为空
			if (outputStr != null) {
				// 获取流
				OutputStream out = connection.getOutputStream();
				// 写数据流 UTF-8 编码
				out.write(outputStr.getBytes("UTF-8"));
				// 关闭
				out.close();
			}

			// 流处理
			InputStream input = connection.getInputStream();
			// 读取流 UTF-8 编码
			InputStreamReader inputReader = new InputStreamReader(input,
					"UTF-8");
			// 缓冲流 buffer
			BufferedReader reader = new BufferedReader(inputReader);

			// 定义 String
			String line;
			// 循环读取每一行，知道数据没有了，意思是读取完了
			while ((line = reader.readLine()) != null) {
				// 添加到StringBuffer字符流里面
				buffer.append(line);
			}

			// 关闭连接、释放资源
			reader.close();
			// 关闭
			inputReader.close();
			// 关闭
			input.close();
			// 释放、待gc
			input = null;
			// 关闭连接
			connection.disconnect();

			return JSONObject.fromObject(buffer.toString());

		} catch (Exception e) {
			System.out.println(e.getCause().toString());
		}

		return null;
	}

	/**
	 * 根据内容类型判断文件扩展名
	 * 
	 * @param contentType
	 *            内容类型
	 * @return 文件扩展名
	 */
	public static String getFileEndWitsh(String contentType) {

		String fileEndWitsh = "";

		if ("image/jpeg".equals(contentType))
			fileEndWitsh = ".jpg";
		else if ("image/png".equals(contentType))
			fileEndWitsh = ".png";
		else if ("audio/mpeg".equals(contentType))
			fileEndWitsh = ".mp3";
		else if ("audio/amr".equals(contentType))
			fileEndWitsh = ".amr";
		else if ("video/mp4".equals(contentType))
			fileEndWitsh = ".mp4";
		else if ("video/mpeg4".equals(contentType))
			fileEndWitsh = ".mp4";
		else if ("voice/amr".equals(contentType))
			fileEndWitsh = ".amr";
		else if (contentType.startsWith("application")) {
			fileEndWitsh = contentType.substring(
					contentType.lastIndexOf("/") + 1,
					(contentType.contains(";") ? contentType.lastIndexOf(";")
							: contentType.length())).trim();
			if (!fileEndWitsh.equals("json"))
				fileEndWitsh = "." + fileEndWitsh;
		}

		return fileEndWitsh;
	}

	/**
	 * 将url进行urlencode编码
	 * 
	 * @param str
	 *            被编码的url
	 * @return 编码后的url
	 */
	public static String URLEncoder(String str) {
		String result = str;
		try {
			result = java.net.URLEncoder.encode(result, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
