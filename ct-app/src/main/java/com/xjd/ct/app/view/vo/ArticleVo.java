package com.xjd.ct.app.view.vo;

import java.util.List;

/**
 * 用户发表对象
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:53
 */
public class ArticleVo extends ObjectVo {
	private Long articleId;

	private String articleTitle;

	private String articleSummary;

	private String articleLink;

	private List<ObjectResourceVo> objectResourceList;

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleSummary() {
		return articleSummary;
	}

	public void setArticleSummary(String articleSummary) {
		this.articleSummary = articleSummary;
	}

	public String getArticleLink() {
		return articleLink;
	}

	public void setArticleLink(String articleLink) {
		this.articleLink = articleLink;
	}

	public List<ObjectResourceVo> getObjectResourceList() {
		return objectResourceList;
	}

	public void setObjectResourceList(List<ObjectResourceVo> objectResourceList) {
		this.objectResourceList = objectResourceList;
	}
}
