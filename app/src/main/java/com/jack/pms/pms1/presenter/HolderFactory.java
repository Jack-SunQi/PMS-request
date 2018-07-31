package com.jack.pms.pms1.presenter;

import com.jack.pms.pms1.bean.Holder;

import java.lang.reflect.Method;


public class HolderFactory {

    public static Holder produce(Object proxy, Method method, Object[] args, boolean hashCallback) {
        return new Holder(proxy, method, args, hashCallback);
    }

}
