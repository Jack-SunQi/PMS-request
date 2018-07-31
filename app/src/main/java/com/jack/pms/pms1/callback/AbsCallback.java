package com.jack.pms.pms1.callback;


import com.jack.pms.pms1.bean.Holder;

public class AbsCallback {

    private ICallback callback;

    private static ThreadLocal<Holder> threadLocal = new ThreadLocal<>();

    protected AbsCallback() {
    }

    protected static Holder getHolder() {
        return threadLocal.get();
    }

    public AbsCallback(Holder holder) {
        threadLocal.set(holder);
    }

    public <R, E> void setCallback(ICallback<R, E> callback) {
        this.callback = callback;
    }

    public <R, E> ICallback<R, E> getCallback() {
        return callback;
    }
}
