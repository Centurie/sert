package com.uu.controller;

import com.jfinal.aop.Before;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.uu.model.User;
import com.uu.service.UserValidator;
import com.uu.service.dao.UserService;

public class UserController extends Controller{
    @Inject
    UserService service;
    public void index() {
        setAttr("UserPage", service.paginate(getParaToInt(0, 1), 10));
        render("User.html");
    }
//    配置一个class级别的拦截器，将拦截类中所有方法。 【validator|vali,deitə 验证器；验证程序】
//    Before 注解用来对拦截器进行配置  Clear 用于清除自身 所处层次以上层的拦截器。
    @Before(UserValidator.class)
    public void save() {
        User user = getModel(User.class);
    }

    @Before(UserValidator.class)
    public void update() {
        getBean(User.class).update();
        redirect("/User");
    }

    public void delete() {
        service.deleteById(getParaToInt());
        redirect("/User");
    }
}
