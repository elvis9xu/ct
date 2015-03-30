package com.xjd.ct.biz.service;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dao.ObjectDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.ObjectCommentModel;
import com.xjd.ct.dal.dos.ObjectFavorModel;
import com.xjd.ct.dal.dos.ObjectLikeModel;
import com.xjd.ct.dal.dos.ObjectModel;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.enums.YesNoEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 业务对象管理
 * 1. 对象类型管理
 * 2. 对象标签管理
 * 3. 对象投票管理
 * 4. 对象点赞管理
 * 5. 对象收藏管理
 * 6. 对象评论管理
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午12:15:08
 */
@Service
public class BizObjectService {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	ObjectDao objectDao;
	@Autowired
	UserDao userDao;

	/**
	 * 添加点赞
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 * @param yesOrNo
	 */
	@Transactional
	public void addLike(Long userId, Byte objectType, Long objectRefId, Byte yesOrNo) {
		// 先判断
		ObjectModel objectModel = objectDao.selectObjectModelByObjectTypeAndObjectRefId(objectType, objectRefId);
		if (objectModel == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.YES && !BoolEnum.parseCode(objectModel.getLikeYesFlag())) {
			// 不支持点赞
			throw new BusinessException(RespCode.RESP_0203);
		} else if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.NO && !BoolEnum.parseCode(objectModel.getLikeNoFlag())) {
			// 不支持鄙视
			throw new BusinessException(RespCode.RESP_0204);
		}

		ObjectLikeModel objectLikeModel = objectDao.selectObjectLikeModelByObjectIdAndUserId(objectModel.getObjectId(),
				userId);
		if (objectLikeModel != null) {
			throw new BusinessException(RespCode.RESP_0202);
		}

		// 插入评论
		objectLikeModel = new ObjectLikeModel();
		objectLikeModel.setObjectId(objectModel.getObjectId());
		objectLikeModel.setUserId(userId);
		objectLikeModel.setYesNo(yesOrNo);
		Date now = DateUtil.now();
		objectLikeModel.setAddTime(now);
		objectLikeModel.setUpdTime(now);

		objectDao.insertObjectLikeModel(objectLikeModel);

