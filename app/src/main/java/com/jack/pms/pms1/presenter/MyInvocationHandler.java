package com.jack.pms.pms1.presenter;

import com.jack.pms.pms1.bean.Holder;
import com.jack.pms.pms1.callback.AbsCallback;
import com.jack.pms.pms1.container.ServiceImpContainer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        }

        // 开始执行接口实现类中的代码逻辑

        boolean hasCallback = method.getReturnType().isAssignableFrom(AbsCallback.class);

        Holder holder = HolderFactory.produce(proxy, method, args, hasCallback);

        return ServiceImpContainer.getInstance().invoke(holder);
    }
}
