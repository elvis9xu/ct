package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.UserBabyModel;
import com.xjd.ct.dal.dos.UserBabyModelExample;
import com.xjd.ct.dal.dos.UserBindAccountModel;
import com.xjd.ct.dal.dos.UserBindAccountModelExample;
import com.xjd.ct.dal.dos.UserInfoModel;
import com.xjd.ct.dal.dos.UserModel;
import com.xjd.ct.dal.dos.UserSummaryModel;
import com.xjd.ct.dal.map.UserBabyModelMapper;
import com.xjd.ct.dal.map.UserBindAccountModelMapper;
import com.xjd.ct.dal.map.UserInfoModelMapper;
import com.xjd.ct.dal.map.UserModelMapper;
import com.xjd.ct.dal.map.UserSummaryModelMapper;

/**
 * 网关特有与用户相关的Dao
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午4:11:32
 */
@Repository
@Transactional
public class UserBizDao {
	@Autowired
	UserModelMapper userModelMapper;
	@Autowired
	UserInfoModelMapper userInfoModelMapper;
	@Autowired
	UserBabyModelMapper userBabyModelMapper;
	@Autowired
	UserSummaryModelMapper userSummaryModelMapper;
	@Autowired
	UserBindAccountModelMapper userBindAccountModelMapper;

	public UserModel selectUserByUserId(Long userId) {
		return userModelMapper.selectByPrimaryKey(userId);
	}

	public UserInfoModel selectUserInfoByUserId(Long userId) {
		return userInfoModelMapper.selectByPrimaryKey(userId);
	}

	public UserSummaryModel selectUserSummarybyUserId(Long userId) {
		return userSummaryModelMapper.selectByPrimaryKey(userId);
	}

	public List<UserBabyModel> selectUserBabyByUserId(Long userId) {
		UserBabyModelExample example = new UserBabyModelExample();
		example.or().andUserIdEqualTo(userId);

		return userBabyModelMapper.selectByExample(example);
	}

	public List<UserBindAccountModel> selectUserBindAccountByUserId(Long userId) {
		UserBindAccountModelExample example = new UserBindAccountModelExample();
		example.or().andUserIdEqualTo(userId);

		return userBindAccountModelMapper.selectByExample(example);
	}
}
