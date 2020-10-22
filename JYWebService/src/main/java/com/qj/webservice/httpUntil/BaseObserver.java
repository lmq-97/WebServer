package com.qj.webservice.httpUntil;

import com.sdr.lib.mvp.AbstractView;
import com.sdr.lib.rx.ServerException;
import com.sdr.lib.rx.observer.ExceptionSolver;
import com.sdr.lib.rx.observer.ExceptionTransformer;
import com.sdr.lib.rx.observer.RxObserver;

import java.util.List;

/**
 * @param <T>
 * @author quchao
 * @date 2017/11/27
 */

public abstract class BaseObserver<T> extends RxObserver<T, AbstractView> {

    public BaseObserver() {
    }

    public BaseObserver(AbstractView mView) {
        super(mView);
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (e instanceof NullPointerException) {
        } else {
            super.onError(e);
        }
    }

    @Override
    public void onExceptionSolve(List<ExceptionTransformer> transformerList) {
        super.onExceptionSolve(transformerList);
        transformerList.add(new ExceptionTransformer(ServerException.class, new ExceptionSolver() {
            @Override
            public void solve(AbstractView abstractView, Throwable throwable) {
                ServerException serverException = handleSpecialEx((ServerException) throwable);
                abstractView.showErrorMsg(serverException.getCode() + "", serverException.getMessage());
            }
        }));
    }


    private ServerException handleSpecialEx(ServerException e) {
        ServerException newEx = null;
        String code = e.getCode();
        if (!"0".equals(code)) {
            newEx = new ServerException(e.getMessage(), code);
        }
        return newEx;
    }


}
