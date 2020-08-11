package com.hisoft.web.controller;

import com.hisoft.service.CategoryService;
import com.hisoft.service.impl.CategoryServiceImpl;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Home的servlet,处理来自主页的请求
 */
@WebServlet("/Home")
public class HomeController extends HttpServlet {

    private CategoryService categoryService = new CategoryServiceImpl();

    private Logger logger = Logger.getLogger(HomeController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            resp.sendRedirect(req.getContextPath());
            return;
        }
        switch (action){
            //判断action属于什么
            case "index": {
                execIndex(req, resp);
            }
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    /**
     * 用户请求首页,查询category和news信息并且返回首页,在request域中存的数据如下:
     *
     * @param request
     * @param response
     */
    private void execIndex(HttpServletRequest request,HttpServletResponse response) {

    }
}
