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
	@Autowired
	UserIdolModelMapper userIdolModelMapper;

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
	 * 根据用户名(手机号或邮箱)查询用户的基本信息(授权信息)
	 *
	 * @param username
	 * @return
	 */
	public UserModel selectUserBasicBoByUsername(String username) {
		UserModelExample example = new UserModelExample();
		example.or().andMobileEqualTo(username);
		example.or().andEmailEqualTo(username);

		List<UserModel> list = userModelMapper.selectByExample(example);
		QueryResultUtil.assertReturn0Or1(list, username);

		return list.size() > 0 ? list.get(0) : null;
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

	/**
	 * 用户FailTimes加1
	 *
	 * @param userId
	 * @return
	 */
	public int increaseFailTimesByUserId(Long userId) {
		UserModel userModel = userModelMapper.selectByPrimaryKey(userId);

		UserModel upd = new UserModel();
		upd.setUserId(userId);
		upd.setFailTimes((short) (userModel.getFailTimes() + 1));
		upd.setUpdTime(DateUtil.now());

		return userModelMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 清0用户的FailTImes
	 * 
	 * @param userId
	 * @return
	 */
	public int clearFailTimesByUserId(Long userId) {
		UserModel upd = new UserModel();
		upd.setUserId(userId);
		upd.setFailTimes((short) 0);
		upd.setUpdTime(DateUtil.now());

		return userModelMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 根据用户ID查询用户信息
	 *
	 * @param userId
	 * @return
	 */
	public UserInfoModel selectUserInfoByUserId(Long userId) {
		return userInfoModelMapper.selectByPrimaryKey(userId);
	}

	/**
	 * 根据用户ID更新用户信息
	 *
	 * @param userInfoModel
	 * @return
	 */
	public int updateUserInfoByUserId(UserInfoModel userInfoModel) {
		return userInfoModelMapper.updateByPrimaryKey(userInfoModel);
	}

	/**
	 * 根据用户ID查询用户的Baby
	 *
	 * @param userId
	 * @return
	 */
	public List<UserBabyModel> selectUserBabyByUserId(Long userId) {
		UserBabyModelExample example = new UserBabyModelExample();
		example.or().andUserIdEqualTo(userId);

		return userBabyModelMapper.selectByExample(example);
	}

	/**
	 * 根据宝宝ID更新宝宝信息
	 * 
	 * @param babyModel
	 * @return
	 */
	public int updateUserBabyByBabyId(UserBabyModel babyModel) {
		return userBabyModelMapper.updateByPrimaryKey(babyModel);
	}

	/**
	 * 插入宝宝信息
	 * 
	 * @param babyModel
	 * @return
	 */
	public int insertUserBaby(UserBabyModel babyModel) {
		return userBabyModelMapper.insert(babyModel);
	}

	/**
	 * 查询关注信息
	 *
	 * @param userId
	 * @param idolUserId
	 * @return
	 */
	public UserIdolModel selectUserIdolByUserIdAndIdolUserId(Long userId, Long idolUserId) {
		UserIdolModelKey key = new UserIdolModelKey();
		key.setUserId(userId);
		key.setIdolUserId(idolUserId);

		return userIdolModelMapper.selectByPrimaryKey(key);
	}

	/**
	 * 插入一条关注信息
	 *
	 * @param userIdolModel
	 * @return
	 */
	public int insertUserIdol(UserIdolModel userIdolModel) {
		return userIdolModelMapper.insert(userIdolModel);
	}

	/**
	 * 删除一条关注信息
	 *
	 * @param userId
	 * @param idolUserId
	 * @return
	 */
	public int deleteUserIdolByUserIdAndIdolUserId(Long userId, Long idolUserId) {
		UserIdolModelKey key = new UserIdolModelKey();
		key.setUserId(userId);
		key.setIdolUserId(idolUserId);
		return userIdolModelMapper.deleteByPrimaryKey(key);
	}

	/**
	 * 用户关注记数加1
	 * 
	 * @param userId
	 * @return
	 */
	public int increaseIdolCountByUserId(Long userId) {
		UserSummaryModel userSummaryModel = userSummaryModelMapper.selectByPrimaryKey(userId);

		UserSummaryModel upd = new UserSummaryModel();
		upd.setUserId(userId);
		upd.setIdolCount(userSummaryModel.getIdolCount() + 1);
		upd.setUpdTime(DateUtil.now());

		return userSummaryModelMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 用户粉丝记数加1
	 * 
	 * @param userId
	 * @return
	 */
	public int increaseFansCountByUserId(Long userId) {
		UserSummaryModel userSummaryModel = userSummaryModelMapper.selectByPrimaryKey(userId);

		UserSummaryModel upd = new UserSummaryModel();
		upd.setUserId(userId);
		upd.setFansCount(userSummaryModel.getFansCount() + 1);
		upd.setUpdTime(DateUtil.now());

		return userSummaryModelMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 用户关注记数减1
	 * 
	 * @param userId
	 * @return
	 */
	public int decreaseIdolCountByUserId(Long userId) {
		UserSummaryModel userSummaryModel = userSummaryModelMapper.selectByPrimaryKey(userId);

		UserSummaryModel upd = new UserSummaryModel();
		upd.setUserId(userId);
		upd.setIdolCount(userSummaryModel.getIdolCount() - 1);
		upd.setUpdTime(DateUtil.now());

		return userSummaryModelMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 用户粉丝记数减1
	 *
	 * @param userId
	 * @return
	 */
	public int decreaseFansCountByUserId(Long userId) {
		UserSummaryModel userSummaryModel = userSummaryModelMapper.selectByPrimaryKey(userId);

		UserSummaryModel upd = new UserSummaryModel();
		upd.setUserId(userId);
		upd.setFansCount(userSummaryModel.getFansCount() - 1);
		upd.setUpdTime(DateUtil.now());

		return userSummaryModelMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 查询用户的所有关注信息
	 * 
	 * @param userId
	 * @return
	 */
	public List<UserIdolModel> selectUserIdolByUserId(Long userId) {
		UserIdolModelExample example = new UserIdolModelExample();
		example.or().andUserIdEqualTo(userId);

		return userIdolModelMapper.selectByExample(example);
	}
}
