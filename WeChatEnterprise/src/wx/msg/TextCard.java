package wx.msg;

/**
 * ClassName: TextCard
 * <p>
 * Description: 微信文本卡片
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
 * @date 2018.09.05 15:21
 */
public class TextCard {

	/** 标题，不超过128个字节，超过会自动截断 */
	private String title;

	/** 描述，不超过512个字节，超过会自动截断 */
	private String description;

	/** 点击后跳转的链接 */
	private String url;

	/** 按钮文字。 默认为“详情”， 不超过4个文字，超过自动截断 */
	private String btntxt;

	/**
	 * 获取标题，不超过128个字节，超过会自动截断
	 * 
	 * @return 标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置标题
	 * 
	 * @param title
	 *            标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取描述，不超过512个字节，超过会自动截断
	 * 
	 * @return 描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置描述
	 * 
	 * @param description
	 *            描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取点击后跳转的链接
	 * 
	 * @return 点击后跳转的链接
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置点击后跳转的链接
	 * 
	 * @param url
	 *            点击后跳转的链接
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取按钮文字。 默认为“详情”， 不超过4个文字，超过自动截断
	 * 
	 * @return 按钮文字
	 */
	public String getBtntxt() {
		return btntxt;
	}

	/**
	 * 设置按钮文字。 默认为“详情”， 不超过4个文字，超过自动截断
	 * 
	 * @param btntxt
	 *            按钮文字
	 */
	public void setBtntxt(String btntxt) {
		this.btntxt = btntxt;
	}
}
