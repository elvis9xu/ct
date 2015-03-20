package com.xjd.ct.app.ctrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.TokenBody;
import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.service.TokenService;

@Controller
@RequestMapping("/10")
public class UserController10 {

	@Autowired
	TokenService tokenService;

	@RequestMapping("/getToken")
	@ResponseBody
	public View getToken() {
		// 业务调用
		TokenBo tokenBo = tokenService.genTokenForUserIp(RequestContext.getUserIp());

		// 结果封装
		View view = ViewUtil.defaultView();

		TokenBody body = new TokenBody();
		body.setToken(tokenBo.getToken());
		body.setSalt(tokenBo.getSalt());

		view.setBody(body);

		return view;
	}

}
