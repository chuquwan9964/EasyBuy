package com.hisoft.web.controller;

import com.alibaba.druid.sql.visitor.functions.Lcase;
import com.hisoft.service.ProductService;
import com.hisoft.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 与产品操作相关的servlet
 */
@WebServlet("/Product")
public class ProductController extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "queryProductList": {
                execQueryProductList(req, resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    /**
     * 根据category的id查询productList(点击主页上的超链接到此方法),此方法成功后应该
     * 请求转发到    http://localhost:8080/EasyBuy_war_exploded/pre/product/queryProductList.jsp
     * 并且在request域中添加total属性(Integer类型productList的size)和productList属性(List类型,是List<Product>)
     * @param request
     * @param response
     */
    private void execQueryProductList(HttpServletRequest request,HttpServletResponse response) {

    }
}
