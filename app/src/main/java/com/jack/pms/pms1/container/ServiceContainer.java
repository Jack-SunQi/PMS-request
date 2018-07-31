package com.jack.pms.pms1.container;

import com.jack.pms.pms1.presenter.MyInvocationHandler;
import com.jack.pms.pms1.service.BaseService;

import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class ServiceContainer {

    private Map<Class, BaseService> serviceMap = new LinkedHashMap<>();

    public synchronized <T> T getService(Class<T> clz) {
        if (!clz.isInterface())
            throw new IllegalArgumentException("must be a interface");

        Object service = serviceMap.get(clz);
        if (service == null) {
            service = Proxy.newProxyInstance(clz.getClassLoader(), new Class[]{clz}, new MyInvocationHandler());
            if (service instanceof BaseService)
                serviceMap.put(clz, (BaseService) service);
        }
        return (T) service;


    }

}
