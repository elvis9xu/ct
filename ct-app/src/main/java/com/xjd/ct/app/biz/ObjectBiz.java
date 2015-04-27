package com.xjd.ct.app.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.app.view.vo.*;
import com.xjd.ct.dal.dao.AppObjectDao;
import com.xjd.ct.dal.dao.AppResourceDao;
import com.xjd.ct.dal.dos.*;
import com.xjd.ct.utl.enums.ObjectTypeEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * 网关特有与发表相关的业务
 *
 * @author elvis.xu
 * @since 2015-03-26 22:27
 */
@Service
public class ObjectBiz {
	@Autowired
	AppResourceDao resourceBizDao;
	@Autowired
	AppObjectDao appObjectDao;

	protected ObjectVo getObject(Byte objectType, Long objectRefId) {
		ObjectTypeEnum objectTypeEnum = ObjectTypeEnum.valueOfCode(objectType);
		switch (objectTypeEnum) {
		case ARTICLE:
			ArticleVo articleVo = new ArticleVo();
			ArticleModel articleModel = appObjectDao.selectArticleByArticleId(objectRefId);
			BeanUtils.copyProperties(articleModel, articleVo);
			assemble(articleVo);
			return articleVo;
		case PUBLISH:
			PublishVo publishVo = new PublishVo();
			PublishModel publishModel = appObjectDao.selectPublishByPublishId(objectRefId);
			BeanUtils.copyProperties(publishModel, publishVo);
			assemble(publishVo);
			return publishVo;
		case TOPIC:
			TopicVo topicVo = new TopicVo();
			TopicModel topicModel = appObjectDao.selectTopicByTopicId(objectRefId);
			BeanUtils.copyProperties(topicModel, topicVo);
			assemble(topicVo);
			return topicVo;
		}
		return null;
	}

	protected void assemble(ObjectVo objectVo) {
		if (objectVo instanceof TopicVo) {
			TopicVo topicVo = (TopicVo) objectVo;
			assembleObject(topicVo, ObjectTypeEnum.TOPIC.getCode(), topicVo.getTopicId());
			assembleResource(topicVo, ObjectTypeEnum.TOPIC.getCode(), topicVo.getTopicId());

		} else if (objectVo instanceof PublishVo) {
			PublishVo publishVo = (PublishVo) objectVo;
			assembleObject(publishVo, ObjectTypeEnum.PUBLISH.getCode(), publishVo.getPublishId());
			assembleResource(publishVo, ObjectTypeEnum.PUBLISH.getCode(), publishVo.getPublishId());

		} else if (objectVo instanceof ArticleVo) {
			ArticleVo articleVo = (ArticleVo) objectVo;
			assembleObject(articleVo, ObjectTypeEnum.ARTICLE.getCode(), articleVo.getArticleId());
			assembleResource(articleVo, ObjectTypeEnum.ARTICLE.getCode(), articleVo.getArticleId());
		}
	}

	protected void assembleResource(ObjectWithResourceVo objectWithResourceVo, Byte objectType, Long objectRefId) {
		List<ObjectResourceModel> objectResourceModelList = appObjectDao
				.selectObjectResourceByObjectTypeAndObjectRefId(objectType, objectRefId);
		List<ObjectResourceVo> objectResourceVoList = new ArrayList<ObjectResourceVo>(objectResourceModelList.size());
		for (ObjectResourceModel objectResourceModel : objectResourceModelList) {
			ObjectResourceVo objectResourceVo = new ObjectResourceVo();
			ResourceModel resourceModel = resourceBizDao.selectResourceModelByResId(objectResourceModel.getResId());
			BeanUtils.copyProperties(resourceModel, objectResourceVo);
			BeanUtils.copyProperties(objectResourceModel, objectResourceVo);
			objectResourceVoList.add(objectResourceVo);
		}

		objectWithResourceVo.setObjectResourceList(objectResourceVoList);
	}

	protected void assembleObject(ObjectVo objectVo, Byte objectType, Long objectRefId) {
		ObjectModel objectModel = appObjectDao.selectObjectModelByObjectTypeAndObjectRefId(objectType, objectRefId);
		BeanUtils.copyProperties(objectModel, objectVo);
	}

