package com.xjd.ct.biz.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.dal.dao.TokenDao;
import com.xjd.ct.dal.dos.TokenModel;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * Token的管理
 * 
 * @author elvis.xu
 * @since 2015-02-25 14:50
 */
@Service
public class TokenService {
	public static final Long ANONYMOUS_USERID = 0L;

	@Autowired
	TokenDao tokenDao;

	/**
	 * 根据用户IP生成Token
	 * 
	 * @param userIp
	 * @return
	 */
	@Transactional
	public TokenBo genTokenForUserIp(String userIp) {
		// 查询作废以前的Token
		if (tokenDao.selectByUserIpAndUserId(userIp, ANONYMOUS_USERID) != null) { // 先查询后删除用于优化
			tokenDao.deleteByUserIpAndUserId(userIp, ANONYMOUS_USERID);
		}

		// 生成新的Token
		TokenModel tokenModel = new TokenModel();
		tokenModel.setToken(generateToken());
		tokenModel.setSalt(generateSalt());
		tokenModel.setUserIp(userIp);
		tokenModel.setUserId(ANONYMOUS_USERID);
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
}
