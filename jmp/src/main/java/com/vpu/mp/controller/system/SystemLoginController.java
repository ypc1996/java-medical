package com.vpu.mp.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vpu.mp.service.foundation.JsonResult;
import com.vpu.mp.service.foundation.JsonResultCode;


/**
 * 
 * @author 新国
 *
 */
@Controller
public class SystemLoginController extends SystemBaseController {

	@GetMapping(value = "/system/login")
	public ModelAndView login() {
		return view("system/login");
	}

	@PostMapping(value = "/system/login")
	public ModelAndView login(@RequestParam(value = "username") String userName,
			@RequestParam(value = "password") String password) {
		if (sysAuth.login(userName, password)) {
			return view("redirect:/system/index");
		} else {
			return showMessage("登录失败");
		}
	}

	@RequestMapping(value = "/system/logout")
	public String logout() {
		sysAuth.logout();
		return "redirect:/system/login";
	}

	@RequestMapping(value = "/system/login/attempt")
	@ResponseBody
	public JsonResult attempt(@RequestParam(value = "username") String userName,
			@RequestParam(value = "password") String password) {
		if (sysAuth.attempt(userName, password)) {
			return success();
		} else {
			return fail(JsonResultCode.CODE_ACCOUNT_OR_PWD_ERROR);
		}
	}
}
