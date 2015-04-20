package com.xjd.ct.app.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.app.view.vo.UserBabyForOtherVo;
import com.xjd.ct.app.view.vo.UserBabyForSelfVo;
import com.xjd.ct.app.view.vo.UserBindAccountForOtherVo;
import com.xjd.ct.app.view.vo.UserBindAccountForSelfVo;
import com.xjd.ct.app.view.vo.UserForOtherVo;
import com.xjd.ct.app.view.vo.UserForSelfVo;
import com.xjd.ct.dal.dao.AppUserDao;
import com.xjd.ct.dal.dos.UserBabyModel;
import com.xjd.ct.dal.dos.UserBindAccountModel;
import com.xjd.ct.dal.dos.UserInfoModel;
import com.xjd.ct.dal.dos.UserModel;
import com.xjd.ct.dal.dos.UserSummaryModel;

/**
 * 网关特有与用户相关的业务
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午2:29:00
 */
@Service
public class UserBiz {
	@Autowired
	AppUserDao appUserDao;

	/**
	 * 组装用户数据给用户自己
	 * 
	 * @param userId
	 * @return
	 */
	public UserForSelfVo getUserInfoForSelf(Long userId) {
		UserModel userModel = appUserDao.selectUserByUserId(userId);
		if (userModel == null) {
			return null;
		}

		UserForSelfVo userForSelfVo = new UserForSelfVo();
		BeanUtils.copyProperties(userModel, userForSelfVo);

		UserInfoModel userInfoModel = appUserDao.selectUserInfoByUserId(userId);
		BeanUtils.copyProperties(userInfoModel, userForSelfVo);

		UserSummaryModel userSummaryModel = appUserDao.selectUserSummarybyUserId(userId);
		BeanUtils.copyProperties(userSummaryModel, userForSelfVo);

		List<UserBabyModel> userBabyModelList = appUserDao.selectUserBabyByUserId(userId);
		if (CollectionUtils.isNotEmpty(userBabyModelList)) {
			List<UserBabyForSelfVo> babyForSelfVoList = new ArrayList<UserBabyForSelfVo>(userBabyModelList.size());
			for (UserBabyModel userBabyModel : userBabyModelList) {
				UserBabyForSelfVo babyForSelfVo = new UserBabyForSelfVo();
				BeanUtils.copyProperties(userBabyModel, babyForSelfVo);
				babyForSelfVoList.add(babyForSelfVo);
			}
			userForSelfVo.setBabyList(babyForSelfVoList);
		}

		List<UserBindAccountModel> bindAccountModelList = appUserDao.selectUserBindAccountByUserId(userId);
		if (CollectionUtils.isNotEmpty(bindAccountModelList)) {
			List<UserBindAccountForSelfVo> bindAccountForSelfVoList = new ArrayList<UserBindAccountForSelfVo>(
					bindAccountModelList.size());
			for (UserBindAccountModel bindAccountModel : bindAccountModelList) {
				UserBindAccountForSelfVo bindAccountForSelfVo = new UserBindAccountForSelfVo();
				BeanUtils.copyProperties(bindAccountModel, bindAccountForSelfVo);
				bindAccountForSelfVoList.add(bindAccountForSelfVo);
			}
			userForSelfVo.setBindAccountList(bindAccountForSelfVoList);
		}
		return userForSelfVo;
	}

	/**
	 * 组装用户数据给其它用户, 需要去除敏感信息
	 * 
	 * @param userId
	 * @return
	 */
	public UserForOtherVo getUserInfoForOther(Long userId) {
		UserForSelfVo userForSelfVo = getUserInfoForSelf(userId);

		UserForOtherVo userForOtherVo = new UserForOtherVo();
		BeanUtils.copyProperties(userForSelfVo, userForOtherVo);

		if (CollectionUtils.isNotEmpty(userForSelfVo.getBabyList())) {
			List<UserBabyForOtherVo> babyForOtherVoList = new ArrayList<UserBabyForOtherVo>(userForSelfVo.getBabyList()
					.size());
			for (UserBabyForOtherVo userBabyForSelftVo : userForSelfVo.getBabyList()) {
				UserBabyForOtherVo userBabyForOtherVo = new UserBabyForSelfVo();
				BeanUtils.copyProperties(userBabyForSelftVo, userBabyForOtherVo);
				babyForOtherVoList.add(userBabyForOtherVo);
			}
			userForOtherVo.setBabyList(babyForOtherVoList);
		}

		if (CollectionUtils.isNotEmpty(userForSelfVo.getBindAccountList())) {
			List<UserBindAccountForOtherVo> bindAccountForOtherVoList = new ArrayList<UserBindAccountForOtherVo>(
					userForSelfVo.getBindAccountList().size());
			for (UserBindAccountForOtherVo bindAccountForSelfVo : userForSelfVo.getBindAccountList()) {
				UserBindAccountForOtherVo bindAccountForOtherVo = new UserBindAccountForOtherVo();
				BeanUtils.copyProperties(bindAccountForSelfVo, bindAccountForOtherVo);
				bindAccountForOtherVoList.add(bindAccountForOtherVo);
			}
			userForOtherVo.setBindAccountList(bindAccountForOtherVoList);
		}
		return userForOtherVo;
	}
}
