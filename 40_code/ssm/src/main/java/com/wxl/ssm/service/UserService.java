package com.wxl.ssm.service;

import com.wxl.ssm.domain.User;

public interface UserService {
	/*
	 * 用户登录
	 */
	User login(String loginname,String password);
}
