package com.sjhy.admin.controller;

import com.jfinal.core.Controller;

/**
 * Created by Mr.Wang on 2017/5/2.
 */
public class IndexController extends Controller {
    public void index(){
        render("index.vm");
    }
}
