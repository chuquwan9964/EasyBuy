package com.hisoft.dao;

import com.hisoft.entity.Category;
import com.hisoft.entity.User;

public interface UserDao extends BaseDao<User,Integer> {

    /**
     * 根据用户名和密码查询用户,常用来登录
     * @param username
     * @param password
     * @return
     */
    User queryUserByUserNameAndPassword(String username,String password);





}
