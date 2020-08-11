package com.hisoft.dao;

import com.hisoft.entity.Category;

import java.util.List;

public interface CategoryDao extends BaseDao<Category,Integer>{

    /**
     * 查询父category的id为id的子category集合(首页分层展示category时)
     * @param id
     * @return
     */
    List<Category> queryCategoriesByParentId(Integer id);




}
