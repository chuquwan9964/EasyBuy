package com.hisoft.dao.impl;

import com.hisoft.dao.CategoryDao;
import com.hisoft.entity.Category;

import java.sql.Connection;
import java.util.List;

public class CategoryDaoImpl extends ConnectionHolder implements CategoryDao {


    public CategoryDaoImpl(ThreadLocal<Connection> threadLocal) {
        super(threadLocal);
    }

    /*    实现BaseDao的部分开始,注释请查看BaseDao    */

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



    /*    实现BaseDao的部分结束,注释请查看BaseDao    */






    @Override
    public List<Category> queryCategoriesByParentId(Integer id) {
        return null;
    }
}
