package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.UserBabyBo;
import com.xjd.ct.biz.bo.UserBasicBo;
import com.xjd.ct.biz.bo.UserBindAccountBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.UserBabyModel;
import com.xjd.ct.dal.dos.UserBindAccountModel;
import com.xjd.ct.dal.dos.UserDo;
import com.xjd.ct.dal.dos.UserModel;

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
}
