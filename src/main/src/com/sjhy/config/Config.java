package com.sjhy.config;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.sjhy.controller.TestController;

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
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {

    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
