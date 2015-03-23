package com.xjd.ct.app.view.body;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.UserVo;

/**
 * 用户全量信息
 * 
 * @author elvis.xu
 * @since 2015-03-23 18:34
 */
public class UserBody extends ViewBody {
	private UserVo userInfo;

	public UserVo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserVo userInfo) {
		this.userInfo = userInfo;
	}
}
