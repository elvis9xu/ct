package com.xjd.ct.biz.util;

import org.springframework.beans.BeanUtils;

import com.xjd.ct.biz.bo.ServiceBo;
import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.dal.dos.ServiceModel;
import com.xjd.ct.dal.dos.TokenModel;
import com.xjd.ct.dal.dos.UserModel;

/**
 * DO与BO的互转
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午1:16:15
 */
public abstract class BeanTansferUtil {

	public static TokenBo transferTokenDoToTokenBo(TokenModel tokenDo) {
		if (tokenDo == null) {
			return null;
		}
		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenDo, tokenBo);
		return tokenBo;
	}

	public static ServiceBo transferServiceDoToServiceBo(ServiceModel serviceDo) {
		if (serviceDo == null) {
			return null;
		}
		ServiceBo serviceBo = new ServiceBo();
		BeanUtils.copyProperties(serviceDo, serviceBo);
		return serviceBo;
	}

	public static UserBo transferUserDoToUserBo(UserModel userDo) {
		if (userDo == null) {
			return null;
		}
		UserBo userBo = new UserBo();
		BeanUtils.copyProperties(userDo, userBo);
		return userBo;
	}
}
