package com.hisoft.service.impl;

import com.hisoft.dao.ProductDao;
import com.hisoft.dao.impl.ProductDaoImpl;
import com.hisoft.entity.Product;
import com.hisoft.service.ProductService;
import com.hisoft.util.JdbcConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    private ProductDao productDao = new ProductDaoImpl(threadLocal);

    /*   实现了BaseService开始,具体注释请查看BaseService    */


    @Override
    public List<Product> queryAll() throws SQLException {
        threadLocal.set(JdbcConnectionUtil.getConnection());
        List<Product> all = productDao.queryAll();
        JdbcConnectionUtil.close(threadLocal.get());
        threadLocal.remove();
        return all;
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

    /*   实现了BaseService结束,具体注释请查看BaseService    */
}
