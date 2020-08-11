package com.hisoft.service.impl;

import com.hisoft.dao.UserDao;
import com.hisoft.dao.impl.UserDaoImpl;
import com.hisoft.entity.User;
import com.hisoft.service.UserService;

import java.sql.Connection;
import java.util.List;

public class UserServiceImpl implements UserService {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    private UserDao userDao = new UserDaoImpl(threadLocal);

    /*   实现了BaseService开始,具体注释请查看BaseService    */

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryOneByPrimaryKey(Integer integer) {
        return null;
    }

    @Override
    public Integer queryCount() {
        return null;
    }

    @Override
    public Integer insertOne(User user) {
        return null;
    }

    @Override
    public Integer updateOne(User user, Integer integer) {
        return null;
    }


    /*   实现了BaseService结束,具体注释请查看BaseService    */
}
