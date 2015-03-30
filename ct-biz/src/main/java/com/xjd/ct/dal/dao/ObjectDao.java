package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.ObjectCommentModelMapper;
import com.xjd.ct.dal.map.ObjectFavorModelMapper;
import com.xjd.ct.dal.map.ObjectLikeModelMapper;
import com.xjd.ct.dal.map.ObjectModelMapper;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.QueryResultUtil;

/**
 * @author elvis.xu
 * @since 2015-03-30 21:31
 */
@Repository
@Transactional
public class ObjectDao {
	@Autowired
	ObjectModelMapper objectModelMapper;
	@Autowired
	ObjectLikeModelMapper objectLikeModelMapper;
	@Autowired
	ObjectFavorModelMapper objectFavorModelMapper;
	@Autowired
	ObjectCommentModelMapper objectCommentModelMapper;

	public ObjectModel selectObjectModelByObjectTypeAndObjectRefId(Byte objectType, Long objectRefId) {
		ObjectModelExample example = new ObjectModelExample();
		example.or().andObjectTypeEqualTo(objectType).andObjectRefIdEqualTo(objectRefId);

		List<ObjectModel> list = objectModelMapper.selectByExample(example);
		QueryResultUtil.assertReturn0Or1(list, objectType, objectRefId);

		return list.isEmpty() ? null : list.get(0);
	}

	public ObjectLikeModel selectObjectLikeModelByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectLikeModelKey key = new ObjectLikeModel();
		key.setObjectId(objectId);
		key.setUserId(userId);

		return objectLikeModelMapper.selectByPrimaryKey(key);
	}

	public int insertObjectLikeModel(ObjectLikeModel objectLikeModel) {
		return objectLikeModelMapper.insert(objectLikeModel);
	}

	public int increaseLikeYesCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setLikeYesCount(objectModel.getLikeYesCount() + 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}

	public int increaseLikeNoCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setLikeNoCount(objectModel.getLikeNoCount() + 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}

	public int deleteObjectLikeModelByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectLikeModelKey key = new ObjectLikeModel();
		key.setObjectId(objectId);
		key.setUserId(userId);

		return objectLikeModelMapper.deleteByPrimaryKey(key);
	}

	public int decreaseLikeYesCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setLikeYesCount(objectModel.getLikeYesCount() - 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}

	public int decreaseLikeNoCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setLikeNoCount(objectModel.getLikeNoCount() - 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}

	public ObjectFavorModel selectObjectFavorModelByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectFavorModelKey key = new ObjectFavorModelKey();
		key.setObjectId(objectId);
		key.setUserId(userId);
		return objectFavorModelMapper.selectByPrimaryKey(key);
	}

	public int insertObjectFavorModel(ObjectFavorModel objectFavorModel) {
		return objectFavorModelMapper.insert(objectFavorModel);
	}

	public int increaseFavorCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setFavorCount(objectModel.getFavorCount() + 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}

	public int deleteObjectFavorModelByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectFavorModelKey key = new ObjectFavorModelKey();
		key.setObjectId(objectId);
		key.setUserId(userId);
		return objectFavorModelMapper.deleteByPrimaryKey(key);
	}

	public int decreaseFavorCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setFavorCount(objectModel.getFavorCount() - 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}

	public ObjectCommentModel selectObjectCommentModelByCommentId(Long commentId) {
		return objectCommentModelMapper.selectByPrimaryKey(commentId);
	}

	public int insertObjectCommentModel(ObjectCommentModel objectCommentModel) {
		return objectCommentModelMapper.insert(objectCommentModel);
	}

	public int increaseCommentCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setCommentCount(objectModel.getCommentCount() + 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}

	public int deleteObjectCommentModelByCommentId(Long commentId) {
		return objectCommentModelMapper.deleteByPrimaryKey(commentId);
	}

	public int decreaseCommentCount(Long objectId) {
		ObjectModel objectModel = objectModelMapper.selectByPrimaryKey(objectId);

		ObjectModel upd = new ObjectModel();
		upd.setObjectId(objectModel.getObjectId());
		upd.setCommentCount(objectModel.getCommentCount() - 1);
		upd.setUpdTime(DateUtil.now());
		return objectModelMapper.updateByPrimaryKeySelective(upd);
	}
}
