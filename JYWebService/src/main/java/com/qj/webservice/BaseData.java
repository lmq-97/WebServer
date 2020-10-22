package com.qj.webservice;

/**
 * Created by HyFun on 2018/11/22.
 * Email: 775183940@qq.com
 * Description: 获取三堡数据的base data
 */

public class BaseData<D> {
    public static final int SUCCESS = 0;


    private int code;
    private String msg;
    private D data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }
}
