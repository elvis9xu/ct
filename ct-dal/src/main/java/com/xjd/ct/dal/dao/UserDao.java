package com.xjd.ct.dal.dao;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.*;
import com.xjd.ct.dal.util.QueryResultUtil;
import com.xjd.ct.utl.DateUtil;

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

	/**
	 * 检查手机号或邮箱是否存在
	 *
	 * @param mobileOrEmail
	 * @return
	 */
	public boolean isMobileOrEmailExists(String mobileOrEmail) {
		UserModelExample example = new UserModelExample();
		example.or().andMobileEqualTo(mobileOrEmail);
		example.or().andEmailEqualTo(mobileOrEmail);

		return userModelMapper.countByExample(example) > 0 ? true : false;
	}

	/**
	 * 插入一个新用户
	 *
	 * @param userDo
	 */
	public void insertUser(UserDo userDo) {
		Date now = DateUtil.now();

		UserModel userModel = new UserModel();
		UserInfoModel userInfoModel = new UserInfoModel();
		UserSummaryModel userSummaryModel = new UserSummaryModel();

		BeanUtils.copyProperties(userDo, userModel);
		BeanUtils.copyProperties(userDo, userInfoModel);
		BeanUtils.copyProperties(userDo, userSummaryModel);
		userModel.setUpdTime(now);
		userInfoModel.setUpdTime(now);
		userSummaryModel.setUpdTime(now);

		userModelMapper.insert(userModel);
		userInfoModelMapper.insert(userInfoModel);
		userSummaryModelMapper.insert(userSummaryModel);

		if (CollectionUtils.isNotEmpty(userDo.getBabyList())) {
			for (UserBabyModel babyModel : userDo.getBabyList()) {
				babyModel.setUpdTime(now);
				userBabyModelMapper.insert(babyModel);
			}
		}
		if (CollectionUtils.isNotEmpty(userDo.getBindAccountList())) {
			for (UserBindAccountModel bindAccountModel : userDo.getBindAccountList()) {
				bindAccountModel.setUpdTime(now);
				userBindAccountModelMapper.insert(bindAccountModel);
			}

		}
	}

	/**
	 * 根据用户名(手机或邮箱)和密码查找用户的ID
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Long selectUserIdByUsernameAndPassword(String username, String password) {
		UserModelExample example = new UserModelExample();
		example.or().andMobileEqualTo(username).andPasswordEqualTo(password);
		example.or().andEmailEqualTo(username).andPasswordEqualTo(password);

		List<UserModel> list = userModelMapper.selectByExample(example);
		QueryResultUtil.assertReturn0Or1(list, username, password);

		return list.size() > 0 ? list.get(0).getUserId() : null;
	}

	/**
	 * 根据用户ID查询用户的基本信息(授权信息)
	 * 
	 * @param userId
	 * @return
	 */
	public UserModel selectUserBasicBoByUserId(Long userId) {
		return userModelMapper.selectByPrimaryKey(userId);
	}

	/**
	 * 通过用户ID更新密码
	 * 
	 * @param password
	 * @param userId
	 * @return
	 */
	public int updatePasswordByUserId(String password, Long userId) {
		UserModel userModel = new UserModel();
		userModel.setPassword(password);
		userModel.setUserId(userId);
		userModel.setUpdTime(DateUtil.now());
		return userModelMapper.updateByPrimaryKeySelective(userModel);
	}
}
