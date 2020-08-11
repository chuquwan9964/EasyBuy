package com.hisoft.dao.impl;

import com.hisoft.dao.NewsDao;
import com.hisoft.entity.News;

import java.sql.Connection;
import java.util.List;

public class NewsDaoImpl extends ConnectionHolder implements NewsDao {


    public NewsDaoImpl(ThreadLocal<Connection> threadLocal) {
        super(threadLocal);
    }

    /*    实现BaseDao的部分开始,注释请查看BaseDao    */


    @Override
    public List<News> queryAll() {
        return null;
    }

    @Override
    public News queryOneByPrimaryKey(Integer integer) {
        return null;
    }

    @Override
    public Integer queryCount() {
        return null;
    }

    @Override
    public Integer insertOne(News news) {
        return null;
    }

    @Override
    public Integer updateOne(News news, Integer integer) {
        return null;
    }


    /*    实现BaseDao的部分结束    注释请查看BaseDao    */





    /*   实现NewsDao的部分----开始----,注释请查看NewsDao    */

    @Override
    public List<News> queryNewsByDateByOrder(Integer n) {
        return null;
    }
}
