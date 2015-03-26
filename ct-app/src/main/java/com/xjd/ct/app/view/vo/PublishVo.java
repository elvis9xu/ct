package com.xjd.ct.app.view.vo;

import java.util.List;

/**
 * 用户发表对象
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:53
 */
public class PublishVo extends ObjectVo {
	private Long publishId;

	private Long userId;

	private String publishTitle;

	private String publishText;

	// resource
	private List<ResourceVo> resourceList;

	public Long getPublishId() {
		return publishId;
	}

	public void setPublishId(Long publishId) {
		this.publishId = publishId;
	}

	public String getPublishTitle() {
		return publishTitle;
	}

	public void setPublishTitle(String publishTitle) {
		this.publishTitle = publishTitle;
	}

	public String getPublishText() {
		return publishText;
	}

	public void setPublishText(String publishText) {
		this.publishText = publishText;
	}

	public List<ResourceVo> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<ResourceVo> resourceList) {
		this.resourceList = resourceList;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
