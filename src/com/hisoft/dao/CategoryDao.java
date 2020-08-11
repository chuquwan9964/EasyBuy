package com.hisoft.dao;

import com.hisoft.entity.Category;

import java.util.List;

public interface CategoryDao extends BaseDao<Category,Integer>{

    /**
     * 查询父category的id为id的子category集合(首页分层展示category时)
     * @param id
     * @return
     */
    default List<Category> queryCategoriesByParentId(Integer id) {
        return null;
    }


    /**
     * 查询所有等级为1的category
     * @return
     */
    default List<Category> queryLevel_1_Categories() {
        return null;
    }


}
