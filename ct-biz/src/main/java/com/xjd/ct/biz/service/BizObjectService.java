package com.xjd.ct.biz.service;

/**
 * <pre>
 * 业务对象管理
 * 1. 对象类型管理
 * 2. 对象标签管理
 * 3. 对象投票管理
 * 4. 对象点赞管理
 * 5. 对象收藏管理
 * 6. 对象评论管理
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午12:15:08
 */
public class BizObjectService {

	/**
	 * 添加点赞
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 * @param yesOrNo
	 */
	public void addLike(Long userId, Byte objectType, Long objectRefId, Byte yesOrNo) {
		// FIXME
	}

	/**
	 * 删除点赞
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 * @param yesOrNo
	 */
	public void removeLike(Long userId, Byte objectType, Long objectRefId, Byte yesOrNo) {
		// FIXME
	}

	/**
	 * 添加收藏
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 */
	public void addFavor(Long userId, Byte objectType, Long objectRefId) {
		// FIXME
	}

	/**
	 * 取消收藏
	 * 
	 * @param userId
	 * @param objectType
	 * @param objectRefId
	 */
	public void removeFavor(Long userId, Byte objectType, Long objectRefId) {
		// FIXME
	}

}
