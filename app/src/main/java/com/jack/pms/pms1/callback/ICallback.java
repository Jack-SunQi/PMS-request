package com.jack.pms.pms1.callback;

public interface ICallback<T, R> {

    void onSuccess(T result);

    void onFailure(R error);

}
