package com.sjhy.config;

import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.PostgreSqlDialect;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.sjhy.admin.controller.IndexController;
import com.sjhy.controller.TestController;
import com.sjhy.model.User;

/**
 * Created by Administrator on 2017/5/2 0002.
 */
public class Config extends JFinalConfig {
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        constants.setViewType(ViewType.VELOCITY);

    }

    public void configRoute(Routes routes) {
        routes.setBaseViewPath("WEB-INF/vm");
        routes.add("/", TestController.class);

        //后台管理路由配置
        routes.add("/admin", IndexController.class);
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {
        DruidPlugin dp = new DruidPlugin("jdbc:postgresql://118.89.64.11:5432/navigation?currentSchema=public,admin", "postgres", "123456", "org.postgresql.Driver");
        plugins.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        //设置方言
        arp.setDialect(new PostgreSqlDialect());
        plugins.add(arp);

        //添加数据库映射
        arp.addMapping("users", User.class);
    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
