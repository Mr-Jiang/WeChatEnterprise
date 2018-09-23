package wx.contact;

/**
 * ClassName: TextAttr
 * <p>
 * Description: 成员对外属性-Text类型
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
 * @date 2018.09.11 16:41
 */
public class TextAttr extends BaseAttr {

	/** 文本属性 */
	private Text text;

	/***
	 * 获取文本属性
	 * 
	 * @return 文本属性
	 */
	public Text getText() {
		return text;
	}

	/**
	 * 设置文本属性
	 * 
	 * @param text
	 *            文本属性
	 */
	public void setText(Text text) {
		this.text = text;
	}

	/**
	 * 文本属性
	 */
	public static class Text {

		/** 文本属性内容 */
		private String value;

		/***
		 * 获取文本属性内容
		 * 
		 * @return 文本属性内容
		 */
		public String getValue() {
			return value;
		}

		/**
		 * 设置文本属性内容
		 * 
		 * @param value
		 *            文本属性内容
		 */
		public void setValue(String value) {
			this.value = value;
		}

	}
}
