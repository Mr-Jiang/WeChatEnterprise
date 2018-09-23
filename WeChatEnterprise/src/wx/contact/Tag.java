package wx.contact;

/**
 * ClassName: Tag
 * <p>
 * Description: 标签
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
 * @date 2018.09.11 10:44
 */
public class Tag {

	/** 标签名称，长度限制为32个字（汉字或英文字母），标签名不可与其他标签重名 */
	private String tagname;

	/** 标签id，非负整型，指定此参数时新增的标签会生成对应的标签id，不指定时则以目前最大的id自增 */
	private int tagid;

	/**
	 * 获取标签名称
	 * 
	 * @return 标签名称
	 */
	public String getTagname() {
		return tagname;
	}

	/**
	 * 设置标签名称，长度限制为32个字（汉字或英文字母），标签名不可与其他标签重名
	 * 
	 * @param tagname
	 *            标签名称
	 */
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	/**
	 * 获取标签id
	 * 
	 * @return 标签id
	 */
	public int getTagid() {
		return tagid;
	}

	/**
	 * 设置标签id，非负整型，指定此参数时新增的标签会生成对应的标签id，不指定时则以目前最大的id自增
	 * 
	 * @param tagid
	 *            标签id
	 */
	public void setTagid(int tagid) {
		this.tagid = tagid;
	}

}
