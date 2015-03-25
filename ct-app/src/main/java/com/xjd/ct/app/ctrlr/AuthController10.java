package com.xjd.ct.app.ctrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.ExistsBody;
import com.xjd.ct.app.view.body.TokenBody;
import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.service.AuthService;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 授权
 * 
 * @author elvis.xu
 * @since 2015-03-23 12:59
 */
@Controller
@RequestMapping("/10")
public class AuthController10 {
	@Autowired
	AuthService authService;

	@RequestMapping("/getToken")
	@ResponseBody
	public View getToken() {
		// 业务调用
		TokenBo tokenBo = authService.genTokenForUserIp(RequestContext.getUserIp());

		// 结果封装
		View view = ViewUtil.defaultView();

		TokenBody body = new TokenBody();
		body.setToken(tokenBo.getToken());
		body.setSalt(tokenBo.getSalt());

		view.setBody(body);

		return view;
	}

	@RequestMapping("/isUserExists")
	@ResponseBody
	public View isUserExists(@RequestParam(value = "username", required = false) String username) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USERNAME, username);

		// 业务调用
		boolean exists = authService.isUserExists(username);

		// 结果封装
		ExistsBody body = new ExistsBody();
		body.setExistsFlag(exists ? BoolEnum.TRUE.getCode() : BoolEnum.FALSE.getCode());

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}

	@RequestMapping("/signup")
	@ResponseBody
	public View signup(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USERNAME, username, ValidationUtil.PASSWORD, password);

		// 业务调用
		authService.signup(username, password);

		// 结果封装
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/signin")
	@ResponseBody
	public View signin(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "token", required = false) String token) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USERNAME, username, ValidationUtil.PASSWORD, password);

		// 业务调用
		TokenBo tokenBo = authService.signin(username, password, RequestContext.getUserIp());
		authService.deleteToken(token); // 登录成功后需要作废原来的token

		// 结果封装
		TokenBody body = new TokenBody();
		body.setToken(tokenBo.getToken());
		body.setSalt(tokenBo.getSalt());

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}

	@RequestMapping("/signout")
	@ResponseBody
	public View signout() {
		// 业务调用
		authService.signout(RequestContext.checkAndGetUser().getUserId());

		// 结果封装
		View view = ViewUtil.defaultView();

		return view;
	}

	@RequestMapping("/changePassword")
	@ResponseBody
	public View changePassword(@RequestParam(value = "password", required = false) String password,
					   @RequestParam(value = "newPassword", required = false) String newPassword) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.PASSWORD, password, ValidationUtil.PASSWORD, newPassword);

		// 业务调用
		authService.changePassword(RequestContext.checkAndGetUser().getUserId(), password, newPassword);

		// 结果封装
		View view = ViewUtil.defaultView();

		return view;
	}
}
