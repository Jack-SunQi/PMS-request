package com.jack.pms.pms1.container;

import com.jack.pms.pms1.bean.Holder;
import com.jack.pms.pms1.callback.AbsCallback;
import com.jack.pms.pms1.imp.GuestServiceImp;
import com.jack.pms.pms1.imp.MinibarServiceImp;
import com.jack.pms.pms1.imp.RoomServiceImp;
import com.jack.pms.pms1.service.GuestService;
import com.jack.pms.pms1.service.MinibarService;
import com.jack.pms.pms1.service.RoomService;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ServiceImpContainer {

    private Map<Class<?>, Class<?>> serviceContainer = new HashMap<>();

    private static ServiceImpContainer mInstance;

    private ServiceImpContainer() {
        serviceContainer.put(GuestService.class, GuestServiceImp.class);
        serviceContainer.put(RoomService.class, RoomServiceImp.class);
        serviceContainer.put(MinibarService.class, MinibarServiceImp.class);
    }

    public static ServiceImpContainer getInstance() {
        if (mInstance == null)
            mInstance = new ServiceImpContainer();

        return mInstance;
    }

    public Object invoke(Holder holder) {
        Class<?> aClass = serviceContainer.get(holder.getMethod().getDeclaringClass());
        if (aClass == null)
            return null;

        try {
            Object instance = aClass.newInstance();

            if (holder.isHasCallback()) {
                AbsCallback callback = new AbsCallback(holder);
                CallbackContainer.put(holder, callback);
                holder.getMethod().invoke(instance, holder.getArgs());
                return callback;
            } else {
                return holder.getMethod().invoke(instance, holder.getArgs());
            }

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

}
