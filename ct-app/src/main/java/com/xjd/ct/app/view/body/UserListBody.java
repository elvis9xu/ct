package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.UserVo;

/**
 * 用户全量信息
 * 
 * @author elvis.xu
 * @since 2015-03-23 18:34
 */
public class UserListBody extends ViewBody {
	private List<UserVo> userInfoList;

	public List<UserVo> getUserInfoList() {
		return userInfoList;
	}

	public void setUserInfoList(List<UserVo> userInfoList) {
		this.userInfoList = userInfoList;
	}
}
