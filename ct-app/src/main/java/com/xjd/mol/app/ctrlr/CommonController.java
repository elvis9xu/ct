package com.xjd.mol.app.ctrlr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.mol.app.view.View;

@Controller
@RequestMapping("/common")
public class CommonController {

	@RequestMapping("/syncTips")
	@ResponseBody
	public View syncTips(@RequestParam(value = "tipsKey", required = false) String tipsKey) {

		return null;
	}

}
