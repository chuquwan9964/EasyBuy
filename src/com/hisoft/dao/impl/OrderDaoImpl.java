package com.hisoft.dao.impl;

import com.hisoft.dao.OrderDao;
import com.hisoft.entity.Order;

import java.sql.Connection;
import java.util.List;

public class OrderDaoImpl extends ConnectionHolder implements OrderDao {

    public OrderDaoImpl(ThreadLocal<Connection> threadLocal) {
        super(threadLocal);
    }

    /*    实现BaseDao的部分开始,注释请查看BaseDao    */


    @Override
    public List<Order> queryAll() {
        return null;
    }

    @Override
    public Order queryOneByPrimaryKey(Integer integer) {
        return null;
    }

    @Override
    public Integer queryCount() {
        return null;
    }

    @Override
    public Integer insertOne(Order order) {
        return null;
    }

    @Override
    public Integer updateOne(Order order, Integer integer) {
        return null;
    }

    /*    实现BaseDao的部分结束,注释请查看BaseDao    */
}
