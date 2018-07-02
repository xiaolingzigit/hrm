package com.wxl.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxl.ssm.IDao.UserMapper;
import com.wxl.ssm.domain.User;
import com.wxl.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	/**
	 * 用户登录
	 */
	public User login(String loginname, String password) {
		
		return userMapper.selectByNameAndPass(loginname, password);
	}

}
