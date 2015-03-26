package com.xjd.ct.app.view.vo;

/**
 * 用户发表对象
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:53
 */
public class TopicVo extends ObjectVo {
	private Long topicId;

	private String topicTitle;

	private String topicImgRes;

	private String topicDesc;

	private ResourceVo topicImgResource;

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public String getTopicTitle() {
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}

	public String getTopicImgRes() {
		return topicImgRes;
	}

	public void setTopicImgRes(String topicImgRes) {
		this.topicImgRes = topicImgRes;
	}

	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

	public ResourceVo getTopicImgResource() {
		return topicImgResource;
	}

	public void setTopicImgResource(ResourceVo topicImgResource) {
		this.topicImgResource = topicImgResource;
	}
}
