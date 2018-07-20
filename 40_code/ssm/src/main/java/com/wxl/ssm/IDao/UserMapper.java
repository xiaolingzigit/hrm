package com.wxl.ssm.IDao;

import java.util.List;

import com.wxl.ssm.domain.User;

public interface UserMapper {
	//用户登录
	User selectByNameAndPass(String loginname,String password);
	//查询用户总数
	int selectCount();
	//分页查询
	List<User> selectByPage(int firstLimitParam,int pageSize);
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	
}