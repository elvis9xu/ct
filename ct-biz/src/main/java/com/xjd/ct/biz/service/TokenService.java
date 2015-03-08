package com.xjd.ct.biz.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.model.TokenBo;
import com.xjd.ct.dal.mapper.TokenMapper;
import com.xjd.ct.dal.model.TokenDo;
import com.xjd.ct.utl.DateUtil;

/**
 * Token的管理
 *
 * @author elvis.xu
 * @since 2015-02-25 14:50
 */
@Service
public class TokenService {

	public static final String ANONYMOUS_USERID = "";

	@Autowired
	TokenMapper tokenMapper;

	/**
	 * 根据用户IP生成Token
	 *
	 * @param userIp
	 * @return
	 */
	@Transactional
	public TokenBo getTokenForUserIp(String userIp) {
		// 查询作废以前的Token
		if (tokenMapper.selectByUserIpAndUserId(userIp, ANONYMOUS_USERID) != null) { // 先查询后删除用于优化
			tokenMapper.deleteByUserIpAndUserId(userIp, ANONYMOUS_USERID);
		}

		// 生成新的Token
		TokenDo tokenDo = new TokenDo();
		tokenDo.setToken(generateToken());
		tokenDo.setSecretKey(generateSecretKey());
		tokenDo.setUserIp(userIp);
		tokenDo.setUserId(ANONYMOUS_USERID);
		Date now = DateUtil.now();
		tokenDo.setAddTime(now);
		tokenDo.setUpdTime(now);

		tokenMapper.insert(tokenDo);

		// DO->BO
		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenDo, tokenBo);

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
	public TokenBo getTokenForUser(String userIp, String userId) {
		// 查询作废以前的Token
		if (tokenMapper.selectByUserId(userId) != null) { // 先查询后删除用于优化
			tokenMapper.deleteByUserId(userId);
		}

		// 生成新的Token
		TokenDo tokenDo = new TokenDo();
		tokenDo.setToken(generateToken());
		tokenDo.setSecretKey(generateSecretKey());
		tokenDo.setUserIp(userIp);
		tokenDo.setUserId(userId);
		Date now = DateUtil.now();
		tokenDo.setAddTime(now);
		tokenDo.setUpdTime(now);

		tokenMapper.insert(tokenDo);

		// DO->BO
		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenDo, tokenBo);

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
		TokenDo tokenDo = tokenMapper.selectByToken(token);

		// DO->BO
		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenDo, tokenBo);

		return tokenBo;
	}

	/**
	 * 根据用户IP查询Token
	 *
	 * @param userIp
	 * @return
	 */
	public TokenBo queryTokenByUserIp(String userIp) {
		// FIXME
		return null;
	}

	/**
	 * 根据用户ID查询Token
	 *
	 * @param userId
	 * @return
	 */
	public TokenBo queryTokenByUser(String userId) {
		// FIXME
		return null;
	}

	/**
	 * 判断Token是否有效
	 *
	 * @param token
	 */
	public void checkToken(TokenBo token) {
		// FIXME
	}

	protected String generateToken() {
		return UUID.randomUUID().toString().toUpperCase().replace("-", "");
	}

	protected String generateSecretKey() {
		return generateToken();
	}
}