	public List<PublishVo> listPublishs(Long userId, long offset, int limit) {
		List<PublishModel> publishModelList = appObjectDao.selectPublishByUserIdAndPage(userId, offset, limit);

		List<PublishVo> publishVoList = new ArrayList<PublishVo>(publishModelList.size());

		for (PublishModel publishModel : publishModelList) {
			PublishVo publishVo = new PublishVo();
			BeanUtils.copyProperties(publishModel, publishVo);
			assemble(publishVo);
			publishVoList.add(publishVo);
		}

		return publishVoList;
	}

	public List<ObjectVo> listFavors(Long userId, long offset, int count) {
		List<ObjectFavorModel> objectFavorModelList = appObjectDao.selectObjectFavorModelByUserIdAndPage(userId,
				offset, count);

		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectFavorModelList.size());

		for (ObjectFavorModel objectFavorModel : objectFavorModelList) {
			ObjectModel objectModel = appObjectDao.selectObjectModelByObjectId(objectFavorModel.getObjectId());
			ObjectVo objectVo = getObject(objectModel.getObjectType(), objectModel.getObjectRefId());
			objectVoList.add(objectVo);
		}

		return objectVoList;
	}

	public List<ObjectVo> listLikes(Long userId, long offset, int count) {
		List<ObjectLikeModel> objectLikeModelList = appObjectDao.selectObjectLikeModelByUserIdAndPage(userId, offset,
				count);

		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectLikeModelList.size());

		for (ObjectLikeModel objectLikeModel : objectLikeModelList) {
			ObjectModel objectModel = appObjectDao.selectObjectModelByObjectId(objectLikeModel.getObjectId());
			ObjectVo objectVo = getObject(objectModel.getObjectType(), objectModel.getObjectRefId());
			objectVoList.add(objectVo);
		}

		return objectVoList;
	}

	public CommentVo queryComment(Long commentId) {
		ObjectCommentModel commentModel = appObjectDao.selectObjectCommentModelByCommentId(commentId);
		if (commentModel == null) {
			return null;
		}
		CommentVo commentVo = new CommentVo();
		BeanUtils.copyProperties(commentModel, commentVo);
		return commentVo;
	}

	public List<CommentVo> listComments(Byte objectType, Long objectRefId) {
		ObjectModel objectModel = appObjectDao.selectObjectModelByObjectTypeAndObjectRefId(objectType, objectRefId);
		if (objectModel == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		List<ObjectCommentModel> commentModelList = appObjectDao.selectObjectCommentModelByObjectId(objectModel
				.getObjectId());
		List<CommentVo> list = new ArrayList<CommentVo>(commentModelList.size());
		for (ObjectCommentModel commentModel : commentModelList) {
			CommentVo commentVo = new CommentVo();
			BeanUtils.copyProperties(commentModel, commentVo);
			list.add(commentVo);
		}
		return  list;
	}

	public List<ObjectVo> listArticles(Byte orderBy, Long offset, Integer count) {
		// 目前仅支持时间倒序
		List<ArticleModel> articleModelList = appObjectDao.selectArticleByPageOrderByAddTimeDesc(offset, count);

		List<ObjectVo> list = new ArrayList<ObjectVo>(articleModelList.size());
		for (ArticleModel articleModel : articleModelList) {
			ArticleVo articleVo = new ArticleVo();
			BeanUtils.copyProperties(articleModel, articleVo);
			assemble(articleVo);
			list.add(articleVo);
		}

		return list;

	}

	public List<ObjectVo> listPublishs(Byte orderBy, Long offset, Integer count) {
		List<PublishModel> publishModelList = appObjectDao.selectPublishByPageOrderByAddTimeDesc(offset, count);

		List<ObjectVo> list = new ArrayList<ObjectVo>(publishModelList.size());
		for (PublishModel publishModel : publishModelList) {
			PublishVo publishVo = new PublishVo();
			BeanUtils.copyProperties(publishModel, publishVo);
			assemble(publishVo);
			list.add(publishVo);
		}

		return list;
	}

	public List<ObjectVo> listPublishs(Long userId, Byte orderBy, Long offset, Integer count) {
		List<PublishModel> publishModelList = appObjectDao.selectPublishByUserIdListAndPageOrderByAddTimeDesc(userId,
				offset, count);

		List<ObjectVo> list = new ArrayList<ObjectVo>(publishModelList.size());
		for (PublishModel publishModel : publishModelList) {
			PublishVo publishVo = new PublishVo();
			BeanUtils.copyProperties(publishModel, publishVo);
			assemble(publishVo);
			list.add(publishVo);
		}

		return list;
	}

}
