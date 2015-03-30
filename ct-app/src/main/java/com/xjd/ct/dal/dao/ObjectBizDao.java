package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.*;
import com.xjd.ct.utl.QueryResultUtil;

/**
 * 网关特有与对象体系相关的业务DAO
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:31
 */
@Repository
@Transactional
public class ObjectBizDao {
	@Autowired
	ObjectModelMapper objectModelMapper;
	@Autowired
	ObjectVoteOptModelMapper objectVoteOptModelMapper;
	@Autowired
	ObjectCommentModelMapper objectCommentModelMapper;
	@Autowired
	ObjectFavorModelMapper objectFavorModelMapper;
	@Autowired
	ObjectLikeModelMapper objectLikeModelMapper;
	@Autowired
	PublishModelMapper publishModelMapper;
	@Autowired
	PublishResRsModelMapper publishResRsModelMapper;
	@Autowired
	ArticleModelMapper articleModelMapper;
	@Autowired
	TopicModelMapper topicModelMapper;

	public ObjectModel selectObjectModelByObjectTypeAndObjectRefId(Byte objectType, Long objectRefId) {
		ObjectModelExample example = new ObjectModelExample();
		example.or().andObjectTypeEqualTo(objectType).andObjectRefIdEqualTo(objectRefId);

		List<ObjectModel> list = objectModelMapper.selectByExample(example);
		QueryResultUtil.assertReturn0Or1(list, objectType, objectRefId);

		return list.isEmpty() ? null : list.get(0);
	}

	public ObjectModel selectObjectModelByObjectId(Long objectId) {
		return objectModelMapper.selectByPrimaryKey(objectId);
	}

	public List<ObjectVoteOptModel> selectObjectVoteOptModelByObjectId(Long objectId) {
		ObjectVoteOptModelExample example = new ObjectVoteOptModelExample();
		example.or().andObjectIdEqualTo(objectId);

		return objectVoteOptModelMapper.selectByExample(example);
	}

	public List<ObjectCommentModel> selectObjectCommentModelByObjectId(Long objectId) {
		ObjectCommentModelExample example = new ObjectCommentModelExample();
		example.or().andObjectIdEqualTo(objectId);

		return objectCommentModelMapper.selectByExample(example);
	}

	public List<ObjectFavorModel> selectObjectFavorModelByUserIdAndPage(Long userId, long offset, int count) {
		ObjectFavorModelExample example = new ObjectFavorModelExample();
		example.or().andUserIdEqualTo(userId);

		return objectFavorModelMapper.selectByExample(example);
	}

	public List<ObjectLikeModel> selectObjectLikeModelByUserIdAndPage(Long userId, long offset, int count) {
		ObjectLikeModelExample example = new ObjectLikeModelExample();
		example.or().andUserIdEqualTo(userId);

		return objectLikeModelMapper.selectByExample(example);
	}

	public PublishModel selectPublishByPublishId(Long publishId) {
		return publishModelMapper.selectByPrimaryKey(publishId);
	}

	public ArticleModel selectArticleByArticleId(Long articleId) {
		return articleModelMapper.selectByPrimaryKey(articleId);
	}

	public TopicModel selectTopicByTopicId(Long topicId) {
		return topicModelMapper.selectByPrimaryKey(topicId);
	}

	public List<PublishModel> selectPublishByUserIdAndPage(Long userId, long offset, int limit) {
		PublishModelExample example = new PublishModelExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("publish_id desc");
		example.setOffsetAndLimit(offset - 1, limit);

		return publishModelMapper.selectByExample(example);
	}

	public List<PublishResRsModel> selectPublishResRsModelByPublishId(Long publishId) {
		PublishResRsModelExample example = new PublishResRsModelExample();
		example.or().andPublishIdEqualTo(publishId);

		return publishResRsModelMapper.selectByExample(example);
	}

	public ObjectCommentModel selectObjectCommentModelByCommentId(Long commentId) {
		return objectCommentModelMapper.selectByPrimaryKey(commentId);
	}

}
