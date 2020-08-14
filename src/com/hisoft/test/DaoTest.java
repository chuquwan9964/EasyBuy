package com.hisoft.test;

import com.hisoft.dao.impl.CategoryDaoImpl;
import com.hisoft.dao.impl.NewsDaoImpl;
import com.hisoft.dao.impl.UserDaoImpl;
import com.hisoft.entity.Category;
import com.hisoft.entity.Product;
import com.hisoft.service.ProductService;
import com.hisoft.service.impl.CategoryServiceImpl;
import com.hisoft.service.impl.NewsServiceImpl;
import com.hisoft.service.impl.ProductServiceImpl;
import com.hisoft.util.JdbcConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class DaoTest {

    public static void main(String[] args) throws SQLException {
        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> products = productService.queryProductsByKeyWord("香水");
        System.out.println(products);
    }
}
