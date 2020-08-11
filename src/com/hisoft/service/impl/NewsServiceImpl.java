package com.hisoft.service.impl;

import com.hisoft.dao.NewsDao;
import com.hisoft.dao.impl.NewsDaoImpl;
import com.hisoft.entity.News;
import com.hisoft.service.NewsService;

import java.sql.Connection;
import java.util.List;

public class NewsServiceImpl implements NewsService {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    private NewsDao newsDao = new NewsDaoImpl(threadLocal);

    /*   实现了BaseService开始,具体注释请查看BaseService    */


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


    /*   实现了BaseService结束,具体注释请查看BaseService    */
}
