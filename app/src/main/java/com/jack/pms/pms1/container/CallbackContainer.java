package com.jack.pms.pms1.container;

import com.jack.pms.pms1.bean.Holder;
import com.jack.pms.pms1.callback.AbsCallback;

import java.util.HashMap;
import java.util.Map;

public class CallbackContainer {

    private static Map<Holder, AbsCallback> callbackMap = new HashMap<>();

    public static void put(Holder holder, AbsCallback callback) {
        callbackMap.put(holder, callback);
    }


    public static AbsCallback get(Holder holder) {
        return callbackMap.get(holder);
    }

}
