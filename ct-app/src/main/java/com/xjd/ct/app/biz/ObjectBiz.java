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

	public List<PublishVo> listPublishs(Long userId, long offset, int limit) {
		List<PublishModel> publishModelList = appObjectDao.selectPublishByUserIdAndPage(userId, offset, limit);

		List<PublishVo> publishVoList = new ArrayList<PublishVo>(publishModelList.size());

		for (PublishModel publishModel : publishModelList) {
			PublishVo publishVo = new PublishVo();

			BeanUtils.copyProperties(publishModel, publishVo);

			// 查询资源
			List<PublishResRsModel> publishResRsModelList = appObjectDao
					.selectPublishResRsModelByPublishId(publishModel.getPublishId());
			List<ResourceVo> resourceVoList = new ArrayList<ResourceVo>(publishResRsModelList.size());
			for (PublishResRsModel publishResRsModel : publishResRsModelList) {
				ResourceModel resourceModel = resourceBizDao.selectResourceModelByResId(publishResRsModel.getResId());
				ResourceVo resourceVo = new ResourceVo();
				BeanUtils.copyProperties(resourceModel, resourceVo);
				resourceVoList.add(resourceVo);
			}
			publishVo.setResourceList(resourceVoList);

			// 组装对象信息
			ObjectModel objectModel = appObjectDao.selectObjectModelByObjectTypeAndObjectRefId(
					ObjectTypeEnum.PUBLISH.getCode(), publishModel.getPublishId());
			BeanUtils.copyProperties(objectModel, publishVo);

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
			ObjectVo objectVo = assemble(objectModel.getObjectType(), objectModel.getObjectRefId());
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
			ObjectVo objectVo = assemble(objectModel.getObjectType(), objectModel.getObjectRefId());
			objectVoList.add(objectVo);
		}

		return objectVoList;
	}

	public ObjectVo assemble(Byte objectType, Long refId) {
		ObjectVo objectVo = null;

		ObjectTypeEnum objectTypeEnum = ObjectTypeEnum.valueOfCode(objectType);
		if (objectTypeEnum == ObjectTypeEnum.PUBLISH) {
			PublishModel publishModel = appObjectDao.selectPublishByPublishId(refId);
			if (publishModel == null) {
				return null;
			}

			PublishVo publishVo = new PublishVo();
			BeanUtils.copyProperties(publishModel, publishVo);

			// 查询资源
			List<PublishResRsModel> publishResRsModelList = appObjectDao
					.selectPublishResRsModelByPublishId(publishModel.getPublishId());
			List<ResourceVo> resourceVoList = new ArrayList<ResourceVo>(publishResRsModelList.size());
			for (PublishResRsModel publishResRsModel : publishResRsModelList) {
				ResourceModel resourceModel = resourceBizDao.selectResourceModelByResId(publishResRsModel.getResId());
				ResourceVo resourceVo = new ResourceVo();
				BeanUtils.copyProperties(resourceModel, resourceVo);
				resourceVoList.add(resourceVo);
			}
			publishVo.setResourceList(resourceVoList);

		} else if (objectTypeEnum == ObjectTypeEnum.ARTICLE) {
			ArticleModel articleModel = appObjectDao.selectArticleByArticleId(refId);
			if (articleModel == null) {
				return null;
			}

			ArticleVo articleVo = new ArticleVo();
			BeanUtils.copyProperties(articleModel, articleVo);

			// 查询资源
			ResourceModel resourceModel = resourceBizDao.selectResourceModelByResId(articleModel.getArticleImgRes());
			ResourceVo resourceVo = new ResourceVo();
			BeanUtils.copyProperties(resourceModel, resourceVo);
			articleVo.setArticleImgResource(resourceVo);

		} else if (objectTypeEnum == ObjectTypeEnum.TOPIC) {
			TopicModel topicModel = appObjectDao.selectTopicByTopicId(refId);
			if (topicModel == null) {
				return null;
			}

			TopicVo topicVo = new TopicVo();
			BeanUtils.copyProperties(topicModel, topicVo);

			// 查询资源
			ResourceModel resourceModel = resourceBizDao.selectResourceModelByResId(topicModel.getTopicImgRes());
			ResourceVo resourceVo = new ResourceVo();
			BeanUtils.copyProperties(resourceModel, resourceVo);
			topicVo.setTopicImgResource(resourceVo);
		}

		if (objectVo != null) {
			// 组装对象信息
			ObjectModel objectModel = appObjectDao.selectObjectModelByObjectTypeAndObjectRefId(
					objectTypeEnum.getCode(), refId);
			BeanUtils.copyProperties(objectModel, objectVo);
		}
		return objectVo;
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
			ObjectVo vo = assemble(ObjectTypeEnum.ARTICLE.getCode(), articleModel.getArticleId());

			list.add(vo);
		}

		return list;

	}

	public List<ObjectVo> listPublishs(Byte orderBy, Long offset, Integer count) {
		List<PublishModel> publishModelList = appObjectDao.selectPublishByPageOrderByAddTimeDesc(offset, count);

		List<ObjectVo> list = new ArrayList<ObjectVo>(publishModelList.size());
		for (PublishModel publishModel : publishModelList) {
			ObjectVo vo = assemble(ObjectTypeEnum.PUBLISH.getCode(), publishModel.getPublishId());

			list.add(vo);
		}

		return list;
	}

	public List<ObjectVo> listPublishs(Long userId, Byte orderBy, Long offset, Integer count) {
		List<PublishModel> publishModelList = appObjectDao.selectPublishByUserIdListAndPageOrderByAddTimeDesc(userId,
				offset, count);

		List<ObjectVo> list = new ArrayList<ObjectVo>(publishModelList.size());
		for (PublishModel publishModel : publishModelList) {
			ObjectVo vo = assemble(ObjectTypeEnum.PUBLISH.getCode(), publishModel.getPublishId());

			list.add(vo);
		}

		return list;
	}

}
