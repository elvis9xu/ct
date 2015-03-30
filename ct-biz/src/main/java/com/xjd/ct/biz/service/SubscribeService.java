package com.xjd.ct.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dao.SubscribeDao;
import com.xjd.ct.dal.dos.AgeBracketModel;
import com.xjd.ct.dal.dos.SubscribeModel;
import com.xjd.ct.dal.dos.UserAgeBracketResModel;
import com.xjd.ct.dal.dos.UserSubscribeModel;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 订阅管理
 * > 添加订阅
 * > 编辑订阅
 * > 删除订阅
 * > 添加年龄段
 * > 删除年龄段
 * > 用户订阅
 * > 取消用户订阅
 * > 用户设置年龄段
 * > 用户取消设置年龄段
 * </pre>
 * @author elvis.xu
 * @since 2015-3-26 下午12:22:05
 */
@Service
public class SubscribeService {
	@Autowired
	SubscribeDao subscribeDao;

	@Transactional
	public void subscribe(Long userId, Long subscribeId) {
		// 判断
		SubscribeModel subscribeModel = subscribeDao.selectSubscribeModelBySubscribeId(subscribeId);
		if (subscribeModel == null) {
			throw new BusinessException(RespCode.RESP_0214);
		}

		UserSubscribeModel userSubscribeModel = subscribeDao.selectUserSubscribeModelByUserIdAndSubscribeId(userId,
				subscribeId);
		if (userSubscribeModel != null) {
			throw new BusinessException(RespCode.RESP_0215);
		}

		// 订阅
		userSubscribeModel = new UserSubscribeModel();
		userSubscribeModel.setUserId(userId);
		userSubscribeModel.setSubscribeId(subscribeId);
		userSubscribeModel.setAddTime(DateUtil.now());
		subscribeDao.insertUserSubscribeModel(userSubscribeModel);
	}

	public void unsubscribe(Long userId, Long subscribeId) {
		// 判断
		UserSubscribeModel userSubscribeModel = subscribeDao.selectUserSubscribeModelByUserIdAndSubscribeId(userId,
				subscribeId);
		if (userSubscribeModel == null) {
			throw new BusinessException(RespCode.RESP_0216);
		}

		// 取消
		subscribeDao.deleteUserSubscribeModelByUserIdAndSubscribeId(userId, subscribeId);
	}

	public void setAgeBracket(Long userId, Long ageBracketId) {
		// 判断
		AgeBracketModel ageBracketModel = subscribeDao.selectAgeBracketModelByAgeBracketId(ageBracketId);
		if (ageBracketModel == null) {
			throw new BusinessException(RespCode.RESP_0217);
		}

		UserAgeBracketResModel userAgeBracketResModel = subscribeDao
				.selectUserAgeBracketResModelByUserIdAndAgeBracketId(userId, ageBracketId);
		if (userAgeBracketResModel != null) {
			throw new BusinessException(RespCode.RESP_0218);
		}

		// 订阅
		userAgeBracketResModel = new UserAgeBracketResModel();
		userAgeBracketResModel.setUserId(userId);
		userAgeBracketResModel.setAgeBracketId(ageBracketId);
		userAgeBracketResModel.setAddTime(DateUtil.now());
		subscribeDao.insertUserAgeBracketResModel(userAgeBracketResModel);
	}

	public void unsetAgeBracket(Long userId, Long ageBracketId) {
		// 判断
		UserAgeBracketResModel userAgeBracketResModel = subscribeDao
				.selectUserAgeBracketResModelByUserIdAndAgeBracketId(userId, ageBracketId);
		if (userAgeBracketResModel == null) {
			throw new BusinessException(RespCode.RESP_0219);
		}

		// 取消
		subscribeDao.deleteUserAgeBracketResModelByUserIdAndAgeBracketId(userId, ageBracketId);
	}
}
