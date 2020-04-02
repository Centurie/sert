package com.uu.service;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;
import com.uu.common.base.User;
//验证
public class UserValidator extends Validator {
    protected void validate(Controller controller) {
        validateRequiredString("blog.title", "titleMsg", "请输入Blog标题!");
        validateRequiredString("blog.content", "contentMsg", "请输入Blog内容!");
    }

    protected void handleError(Controller controller) {
        controller.keepModel(User.class);

        String actionKey = getActionKey();
        if (actionKey.equals("/blog/save"))
            controller.render("add.html");
        else if (actionKey.equals("/blog/update"))
            controller.render("edit.html");
    }
}
