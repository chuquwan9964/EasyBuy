package com.hisoft.dao.impl;

import com.hisoft.dao.ProductDao;
import com.hisoft.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl extends ConnectionHolder implements ProductDao {

    public ProductDaoImpl(ThreadLocal<Connection> threadLocal) {
        super(threadLocal);
    }


    /*    实现BaseDao的部分开始,注释请查看BaseDao    */


    @Override
    public List<Product> queryAll() throws SQLException {
        Connection connection = threadLocal.get();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from easybuy_product");
        ResultSet resultSet = preparedStatement.executeQuery();
        //做操作
        return null;
    }

    @Override
    public Product queryOneByPrimaryKey(Integer integer) {
        return null;
    }

    @Override
    public Integer queryCount() {
        return null;
    }

    @Override
    public Integer insertOne(Product product) {
        return null;
    }

    @Override
    public Integer updateOne(Product product, Integer integer) {
        return null;
    }


    /*    实现BaseDao的部分结束,注释请查看BaseDao    */
}
