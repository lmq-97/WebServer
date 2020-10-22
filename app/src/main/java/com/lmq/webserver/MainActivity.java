package com.lmq.webserver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.lmq.webserver.bean.TestWs;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestWs ws = new TestWs();
        ws.getRequest()
                // 处理相应的实体转换
                .map(new Function<String, Object>() {
                    @Override
                    public Object apply(String s) throws Exception {
                        return new Object();
                    }
                }).subscribe(new Observer<Object>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("进入方法onSubscribe");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("进入方法onNext" + o);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("进入方法onError" + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("进入方法onComplete");
            }
        });


    }

}