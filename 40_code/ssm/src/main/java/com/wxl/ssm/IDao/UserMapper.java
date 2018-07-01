package com.wxl.ssm.IDao;

import com.wxl.ssm.domain.User;

public interface UserMapper {
	//用户登录
	User selectByNameAndPass(String loginname,String password);
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}