package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.*;

/**
 * 用户数据Dao
 * 
 * @author elvis.xu
 * @since 2015-3-19 下午7:15:19
 */
@Repository
@Transactional
public class UserDao {

	@Autowired
	UserModelMapper userModelMapper;
	@Autowired
	UserInfoModelMapper userInfoModelMapper;
	@Autowired
	UserSummaryModelMapper userSummaryModelMapper;
	@Autowired
	UserBabyModelMapper userBabyModelMapper;
	@Autowired
	UserBindAccountModelMapper userBindAccountModelMapper;

	/**
	 * 通过UserId查询用户全量数据
	 *
	 * @param userId
	 * @return
	 */
	public UserDo selectByUserId(Long userId) {
		UserModel userModel = userModelMapper.selectByPrimaryKey(userId);
		if (userModel == null) {
			return null;
		}

		UserInfoModel userInfoModel = userInfoModelMapper.selectByPrimaryKey(userId);
		UserSummaryModel userSummaryModel = userSummaryModelMapper.selectByPrimaryKey(userId);

		UserDo userDo = new UserDo();
		BeanUtils.copyProperties(userInfoModel, userDo);
		BeanUtils.copyProperties(userSummaryModel, userDo);
		BeanUtils.copyProperties(userModel, userDo);

		UserBabyModelExample userBabyModelExample = new UserBabyModelExample();
		userBabyModelExample.or().andUserIdEqualTo(userId);
		List<UserBabyModel> babyModelList = userBabyModelMapper.selectByExample(userBabyModelExample);
		userDo.setBabyList(babyModelList);

		UserBindAccountModelExample userBindAccountModelExample = new UserBindAccountModelExample();
		userBindAccountModelExample.or().andUserIdEqualTo(userId);
		List<UserBindAccountModel> userBindAccountModelList = userBindAccountModelMapper.selectByExample(userBindAccountModelExample);
		userDo.setBindAccountList(userBindAccountModelList);

		return userDo;
	}
}