		// 点赞记数
		if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.YES) {
			objectDao.increaseLikeYesCount(objectModel.getObjectId());

		} else if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.NO) {
			objectDao.increaseLikeNoCount(objectModel.getObjectId());
		}
	}

	/**
	 * 删除点赞
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 * @param yesOrNo
	 */
	@Transactional
	public void removeLike(Long userId, Byte objectType, Long objectRefId, Byte yesOrNo) {
		// 先判断
		ObjectModel objectModel = objectDao.selectObjectModelByObjectTypeAndObjectRefId(objectType, objectRefId);
		if (objectModel == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		ObjectLikeModel objectLikeModel = objectDao.selectObjectLikeModelByObjectIdAndUserId(objectModel.getObjectId(),
				userId);
		if (objectLikeModel == null) {
			throw new BusinessException(RespCode.RESP_0205);
		}

		if (!objectLikeModel.getYesNo().equals(yesOrNo)) {
			throw new BusinessException(RespCode.RESP_0206);
		}

		// 删除
		objectDao.deleteObjectLikeModelByObjectIdAndUserId(objectModel.getObjectId(), userId);

		// 点赞记数
		if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.YES) {
			objectDao.decreaseLikeYesCount(objectModel.getObjectId());

		} else if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.NO) {
			objectDao.decreaseLikeNoCount(objectModel.getObjectId());
		}
	}

	/**
	 * 添加收藏
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 */
	@Transactional
	public void addFavor(Long userId, Byte objectType, Long objectRefId) {
		// 先判断
		ObjectModel objectModel = objectDao.selectObjectModelByObjectTypeAndObjectRefId(objectType, objectRefId);
		if (objectModel == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		if (!BoolEnum.parseCode(objectModel.getFavorFlag())) {
			throw new BusinessException(RespCode.RESP_0208);
		}

		ObjectFavorModel objectFavorModel = objectDao.selectObjectFavorModelByObjectIdAndUserId(
				objectModel.getObjectId(), userId);

		if (objectFavorModel != null) {
			throw new BusinessException(RespCode.RESP_0207);
		}

		// 收藏
		objectFavorModel = new ObjectFavorModel();
		objectFavorModel.setObjectId(objectModel.getObjectId());
		objectFavorModel.setUserId(userId);
		objectFavorModel.setAddTime(DateUtil.now());
		objectDao.insertObjectFavorModel(objectFavorModel);

		// 记数
		objectDao.increaseFavorCount(objectModel.getObjectId());
		userDao.increaseFavorCount(userId);
	}

	/**
	 * 取消收藏
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 */
	@Transactional
	public void removeFavor(Long userId, Byte objectType, Long objectRefId) {
		// 先判断
		ObjectModel objectModel = objectDao.selectObjectModelByObjectTypeAndObjectRefId(objectType, objectRefId);
		if (objectModel == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		ObjectFavorModel objectFavorModel = objectDao.selectObjectFavorModelByObjectIdAndUserId(
				objectModel.getObjectId(), userId);

		if (objectFavorModel == null) {
			throw new BusinessException(RespCode.RESP_0209);
		}

		// 删除
		objectDao.deleteObjectFavorModelByObjectIdAndUserId(objectModel.getObjectId(), userId);

		// 记数
		objectDao.decreaseFavorCount(objectModel.getObjectId());
		userDao.decreaseFavorCount(userId);
	}

	/**
	 * 添加评论
	 *
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 * @param comment
	 * @param toCommentId
	 * @return commentId
	 */
	@Transactional
	public Long addComment(Long userId, Byte objectType, Long objectRefId, String comment, Long toCommentId) {
		// 先判断
		ObjectModel objectModel = objectDao.selectObjectModelByObjectTypeAndObjectRefId(objectType, objectRefId);
		if (objectModel == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}
		if (!BoolEnum.parseCode(objectModel.getCommentFlag())) {
			throw new BusinessException(RespCode.RESP_0210);
		}

		ObjectCommentModel toCommentModel = objectDao.selectObjectCommentModelByCommentId(toCommentId);
		if (toCommentModel == null) {
			throw new BusinessException(RespCode.RESP_0211);
		}
		if (!objectModel.getObjectId().equals(toCommentModel.getObjectId())) {
			throw new BusinessException(RespCode.RESP_0212);
		}

		// 插入评论
		ObjectCommentModel objectCommentModel = new ObjectCommentModel();
		objectCommentModel.setCommentId(generateCommentId());
		objectCommentModel.setObjectId(objectModel.getObjectId());
		objectCommentModel.setUserId(userId);
		objectCommentModel.setToCommentId(toCommentId);
		objectCommentModel.setCommentContent(comment);
		objectCommentModel.setAcceptFlag(BoolEnum.FALSE.getCode());
		objectCommentModel.setYesCount(0);
		objectCommentModel.setNoCount(0);
		Date now = DateUtil.now();
		objectCommentModel.setAddTime(now);
		objectCommentModel.setUpdTime(now);
		objectDao.insertObjectCommentModel(objectCommentModel);

		// 记数
		objectDao.increaseCommentCount(objectModel.getObjectId());

		return objectCommentModel.getCommentId();
	}

	/**
	 * 删除评论
	 *
	 * @param userId
	 * @param commentId
	 */
	@Transactional
	public void removeComment(Long userId, Long commentId) {
		// 先判断
		ObjectCommentModel commentModel = objectDao.selectObjectCommentModelByCommentId(commentId);
		if (commentModel == null) {
			throw new BusinessException(RespCode.RESP_0211);
		}
		if (!userId.equals(commentModel.getUserId())) {
			throw new BusinessException(RespCode.RESP_0213);
		}

		// 插入评论
		objectDao.deleteObjectCommentModelByCommentId(commentId);

		// 记数
		objectDao.decreaseCommentCount(commentModel.getObjectId());
	}

	protected Long generateCommentId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_OBJECT_COMMENT_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}

}
