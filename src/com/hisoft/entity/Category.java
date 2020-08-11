package com.hisoft.entity;

public class Category {

    //分类id
    private Integer c_id;
    //分类名
    private String c_name;
    //分类的父id
    private Integer c_parentId;
    //分类的类型,1:一级分类,2:二级分类,3:三级分类
    private Integer c_type;


    @Override
    public String toString() {
        return "Category{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_parentId=" + c_parentId +
                ", c_type=" + c_type +
                '}';
    }

    public Category(Integer c_id, String c_name, Integer c_parentId, Integer c_type) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_parentId = c_parentId;
        this.c_type = c_type;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Integer getC_parentId() {
        return c_parentId;
    }

    public void setC_parentId(Integer c_parentId) {
        this.c_parentId = c_parentId;
    }

    public Integer getC_type() {
        return c_type;
    }

    public void setC_type(Integer c_type) {
        this.c_type = c_type;
    }
}
