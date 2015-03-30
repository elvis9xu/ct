package com.xjd.ct.app.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.app.view.vo.*;
import com.xjd.ct.dal.dao.ObjectBizDao;
import com.xjd.ct.dal.dao.ResourceBizDao;
import com.xjd.ct.dal.dos.*;
import com.xjd.ct.utl.enums.ObjectTypeEnum;

/**
 * 网关特有与发表相关的业务
 *
 * @author elvis.xu
 * @since 2015-03-26 22:27
 */
@Service
public class ObjectBiz {
	@Autowired
	ResourceBizDao resourceBizDao;
	@Autowired
	ObjectBizDao objectBizDao;

	public List<PublishVo> listPublishs(Long userId, long offset, int limit) {
		List<PublishModel> publishModelList = objectBizDao.selectPublishByUserIdAndPage(userId, offset, limit);

		List<PublishVo> publishVoList = new ArrayList<PublishVo>(publishModelList.size());

		for (PublishModel publishModel : publishModelList) {
			PublishVo publishVo = new PublishVo();

			BeanUtils.copyProperties(publishModel, publishVo);

			// 查询资源
			List<PublishResRsModel> publishResRsModelList = objectBizDao
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
			ObjectModel objectModel = objectBizDao.selectObjectModelByObjectTypeAndObjectRefId(
					ObjectTypeEnum.PUBLISH.getCode(), publishModel.getPublishId());
			BeanUtils.copyProperties(objectModel, publishVo);

			publishVoList.add(publishVo);
		}

		return publishVoList;
	}

	public List<ObjectVo> listFavors(Long userId, long offset, int count) {
		List<ObjectFavorModel> objectFavorModelList = objectBizDao.selectObjectFavorModelByUserIdAndPage(userId,
				offset, count);

		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectFavorModelList.size());

		for (ObjectFavorModel objectFavorModel : objectFavorModelList) {
			ObjectModel objectModel = objectBizDao.selectObjectModelByObjectId(objectFavorModel.getObjectId());
			ObjectVo objectVo = assemble(objectModel.getObjectType(), objectModel.getObjectRefId());
			objectVoList.add(objectVo);
		}

		return objectVoList;
	}

	public List<ObjectVo> listLikes(Long userId, long offset, int count) {
		List<ObjectLikeModel> objectLikeModelList = objectBizDao.selectObjectLikeModelByUserIdAndPage(userId, offset,
				count);

		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectLikeModelList.size());

		for (ObjectLikeModel objectLikeModel : objectLikeModelList) {
			ObjectModel objectModel = objectBizDao.selectObjectModelByObjectId(objectLikeModel.getObjectId());
			ObjectVo objectVo = assemble(objectModel.getObjectType(), objectModel.getObjectRefId());
			objectVoList.add(objectVo);
		}

		return objectVoList;
	}

	public ObjectVo assemble(Byte objectType, Long refId) {
		ObjectVo objectVo = null;

		ObjectTypeEnum objectTypeEnum = ObjectTypeEnum.valueOfCode(objectType);
		if (objectTypeEnum == ObjectTypeEnum.PUBLISH) {
			PublishModel publishModel = objectBizDao.selectPublishByPublishId(refId);
			if (publishModel == null) {
				return null;
			}

			PublishVo publishVo = new PublishVo();
			BeanUtils.copyProperties(publishModel, publishVo);

			// 查询资源
			List<PublishResRsModel> publishResRsModelList = objectBizDao
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
			ArticleModel articleModel = objectBizDao.selectArticleByArticleId(refId);
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
			TopicModel topicModel = objectBizDao.selectTopicByTopicId(refId);
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
			ObjectModel objectModel = objectBizDao.selectObjectModelByObjectTypeAndObjectRefId(
					objectTypeEnum.getCode(), refId);
			BeanUtils.copyProperties(objectModel, objectVo);
		}
		return objectVo;
	}
}
