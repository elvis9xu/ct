package com.xjd.ct.app.ctrlr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.UserBody;
import com.xjd.ct.app.view.body.UserListBody;
import com.xjd.ct.app.view.vo.UserBabyVo;
import com.xjd.ct.app.view.vo.UserBindAccountVo;
import com.xjd.ct.app.view.vo.UserVo;
import com.xjd.ct.biz.bo.UserBabyBo;
import com.xjd.ct.biz.bo.UserBindAccountBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.biz.service.UserService;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.IdolOperEnum;
import com.xjd.ct.utl.enums.UserSexEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.utl.valid.ValidationUtil;

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
		UserVo userVo = transferUserBoToUserVo(userBo);

		UserBody body = new UserBody();
		body.setUserInfo(userVo);

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}

	@RequestMapping("/getUserInfoOfOthers")
	@ResponseBody
	public View getUserInfoOfOthers(@RequestParam(value = "userId", required = false) String userId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USER_ID, userId);

		Long userIdL = Long.valueOf(userId);

		// 业务调用
		UserBo userBo = userService.queryUserByUserId(userIdL);

		if (userBo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		// 结果封装
		UserVo userVo = transferUserBoToUserVo(userBo);
		// TODO 去除敏感信息

		UserBody body = new UserBody();
		body.setUserInfo(userVo);

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}


	@RequestMapping("/setUserInfo")
	@ResponseBody
	public View setUserInfo(@RequestParam(value = "headImgRes", required = false) String headImgRes,
							@RequestParam(value = "nickname", required = false) String nickname,
							@RequestParam(value = "sex", required = false) String sex,
							@RequestParam(value = "moodWords", required = false) String moodWords,
							@RequestParam(value = "babyBirth", required = false) String babyBirth,
							@RequestParam(value = "babySex", required = false) String babySex) {

		// 参数校验
		Byte sexB = UserSexEnum.FEMALE.getCode();
		if (StringUtils.isNotEmpty(sex)) {
			ValidationUtil.check(ValidationUtil.SEX, sex);
			sexB = Byte.valueOf(sex);
		}
		Byte babySexB = UserSexEnum.FEMALE.getCode();
		if (StringUtils.isNotEmpty(babySex)) {
			ValidationUtil.check(ValidationUtil.SEX, babySex);
			babySexB = Byte.valueOf(babySex);
		}
		Date babyBirthDate = null;
		if (StringUtils.isNotEmpty(babyBirth)) {
			ValidationUtil.check(ValidationUtil.BABY_BIRTH, babyBirth);
			babyBirthDate = DateUtil.parse(babyBirth, DateUtil.PATTERN_YEAR2DAY);
		}

		userService.setUserInfo(RequestContext.checkAndGetUser().getUserId(), headImgRes, nickname, sexB, moodWords,
				babyBirthDate, babySexB);

		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/idolatrizeUser")
	@ResponseBody
	public View idolatrizeUser(@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "idolOper", required = false) String idolOper) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USER_ID, userId, ValidationUtil.IDOL_OPER, idolOper);

		Long userIdL = Long.valueOf(userId);
		IdolOperEnum idolOperEnum = IdolOperEnum.valueOfCode(Byte.parseByte(idolOper));

		// 业务调用
		if (idolOperEnum == IdolOperEnum.ADD) {
			userService.addIdol(RequestContext.checkAndGetUser().getUserId(), userIdL);
		} else {
			userService.cancelIdol(RequestContext.checkAndGetUser().getUserId(), userIdL);
		}

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/listMyIdols")
	@ResponseBody
	public View listMyIdols() {
		// 业务调用
		List<UserBo> userBoList = userService.listIdolsByUserId(RequestContext.checkAndGetUser().getUserId());

		// 返回结果
		List<UserVo> userVoList = new ArrayList<UserVo>(userBoList.size());
		for (UserBo userBo : userBoList) {
			UserVo userVo = transferUserBoToUserVo(userBo);
			// TODO 去除敏感信息
			userVoList.add(userVo);
		}

		UserListBody body = new UserListBody();
		body.setUserInfoList(userVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	/**
	 * BO -> VO
	 * 
	 * @param userBo
	 * @return
	 */
	protected UserVo transferUserBoToUserVo(UserBo userBo) {
		if (userBo == null) {
			return null;
		}
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

		return userVo;
	}

	protected void removePrivateData(UserVo userVo) {

	}
}
