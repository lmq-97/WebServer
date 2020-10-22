package com.lmq.webserver.bean;


import com.qj.webservice.BaseWebService;

import java.util.HashMap;
import java.util.Map;
import io.reactivex.functions.Function;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by HyFun on 2020/10/21.
 * Email: 775183940@qq.com
 * Description:
 */
public class TestWs extends BaseWebService {
    private String byProvinceName;

    public String getByProvinceName() {
        return byProvinceName;
    }

    public void setByProvinceName(String byProvinceName) {
        this.byProvinceName = byProvinceName;
    }

    @Override
    public Map<String, String> setParamMap() {
        Map<String, String> map = new HashMap<>();
        map.put("byProvinceName", byProvinceName); // 查询参数
        return map;
    }

    @Override
    public String setMethod() {
        return "GetProInv"; // 查询方法
    }
}
