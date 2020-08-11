package com.hisoft.service.impl;

import com.hisoft.dao.OrderDao;
import com.hisoft.dao.impl.OrderDaoImpl;
import com.hisoft.entity.Order;
import com.hisoft.service.OrderService;

import java.sql.Connection;
import java.util.List;


public class OrderServiceImpl implements OrderService {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    private OrderDao orderDao = new OrderDaoImpl(threadLocal);


    /*   实现了BaseService开始,具体注释请查看BaseService    */

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


    /*   实现了BaseService结束,具体注释请查看BaseService    */
}
