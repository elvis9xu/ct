package com.xjd.ct.dal.mapper;

import org.apache.ibatis.annotations.Param;

import com.xjd.ct.dal.model.TokenDo;

/**
 * Token数据访问
 *
 * @author elvis.xu
 * @since 2015-02-27 11:19
 */
public interface TokenMapper {

	/**
	 * 通过token查询
	 *
	 * @param token
	 * @return
	 */
	TokenDo selectByToken(String token);

	/**
	 * 根据userId查询
	 *
	 * @param userId
	 * @return
	 */
	TokenDo selectByUserId(String userId);

	/**
	 * 通过userIp和userId查询
	 *
	 * @param userIp
	 * @param userId
	 * @return
	 */
	TokenDo selectByUserIpAndUserId(@Param("userIp") String userIp, @Param("userId") String userId);

	/**
	 * 通过token删除
	 *
	 * @param token
	 * @return
	 */
	int deleteByToken(String token);

	/**
	 * 通过userId删除
	 *
	 * @param userId
	 * @return
	 */
	int deleteByUserId(String userId);

	/**
	 * 根据userIp和userId删除
	 *
	 * @param userIp
	 * @param userId
	 * @return
	 */
	int deleteByUserIpAndUserId(@Param("userIp") String userIp, @Param("userId") String userId);

	/**
	 * 插入一条数据 属性为所有属性
	 *
	 * @param tokenDo
	 * @return
	 */
	int insert(TokenDo tokenDo);

	/**
	 * 插入一条数据 属性为所有非<code>null</code>属性
	 *
	 * @param tokenDo
	 * @return
	 */
	int insertSelective(TokenDo tokenDo);

	/**
	 * 通过token更新数据 更新属性为除token之外的所有属性
	 *
	 * @param tokenDo
	 * @return
	 */
	int updateByToken(TokenDo tokenDo);

	/**
	 * 通过token更新数据 更新属性为除token之外的所有非<code>null</code>属性
	 *
	 * @param tokenDo
	 * @return
	 */
	int updateByTokenSelective(TokenDo tokenDo);

}
