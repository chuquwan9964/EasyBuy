package com.hisoft.service.impl;

import com.hisoft.dao.CategoryDao;
import com.hisoft.dao.impl.CategoryDaoImpl;
import com.hisoft.entity.Category;
import com.hisoft.service.CategoryService;

import java.sql.Connection;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    private CategoryDao categoryDao = new CategoryDaoImpl(threadLocal);


    /*   实现了BaseService开始,具体注释请查看BaseService    */

    @Override
    public List<Category> queryAll() {
        return null;
    }

    @Override
    public Category queryOneByPrimaryKey(Integer integer) {
        return null;
    }

    @Override
    public Integer queryCount() {
        return null;
    }

    @Override
    public Integer insertOne(Category category) {
        return null;
    }

    @Override
    public Integer updateOne(Category category, Integer integer) {
        return null;
    }


    /*   实现了BaseService结束,具体注释请查看BaseService    */
}
