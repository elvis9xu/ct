package com.xjd.ct.app.ctrlr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.view.View;

@Controller
@RequestMapping("/10")
public class CommonController10 {

	@RequestMapping("/syncTips")
	@ResponseBody
	public View syncTips(@RequestParam(value = "tipsKey", required = false) String tipsKey) {

		return null;
	}

}
