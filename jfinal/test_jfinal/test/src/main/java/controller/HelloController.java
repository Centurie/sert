package controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {
    //为一个action最小的请求单位
    public void index(HelloController hel) {
        renderText("hello world!");
        //获取域名为title参数值  getParaToInt转为int型  getPara(0)返回url请求中的urlPara参数的第一个值
        hel.getPara("title");
        // getModel 用来接收页面表单域传递过来的model对象  getBean 方法用于支持传统的 Java Bean
        //hel.getModel()
    }
    //提供了actionKey注解  url将由/hello/form/12-34变为/hehe/12-34（数字为参数，默认由-分隔）
    @ActionKey("/hehe")
    public void  form(){
        //渲染
        render("form.jsp");
        renderText("hello 弟弟!");
    }
}