package com.hisoft.dao;

import com.hisoft.entity.Category;
import com.hisoft.entity.News;

import java.util.List;

public interface NewsDao extends BaseDao<News,Integer> {

    /**
     * 查找最近的新闻
     * @return
     * @param n:    查找几条
     */
    List<News> queryNewsByDateByOrder(Integer n);


}
