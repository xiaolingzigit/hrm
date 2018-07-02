package com.wxl.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wxl.ssm.domain.User;
import com.wxl.ssm.service.UserService;
import com.wxl.ssm.util.HrmConstants;

@Controller
public class UserController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value ="/login")
	public ModelAndView login(@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,
			HttpSession session,ModelAndView mv){
		User user = userService.login(loginname, password);
		if(user != null){
			session.setAttribute(HrmConstants.USER_SESSION, user);
			mv.setViewName("redirect:/main");
		}else {
			mv.addObject("message","登录名或密码错误！请重新输入");
			mv.setViewName("redirect:/loginForm");
		}
		
		return mv;
		
	}

}
