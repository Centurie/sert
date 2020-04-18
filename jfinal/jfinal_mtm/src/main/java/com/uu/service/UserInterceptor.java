package com.uu.service;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

//拦截器
public class UserInterceptor implements Interceptor {
    public void intercept(Invocation inv) {
//  目标方法调用前向控制台输出文本
        System.out.println("Before invoking " + inv.getActionKey());
        inv.invoke();
//  目标方法调用后向控制台输出文本
        System.out.println("After invoking " + inv.getActionKey());
    }
}