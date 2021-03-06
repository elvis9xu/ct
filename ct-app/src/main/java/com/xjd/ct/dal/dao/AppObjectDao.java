package com.xjd.ct.dal.dao;

import java.util.ArrayList;
import java.util.Collections;
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
public class AppObjectDao {
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
	ObjectResourceModelMapper objectResourceModelMapper;
	@Autowired
	ArticleModelMapper articleModelMapper;
	@Autowired
	TopicModelMapper topicModelMapper;
	@Autowired
	UserIdolModelMapper userIdolModelMapper;

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


	public ObjectCommentModel selectObjectCommentModelByCommentId(Long commentId) {
		return objectCommentModelMapper.selectByPrimaryKey(commentId);
	}

	public List<ArticleModel> selectArticleByPageOrderByAddTimeDesc(Long offset, Integer count) {
		ArticleModelExample example = new ArticleModelExample();
		example.setOrderByClause("add_time desc");
		example.setOffsetAndLimit(offset, count);

		return articleModelMapper.selectByExample(example);
	}

	public List<PublishModel> selectPublishByPageOrderByAddTimeDesc(Long offset, Integer count) {
		PublishModelExample example = new PublishModelExample();
		example.setOrderByClause("add_time desc");
		example.setOffsetAndLimit(offset, count);

		return publishModelMapper.selectByExample(example);
	}

	// TODO 优化
	public List<PublishModel> selectPublishByUserIdListAndPageOrderByAddTimeDesc(Long userId, Long offset, Integer count) {
		// 我关注的用户
		UserIdolModelExample idolModelExample = new UserIdolModelExample();
		idolModelExample.or().andUserIdEqualTo(userId);
		List<UserIdolModel> idolList = userIdolModelMapper.selectByExample(idolModelExample);

		// 关注我的用户
		idolModelExample = new UserIdolModelExample();
		idolModelExample.or().andIdolUserIdEqualTo(userId);
		List<UserIdolModel> fansList = userIdolModelMapper.selectByExample(idolModelExample);

		List<Long> idList = new ArrayList<Long>(idolList.size() + fansList.size());
		for (UserIdolModel userIdolModel : idolList) {
			idList.add(userIdolModel.getIdolUserId());
		}
		for (UserIdolModel userIdolModel : fansList) {
			idList.add(userIdolModel.getUserId());
		}

		if (idList.isEmpty()) {
			return Collections.emptyList();
		}

		PublishModelExample example = new PublishModelExample();
		example.or().andUserIdIn(idList);
		example.setOrderByClause("add_time desc");
		example.setOffsetAndLimit(offset, count);

		return publishModelMapper.selectByExample(example);
	}

	public List<ObjectResourceModel> selectObjectResourceByObjectTypeAndObjectRefId(Byte objectType, Long objectRefId) {
		ObjectResourceModelExample example = new ObjectResourceModelExample();
		example.or().andObjectTypeEqualTo(objectType).andObjectRefIdEqualTo(objectRefId);
		return objectResourceModelMapper.selectByExample(example);
	}
}
