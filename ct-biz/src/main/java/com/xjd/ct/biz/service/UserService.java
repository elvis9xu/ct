package com.xjd.ct.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.utl.enums.BoolEnum;

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
		userBo.setAddTime(userDo.getAddTime());
		userBo.setUpdTime(userDo.getUpdTime());
		userBo.setEmail(userDo.getEmail());
		userBo.setEmailFlag(BoolEnum.parseCode(userDo.getEmailFlag()));
		userBo.setLastIp(userDo.getLastIp());
		userBo.setLastTime(userDo.getLastTime());
		userBo.setLoginFailTimes(userDo.getLoginFailTimes());
		userBo.setLoginName(userDo.getLoginName());
		userBo.setLoginPwd(userDo.getLoginPwd());
		userBo.setMobile(userDo.getMobile());
		userBo.setMobileFlag(BoolEnum.parseCode(userDo.getMobileFlag()));
		userBo.setNickName(userDo.getNickName());
		userBo.setStatus(userDo.getStatus());
		userBo.setUpdTime(userDo.getUpdTime());
		userBo.setUserId(userDo.getUserId());

		return userBo;
	}
}
