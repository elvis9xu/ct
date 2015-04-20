package com.xjd.ct.app.view.vo;

import java.util.List;

/**
 * 用户发表对象
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:53
 */
public class TopicVo extends ObjectVo {
	private Long topicId;

	private String topicTitle;

	private String topicDesc;

	private List<ObjectResourceVo> objectResourceList;

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

	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

	public List<ObjectResourceVo> getObjectResourceList() {
		return objectResourceList;
	}

	public void setObjectResourceList(List<ObjectResourceVo> objectResourceList) {
		this.objectResourceList = objectResourceList;
	}
}
