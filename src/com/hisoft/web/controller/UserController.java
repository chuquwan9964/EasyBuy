package com.hisoft.web.controller;

import com.hisoft.service.UserService;
import com.hisoft.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理与用户相关的servlet
 */
@WebServlet("/user")
public class UserController extends HttpServlet {

    //service层的对象
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");


        switch (action) {
            case "login" : {
                login(req, resp);
            }
            case "register": {
                register(req, resp);
            }
            case "updatePassword": {
                updatePassword(req, resp);
            }
            case "logOut": {
                logOut(req, resp);
            }
            default: {
                //默认处理流程,上面的都不匹配,那就跳转至首页
                resp.sendRedirect(req.getContextPath());
            }
        }
    }

    /**
     * 与doGet使用同一逻辑,可以改写
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    /**
     * 登录具体方法,成功后跳转至首页,并将user加入到session
     * @param request
     * @param response
     */
    private void login(HttpServletRequest request,HttpServletResponse response) {

    }

    /**
     * 注册具体的方法,成功后跳转至登录页面
     * @param request
     * @param response
     */
    private void register(HttpServletRequest request,HttpServletResponse response) {

    }


    /**
     * 用于用户忘记密码,修改密码的方法,成功后跳转至登录页面让用户重新登录
     * @param request
     * @param response
     */
    private void updatePassword(HttpServletRequest request,HttpServletResponse response) {

    }


    /**
     * 用户退出登录的方法,主要就是从session中移出用户信息
     * @param request
     * @param response
     */
    private void logOut(HttpServletRequest request,HttpServletResponse response) {

    }
}
