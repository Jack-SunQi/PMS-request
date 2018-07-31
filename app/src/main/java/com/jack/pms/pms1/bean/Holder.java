package com.jack.pms.pms1.bean;

import java.lang.reflect.Method;

public class Holder {

    private Object proxy;
    private Method method;
    private Object[] args;
    private boolean hasCallback;

    public Holder(Object proxy, Method method, Object[] args, boolean hasCallback) {
        this.proxy = proxy;
        this.method = method;
        this.args = args;
        this.hasCallback = hasCallback;
    }

    public Object getProxy() {
        return proxy;
    }

    public Method getMethod() {
        return method;
    }

    public Object[] getArgs() {
        return args;
    }

    public boolean isHasCallback() {
        return hasCallback;
    }
}
