package com.xjd.ct.biz.service;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBasicBo;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.TokenDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.TokenModel;
import com.xjd.ct.dal.dos.UserDo;
import com.xjd.ct.dal.dos.UserModel;
import com.xjd.ct.utl.AppUtil;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.DigestUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.enums.UserSexEnum;
import com.xjd.ct.utl.enums.UserStatusEnum;
import com.xjd.ct.utl.enums.UserTypeEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * Token的管理
 * 
 * @author elvis.xu
 * @since 2015-02-25 14:50
 */
@Service
public class AuthService {
	@Autowired
	TokenDao tokenDao;
	@Autowired
	UserDao userDao;
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	UserService userService;

	/**
	 * 根据用户IP生成Token
	 * 
	 * @param userIp
	 * @return
	 */
	@Transactional
	public TokenBo genTokenForUserIp(String userIp) {
		// 查询作废以前的Token
		if (tokenDao.selectByUserIpAndUserId(userIp, AppConstant.ANONYMOUS_USERID) != null) { // 先查询后删除用于优化
			tokenDao.deleteByUserIpAndUserId(userIp, AppConstant.ANONYMOUS_USERID);
		}

		// 生成新的Token
		TokenModel tokenModel = new TokenModel();
		tokenModel.setToken(generateToken());
		tokenModel.setSalt(generateSalt());
		tokenModel.setUserIp(userIp);
		tokenModel.setUserId(AppConstant.ANONYMOUS_USERID);
		Date now = DateUtil.now();
		tokenModel.setAddTime(now);
		tokenModel.setUpdTime(now);
		tokenDao.insert(tokenModel);

		// DO->BO
		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenModel, tokenBo);
		return tokenBo;
	}

	/**
	 * 根据用户IP和用户ID生成Token
	 * 
	 * @param userIp
	 * @param userId
	 * @return
	 */
	@Transactional
	public TokenBo genTokenForUser(String userIp, Long userId) {
		// 查询作废以前的Token
		if (tokenDao.selectByUserId(userId) != null) { // 先查询后删除用于优化
			tokenDao.deleteByUserId(userId);
		}

		// 生成新的Token
		TokenModel tokenModel = new TokenModel();
		tokenModel.setToken(generateToken());
		tokenModel.setSalt(generateSalt());
		tokenModel.setUserIp(userIp);
		tokenModel.setUserId(userId);
		Date now = DateUtil.now();
		tokenModel.setAddTime(now);
		tokenModel.setUpdTime(now);
		tokenDao.insert(tokenModel);

		// DO->BO
		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenModel, tokenBo);
		return tokenBo;
	}

	/**
	 * 通过token查询Token
	 * 
	 * @param token
	 * @return
	 */
	@Transactional(readOnly = true)
	public TokenBo queryTokenByToken(String token) {
		TokenModel tokenDo = tokenDao.selectByToken(token);

		if (tokenDo != null) {
			// DO->BO
			TokenBo tokenBo = new TokenBo();
			BeanUtils.copyProperties(tokenDo, tokenBo);
			return tokenBo;
		}
		return null;
	}

	/**
	 * 更新token的时间 在每次使用token访问时调用该方法
	 * 
	 * @param token
	 */
	public void updateToken(String token) {
		tokenDao.updateUpdTimeByToken(DateUtil.now(), token);
	}

	public void deleteToken(String token) {
		tokenDao.deleteByToken(token);
	}

	/**
	 * 判断Token是否有效
	 * 
	 * @param token
	 */
	public void checkToken(TokenBo token) {
		if (token == null) {
			throw new BusinessException(RespCode.RESP_0101);
		}
		// TODO 其它过期校验
	}

	/**
	 * 生成TOKEN
	 * 
	 * @return
	 */
	protected String generateToken() {
		return UUID.randomUUID().toString().toUpperCase().replace("-", "");
	}

	/**
	 * 生成Salt
	 * 
	 * @return
	 */
	protected String generateSalt() {
		return generateToken();
	}

	/**
	 * 检查用户名是否存在
	 *
	 * @param username
	 */
	@Transactional(readOnly = true)
	public boolean isUserExists(String username) {
		return userDao.isMobileOrEmailExists(username);
	}

	/**
	 * 注册
	 *
	 * @param username
	 * @param password
	 */
	@Transactional
	public void signup(String username, String password) {
		// 校验用户名是否可用
		int mobileOrEmail = AppUtil.mobileOrEmail(username);
		if (isUserExists(username)) {
			if (mobileOrEmail == 1) {
				throw new BusinessException(RespCode.RESP_0121);
			} else {
				throw new BusinessException(RespCode.RESP_0122);
			}
		}

		// 保存用户
		UserDo userDo = new UserDo();
		userDo.setUserId(generateUserId());
		userDo.setPassword(encryptPassword(password));
		userDo.setMobile(mobileOrEmail == 1 ? username : "");
		userDo.setMobileVerifyFlag(BoolEnum.FALSE.getCode());
		userDo.setEmail(mobileOrEmail == 2 ? username : "");
		userDo.setEmailVerifyFlag(BoolEnum.FALSE.getCode());
		userDo.setQqBindFlag(BoolEnum.FALSE.getCode());
		userDo.setWeixinBindFlag(BoolEnum.FALSE.getCode());
		userDo.setSinaWeiboBindFlag(BoolEnum.FALSE.getCode());
		userDo.setTecentWeiboFlag(BoolEnum.FALSE.getCode());
		userDo.setFailTimes((short) 0);
		userDo.setUserStatus(UserStatusEnum.NORMAL.getCode());
		userDo.setAddTime(DateUtil.now());

		userDo.setUserType(UserTypeEnum.NORMAL.getCode());
		userDo.setGradeExp(0);
		userDo.setGradeLevel((byte) 0);
		userDo.setPoint(0);
		userDo.setHeadImgRes(null);
		userDo.setSex(UserSexEnum.FEMALE.getCode());
		userDo.setNickname(generateNickname(UserSexEnum.FEMALE));

		userDo.setInformCount(0);
		userDo.setFavorCount(0);
		userDo.setPublishCount(0);
		userDo.setIdolCount(0);
		userDo.setFansCount(0);

		userDao.insertUser(userDo);

		// TODO 发送验证信息
	}

	/**
	 * 生成一个新的UserId
	 *
	 * @return
	 */
	protected Long generateUserId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_USER_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}

	/**
	 * 处理明文密码
	 * 
	 * @param password
	 * @return
	 */
	protected String encryptPassword(String password) {
		return DigestUtil.sha(password);
	}

	/**
	 * 生成一个随机的用户昵称
	 * 
	 * @return
	 */
	protected String generateNickname(UserSexEnum sexEnum) {
		StringBuilder sb = new StringBuilder(10);
		if (sexEnum == UserSexEnum.FEMALE) {
			sb.append("宝妈");
		} else {
			sb.append("宝爸");
		}
		Random r = new Random();
		for (int i = 0; i < 8; i++) {
			sb.append(r.nextInt(10));
		}
		return sb.toString();
	}

	/**
	 * 登录
	 * 
	 * @param username
	 * @param password
	 * @param userIp
	 * @return
	 */
	public TokenBo signin(String username, String password, String userIp) {
		UserModel userModel = userDao.selectUserBasicBoByUsername(username);
		if (userModel == null) { // 用户名或密码错误
			throw new BusinessException(RespCode.RESP_0112);
		}

		UserStatusEnum statusEnum = UserStatusEnum.valueOfCode(userModel.getUserStatus());
		if (statusEnum == UserStatusEnum.LOCKED) {
			throw new BusinessException(RespCode.RESP_0114);

		} else if (statusEnum == UserStatusEnum.NON_ACTIVE) {
			throw new BusinessException(RespCode.RESP_0115);
		}

		String pwd = encryptPassword(password);
		if (!StringUtils.equals(pwd, userModel.getPassword())) {
			// 更新登录失败次数
			userDao.increaseFailTimesByUserId(userModel.getUserId());
			// 超过指定次数锁定账户 TODO

			throw new BusinessException(RespCode.RESP_0112);
		}

		if (userModel.getFailTimes() > 0) {
			// 清零
			userDao.clearFailTimesByUserId(userModel.getUserId());
		}

		TokenBo tokenBo = genTokenForUser(userIp, userModel.getUserId());

		return tokenBo;
	}

	/**
	 * 登出
	 * 
	 * @param userId
	 */
	@Transactional
	public void signout(Long userId) {
		tokenDao.deleteByUserId(userId);
	}

	/**
	 * 修改密码
	 *
	 * @param userId
	 * @param password
	 * @param newPassword
	 */
	@Transactional
	public void changePassword(Long userId, String password, String newPassword) {
		UserBasicBo userBasicBo = userService.queryUserBasicByUserId(userId);

		if (userBasicBo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		if (!StringUtils.equals(encryptPassword(password), userBasicBo.getPassword())) {
			throw new BusinessException(RespCode.RESP_0113);
		}

		userDao.updatePasswordByUserId(encryptPassword(newPassword), userId);
	}
}
