package com.hisoft.dao.impl;

import com.hisoft.dao.UserDao;
import com.hisoft.entity.User;

import java.sql.Connection;
import java.util.List;

public class UserDaoImpl extends ConnectionHolder implements UserDao {

    public UserDaoImpl(ThreadLocal<Connection> threadLocal) {
        super(threadLocal);
    }

    /*    实现BaseDao的部分开始,注释请查看BaseDao    */

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


    /*    实现BaseDao的部分结束,注释请查看BaseDao    */




    @Override
    public User queryUserByUserNameAndPassword(String username, String password) {
        return null;
    }

}
