package com.xjd.ct.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dao.IdolDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.UserIdolModel;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 用户关系管理
 * *. 用户关注管理
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午12:58:29
 */
@Service
public class UserRelationService {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	IdolDao idolDao;
	@Autowired
	UserDao userDao;

	/**
	 * 关注用户
	 * 
	 * @param userId
	 * @param idolUserId
	 */
	@Transactional
	public void addIdol(Long userId, Long idolUserId) {
		if (userId.equals(idolUserId)) {
			throw new BusinessException(RespCode.RESP_0132);
		}

		// 判断是否已关注
		UserIdolModel userIdolModel = idolDao.selectUserIdolByUserIdAndIdolUserId(userId, idolUserId);
		if (userIdolModel != null) {
			throw new BusinessException(RespCode.RESP_0130);
		}

		// 关注
		userIdolModel = new UserIdolModel();
		userIdolModel.setUserId(userId);
		userIdolModel.setIdolUserId(idolUserId);
		userIdolModel.setAddTime(DateUtil.now());
		idolDao.insertUserIdol(userIdolModel);

		// 关注记数
		userDao.increaseIdolCountByUserId(userId);

		// 粉丝记数
		userDao.increaseFansCountByUserId(idolUserId);

		// 生成消息 TODO
	}

	/**
	 * 取消关注
	 * 
	 * @param userId
	 * @param idolUserId
	 */
	@Transactional
	public void cancelIdol(Long userId, Long idolUserId) {
		if (userId.equals(idolUserId)) {
			throw new BusinessException(RespCode.RESP_0132);
		}

		// 判断是否已关注
		UserIdolModel userIdolModel = idolDao.selectUserIdolByUserIdAndIdolUserId(userId, idolUserId);
		if (userIdolModel == null) {
			throw new BusinessException(RespCode.RESP_0131);
		}

		// 取消关注
		idolDao.deleteUserIdolByUserIdAndIdolUserId(userId, idolUserId);

		// 关注记数
		userDao.decreaseIdolCountByUserId(userId);

		// 粉丝记数
		userDao.decreaseFansCountByUserId(idolUserId);

		// 生成消息 TODO
	}

}
