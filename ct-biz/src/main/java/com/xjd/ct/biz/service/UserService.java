package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.UserBabyBo;
import com.xjd.ct.biz.bo.UserBasicBo;
import com.xjd.ct.biz.bo.UserBindAccountBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.*;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * 用户管理
 * 
 * @author elvis.xu
 * @since 2015-03-02 21:23
 */
@Service
public class UserService {

	@Autowired
	UserDao userDao;
	@Autowired
	SequenceDao sequenceDao;

	/**
	 * 通过userId查询用户 查询不到时返回null
	 * 
	 * @param userId
	 * @return
	 */
	public UserBo queryUserByUserId(Long userId) {
		UserDo userDo = userDao.selectByUserId(userId);

		return transferUserDoToUserBo(userDo);
	}

	/**
	 * 根据用户ID查询用户基本授权信息
	 * 
	 * @param userId
	 * @return
	 */
	public UserBasicBo queryUserBasicByUserId(Long userId) {
		UserModel userBasicDo = userDao.selectUserBasicBoByUserId(userId);

		return transferUserBasicDoToUserBasicBo(userBasicDo);
	}

	/**
	 * 设置用户信息
	 * 
	 * @param userId
	 * @param headImgRes
	 * @param nickname
	 * @param sex
	 * @param moodWords
	 * @param babyBirth
	 * @param babySex
	 */
	@Transactional
	public void setUserInfo(Long userId, String headImgRes, String nickname, Byte sex, String moodWords,
			Date babyBirth, Byte babySex) {
		UserInfoModel userInfoModel = userDao.selectUserInfoByUserId(userId);

		if (userInfoModel == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		Date now = DateUtil.now();
		userInfoModel.setHeadImgRes(headImgRes);
		userInfoModel.setNickname(nickname);
		userInfoModel.setSex(sex);
		userInfoModel.setMoodWords(moodWords);
		userInfoModel.setMoodWordsTime(now);
		userInfoModel.setUpdTime(now);
		userDao.updateUserInfoByUserId(userInfoModel);

		List<UserBabyModel> babyModelList = userDao.selectUserBabyByUserId(userId);
		if (babyModelList.size() > 0) {
			// 更新
			UserBabyModel babyModel = babyModelList.get(0);
			babyModel.setBabySex(babySex);
			babyModel.setBabyBirth(babyBirth);
			babyModel.setUpdTime(now);
			userDao.updateUserBabyByBabyId(babyModel);
		} else {
			// 插入
			UserBabyModel babyModel = new UserBabyModel();
			babyModel.setBabyId(generateBabyId());
			babyModel.setUserId(userId);
			babyModel.setBabySex(babySex);
			babyModel.setBabyBirth(babyBirth);
			babyModel.setAddTime(now);
			babyModel.setUpdTime(now);
			userDao.insertUserBaby(babyModel);
		}
	}

	/**
	 * Do -> Bo
	 * 
	 * @param userBasicDo
	 * @return
	 */
	private UserBasicBo transferUserBasicDoToUserBasicBo(UserModel userBasicDo) {
		if (userBasicDo == null) {
			return null;
		}

		UserBasicBo userBasicBo = new UserBasicBo();
		BeanUtils.copyProperties(userBasicDo, userBasicBo);
		return userBasicBo;
	}

	/**
	 * Do -> BO
	 * 
	 * @param userDo
	 * @return
	 */
	public static UserBo transferUserDoToUserBo(UserDo userDo) {
		if (userDo == null) {
			return null;
		}
		UserBo userBo = new UserBo();

		BeanUtils.copyProperties(userDo, userBo);

		if (userDo.getBabyList() != null) {
			List<UserBabyBo> boList = new ArrayList<UserBabyBo>(userDo.getBabyList().size());
			for (UserBabyModel model : userDo.getBabyList()) {
				UserBabyBo bo = transferUserBabyDoToUserBabyBo(model);
				boList.add(bo);
			}
			userBo.setBabyList(boList);
		}

		if (userDo.getBindAccountList() != null) {
			List<UserBindAccountBo> boList = new ArrayList<UserBindAccountBo>(userDo.getBindAccountList().size());
			for (UserBindAccountModel model : userDo.getBindAccountList()) {
				UserBindAccountBo bo = transferUserBindAccountDoToUserBindAccountBo(model);
				boList.add(bo);
			}
			userBo.setBindAccountList(boList);
		}

		return userBo;
	}

	/**
	 * Do -> BO
	 * 
	 * @param babyDo
	 * @return
	 */
	public static UserBabyBo transferUserBabyDoToUserBabyBo(UserBabyModel babyDo) {
		if (babyDo == null) {
			return null;
		}
		UserBabyBo babyBo = new UserBabyBo();
		BeanUtils.copyProperties(babyDo, babyBo);
		return babyBo;
	}

	/**
	 * Do -> BO
	 *
	 * @param userBindAccountDo
	 * @return
	 */
	private static UserBindAccountBo transferUserBindAccountDoToUserBindAccountBo(UserBindAccountModel userBindAccountDo) {
		if (userBindAccountDo == null) {
			return null;
		}
		UserBindAccountBo userBindAccountBo = new UserBindAccountBo();
		BeanUtils.copyProperties(userBindAccountDo, userBindAccountBo);
		return userBindAccountBo;
	}

	/**
	 * 生成一个新的BabyID
	 *
	 * @return
	 */
	protected Long generateBabyId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_USER_BABY_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}

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
		UserIdolModel userIdolModel = userDao.selectUserIdolByUserIdAndIdolUserId(userId, idolUserId);
		if (userIdolModel != null) {
			throw new BusinessException(RespCode.RESP_0130);
		}

		// 关注
		userIdolModel = new UserIdolModel();
		userIdolModel.setUserId(userId);
		userIdolModel.setIdolUserId(idolUserId);
		userIdolModel.setAddTime(DateUtil.now());
		userDao.insertUserIdol(userIdolModel);

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
		UserIdolModel userIdolModel = userDao.selectUserIdolByUserIdAndIdolUserId(userId, idolUserId);
		if (userIdolModel == null) {
			throw new BusinessException(RespCode.RESP_0131);
		}

		// 取消关注
		userDao.deleteUserIdolByUserIdAndIdolUserId(userId, idolUserId);

		// 关注记数
		userDao.decreaseIdolCountByUserId(userId);

		// 粉丝记数
		userDao.decreaseFansCountByUserId(idolUserId);

		// 生成消息 TODO
	}

	/**
	 * 查询用户所有已关注用户信息 TODO 分页查询, 一个SQL
	 *
	 * @param userId
	 * @return
	 */
	public List<UserBo> listIdolsByUserId(Long userId) {

		List<UserIdolModel> idolModelList = userDao.selectUserIdolByUserId(userId);

		List<UserBo> userBoList = new ArrayList<UserBo>(idolModelList.size());
		for (UserIdolModel userIdolModel : idolModelList) {
			UserBo userBo = queryUserByUserId(userIdolModel.getIdolUserId());
			userBoList.add(userBo);
		}

		return userBoList;
	}
}
