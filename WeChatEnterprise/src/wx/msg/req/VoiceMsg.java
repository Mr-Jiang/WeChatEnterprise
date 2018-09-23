package wx.msg.req;

import wx.msg.Voice;

/**
 * ClassName: VoiceMsg
 * <p>
 * Description: 语音消息
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
 * @date 2018.09.03 16:20
 */
public class VoiceMsg extends BaseMsg {

	/** 语音消息单元类 */
	private Voice voice;

	/**
	 * 获取语音消息单元类
	 * 
	 * @return 语音消息单元类
	 */
	public Voice getVoice() {
		return voice;
	}

	/**
	 * 设置语音消息单元类
	 * 
	 * @param voice
	 *            语音消息单元类
	 */
	public void setVoice(Voice voice) {
		this.voice = voice;
	}

}
