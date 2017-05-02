package com.sjhy.controller;

import com.jfinal.core.Controller;

/**
 * Created by wjh on 2017/5/2 0002.
 */
public class TestController extends Controller {
    public void index(){
        System.out.println("尝试修改并提交一次！");
        render("index.vm");
    }
}
