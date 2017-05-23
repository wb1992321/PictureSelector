package cn.wang.demo;

import android.app.Application;

import cn.wang.img.selector.Selector;

/**
 * author : wangshuai Created on 2017/5/23
 * email : wangs1992321@gmail.com
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Selector.init(this);
    }
}
