package com.xjd.ct.app.ctrlr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.UserBody;
import com.xjd.ct.app.view.vo.UserBabyVo;
import com.xjd.ct.app.view.vo.UserBindAccountVo;
import com.xjd.ct.app.view.vo.UserVo;
import com.xjd.ct.biz.bo.UserBabyBo;
import com.xjd.ct.biz.bo.UserBindAccountBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.biz.service.UserService;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

@Controller
@RequestMapping("/10")
public class UserController10 {
	@Autowired
	UserService userService;

	@RequestMapping("/getUserInfo")
	@ResponseBody
	public View getUserInfo() {
		// 业务调用
		UserBo userBo = userService.queryUserByUserId(RequestContext.checkAndGetUser().getUserId());

		if (userBo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		// 结果封装
		UserVo userVo = new UserVo();
		BeanUtils.copyProperties(userBo, userVo);

		if (userBo.getBabyList() != null) {
			List<UserBabyVo> babyList = new ArrayList<UserBabyVo>(userBo.getBabyList().size());
			for (UserBabyBo bo : userBo.getBabyList()) {
				UserBabyVo babyBody = new UserBabyVo();
				BeanUtils.copyProperties(bo, babyBody);
				babyList.add(babyBody);
			}
			userVo.setBabyList(babyList);
		}

		if (userBo.getBindAccountList() != null) {
			List<UserBindAccountVo> accountBodyList = new ArrayList<UserBindAccountVo>(userBo.getBindAccountList()
					.size());
			for (UserBindAccountBo bo : userBo.getBindAccountList()) {
				UserBindAccountVo accountBody = new UserBindAccountVo();
				BeanUtils.copyProperties(bo, accountBody);
				accountBodyList.add(accountBody);
			}
			userVo.setBindAccountList(accountBodyList);
		}

		UserBody body = new UserBody();
		body.setUserInfo(userVo);

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}


}
