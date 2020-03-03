package config;

import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import controller.HelloController;
import model.Blog;

//用于对整个 web
//项目进行配置。
public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        loadPropertyFile("");//加载少量必要配置(config.properties)，随后可用getproperty()
        constants.setDevMode(true);
        //设置默认视图类型jsp.持 JSP、FreeMarker、Velocity 三种常用视图
        constants.setViewType(ViewType.JSP);
        //constants.setBaseViewPath();设置视图启动路径
    }

    @Override
    public void configRoute(Routes routes) {
        //将/hello映射到控制器  url组成：controllerKey/method/参数 仅controllerKey为YourController.index()
        //http://localhost/hello 将访问 HelloController.index() 方法，
        //http://localhost/hello/methodName 访问HelloController.methodName()方法。
        //类中有两个方法(add重载)：一参contrOller定位Controller,
        // 二参controllerClass是该controllerKey所对应到的 Controller
        // 三参viewpath指Controller返回视图相对路径,默认值controllerKey。
        routes.add("/hello", HelloController.class);
    }

    @Override
    public void configPlugin(Plugins plugins) {
       /* //配置了 C3p0 数据库连接池插件与 ActiveRecord数据库访问插件
        //应用中使用 ActiveRecord 非常方便地操作数据库
        loadPropertyFile("your_app_config.txt");
        plugins.add(arp);*/
        C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password"));
        plugins.add(c3p0Plugin);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
        arp.addMapping("jfinal", Blog.class);//映射blog表到Blog.class模型
    }
    //拦截器
    @Override
    public void configInterceptor(Interceptors interceptors) {
        //web.xml已配置
    }
    //JFinal入口是JFinalFilter，下一步是Handler接管Web请求，掌控整个应用实现更高层次的功能扩展
    //是AOP+责任链模式的一个变种
    //链条末端就是ActionHandler处理动作请求跳转和拦截器全局生效、对所有请求拦截
    // （包括静态资源等）、对比Interceptor（只拦截Action请求或者Inject拦截器）
    @Override
    public void configHandler(Handlers handlers) {

    }
}
