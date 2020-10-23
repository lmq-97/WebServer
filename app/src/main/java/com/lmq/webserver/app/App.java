package com.lmq.webserver.app;

import android.app.Application;

import com.qj.webservice.WebServiceConfigManager;

/**
 * Created by HyFun on 2020/10/21.
 * Email: 775183940@qq.com
 * Description:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        http://123.206.231.121:1897/yltest1027/service1.asmx
        new WebServiceConfigManager.Builder()
                .setBASE_URL("http://123.206.231.121:1897/yltest1027/") // 请求地址
//                .setBASE_URL("/yltest1027/") // 请求地址
                .setNAME_SPACE("http://tempuri.org/") // 命名空间
                .setHEAD_PAGE("service1.asmx") // 页面
                .build();


    }
}
