package wx.media;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONObject;
import wx.api.WXApi;
import wx.util.WXHttpUtil;
import wx.util.WXHttpUtil.HttpResponse;

/**
 * ClassName: MaterialManager
 * <p>
 * Description: 微信素材管理
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
 * @date 2018.08.29 16:13
 */
public class MaterialManager {

	private MaterialManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 上传临时素材
	 * 
	 * @param access_token
	 *            凭证
	 * @param type
	 *            媒体文件类型
	 * @param fileAddress
	 *            上传文件的地址
	 * @param resp
	 *            请求结果回调
	 */
	public static void uploadTemporaryMaterial(String access_token, String type, String fileAddress,
			HttpResponse resp) {

		// 拼装请求地址
		String url = String.format(WXApi.WX_UPLOAD_TEMPORARY_MATERIAL, access_token, type);

		// 定义数据分隔符
		String boundary = "------------acebdf13572468";

		try {

			URL uploadUrl = new URL(url);
			HttpURLConnection uploadConn = (HttpURLConnection) uploadUrl.openConnection();
			uploadConn.setDoOutput(true);
			uploadConn.setDoInput(true);
			uploadConn.setRequestMethod(WXApi.POST);
			// 设置请求头Content-Type
			uploadConn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
			// 获取媒体文件上传的输出流（往微信服务器写数据）
			OutputStream outputStream = uploadConn.getOutputStream();

			URL mediaUrl = new URL(fileAddress);
			HttpURLConnection meidaConn = (HttpURLConnection) mediaUrl.openConnection();
			meidaConn.setDoOutput(true);
			meidaConn.setRequestMethod(WXApi.GET);

			String contentType = meidaConn.getHeaderField("Content-Type");
			// 根据内容类型判断文件扩展名
			String fileExt = WXHttpUtil.getFileEndWitsh(contentType);

			// 请求体开始
			outputStream.write(("--" + boundary + "\r\n").getBytes());
			outputStream.write(
					String.format("Content-Disposition: form-data; name=\"media\"; filename=\"file1%s\"\r\n", fileExt)
							.getBytes());
			outputStream.write(String.format("Content-Type: %s\r\n\r\n", contentType).getBytes());

			// 获取媒体文件的输入流（读取文件）
			BufferedInputStream bis = new BufferedInputStream(meidaConn.getInputStream());
			byte[] buf = new byte[8096];
			int size = 0;
			while ((size = bis.read(buf)) != -1) {
				// 将媒体文件写到输出流（往微信服务器写数据）
				outputStream.write(buf, 0, size);
			}

			// 请求体结束
			outputStream.write(("\r\n--" + boundary + "--\r\n").getBytes());
			outputStream.close();
			bis.close();
			meidaConn.disconnect();

			// 获取媒体文件上传的输入流（从微信服务器读数据）
			InputStream inputStream = uploadConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			StringBuffer buffer = new StringBuffer();
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}

			bufferedReader.close();
			inputStreamReader.close();
			// 释放资源
			inputStream.close();
			inputStream = null;
			uploadConn.disconnect();

			if (resp != null)
				resp.onOk(JSONObject.fromObject(buffer.toString()));

		} catch (Exception e) {

			if (resp != null)
				resp.onError(e.getCause());
		}
	}

	/**
	 * 获取临时素材
	 * 
	 * @param access_token
	 *            凭证
	 * @param mediaId
	 *            媒体文件id
	 * @param savePath
	 *            获取媒体文件成功后，保存的地址
	 * @param resp
	 *            请求结果回调接口
	 */
	public static void getTemporaryMaterial(String access_token, String mediaId, String savePath, HttpResponse resp) {

		String filePath = null;
		// 拼接请求地址
		String url = String.format(WXApi.WX_GET_TEMPORARY_MATERIAL, access_token, mediaId);

		try {

			URL getUrl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) getUrl.openConnection();
			conn.setDoInput(true);
			conn.setRequestMethod(WXApi.GET);

			// 根据内容类型获取扩展名
			String fileExt = WXHttpUtil.getFileEndWitsh(conn.getHeaderField("Content-Type")).trim();

			// 判断Content类型
			if (fileExt.equals("json")) {

				// 获取媒体文件上传的输入流（从微信服务器读数据）
				InputStream inputStream = conn.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

				StringBuffer buffer = new StringBuffer();
				String str = null;
				while ((str = bufferedReader.readLine()) != null) {
					buffer.append(str);
				}

				bufferedReader.close();
				inputStreamReader.close();
				// 释放资源
				inputStream.close();
				inputStream = null;

				if (resp != null)
					resp.onOk(JSONObject.fromObject(buffer.toString()));

			} else {

				if (!savePath.endsWith("/")) {
					savePath += "/";
				}

				// 将mediaId作为文件名
				filePath = savePath + mediaId + fileExt;

				System.out.println("filePath = " + filePath);

				File file = new File(filePath);
				if (file.exists())
					file.delete();

				BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
				FileOutputStream fos = new FileOutputStream(file);
				byte[] buf = new byte[8096];
				int size = 0;
				while ((size = bis.read(buf)) != -1)
					fos.write(buf, 0, size);

				fos.close();
				bis.close();
				conn.disconnect();
			}

		} catch (Exception e) {

			if (resp != null)
				resp.onError(e.getCause());
		}

	}

	/**
	 * 上传图片
	 * 
	 * @param access_token
	 *            凭证
	 * @param fileAddress
	 *            上传文件的地址
	 * @param resp
	 *            请求结果回调接口
	 */
	public static void uploadPicture(String access_token, String fileAddress, HttpResponse resp) {

		// 拼装请求地址
		String url = String.format(WXApi.WX_UPLOAD_PICTURE, access_token);

		// 定义数据分隔符
		String boundary = "------------acebdf13572468";

		try {

			URL uploadUrl = new URL(url);
			HttpURLConnection uploadConn = (HttpURLConnection) uploadUrl.openConnection();
			uploadConn.setDoOutput(true);
			uploadConn.setDoInput(true);
			uploadConn.setRequestMethod(WXApi.POST);
			// 设置请求头Content-Type
			uploadConn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
			// 获取媒体文件上传的输出流（往微信服务器写数据）
			OutputStream outputStream = uploadConn.getOutputStream();

			URL mediaUrl = new URL(fileAddress);
			HttpURLConnection meidaConn = (HttpURLConnection) mediaUrl.openConnection();
			meidaConn.setDoOutput(true);
			meidaConn.setRequestMethod(WXApi.GET);

			// 从请求头中获取内容类型
			String contentType = meidaConn.getHeaderField("Content-Type");
			// 根据内容类型判断文件扩展名
			String fileExt = WXHttpUtil.getFileEndWitsh(contentType);
			// 请求体开始
			outputStream.write(("--" + boundary + "\r\n").getBytes());
			outputStream.write(
					String.format("Content-Disposition: form-data; name=\"media\"; filename=\"file1%s\"\r\n", fileExt)
							.getBytes());
			outputStream.write(String.format("Content-Type: %s\r\n\r\n", contentType).getBytes());

			// 获取媒体文件的输入流（读取文件）
			BufferedInputStream bis = new BufferedInputStream(meidaConn.getInputStream());
			byte[] buf = new byte[8096];
			int size = 0;
			while ((size = bis.read(buf)) != -1) {
				// 将媒体文件写到输出流（往微信服务器写数据）
				outputStream.write(buf, 0, size);
			}

			// 请求体结束
			outputStream.write(("\r\n--" + boundary + "--\r\n").getBytes());
			outputStream.close();
			bis.close();
			meidaConn.disconnect();

			// 获取媒体文件上传的输入流（从微信服务器读数据）
			InputStream inputStream = uploadConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			StringBuffer buffer = new StringBuffer();
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}

			bufferedReader.close();
			inputStreamReader.close();
			// 释放资源
			inputStream.close();
			inputStream = null;
			uploadConn.disconnect();

			if (resp != null)
				resp.onOk(JSONObject.fromObject(buffer.toString()));

		} catch (Exception e) {

			if (resp != null)
				resp.onError(e.getCause());
		}
	}
}
