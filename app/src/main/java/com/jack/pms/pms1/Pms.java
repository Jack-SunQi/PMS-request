package com.jack.pms.pms1;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import aiui.anzer.com.myapplication.pms1.container.ServiceContainer;

public class Pms {

    private static ServiceContainer serviceContainer = new ServiceContainer();


    public static int PMS_TYPE;

    public static final int PMS_TRANS = 0;

    public static final int PMS_XMS = 1;

    public static final int PMS_X5 = 2;

    public static final int PMS_X51 = 3;

    public static final int PMS_DEMO = 4;

    public static final int PMS_LUYUN = 6;

    public static final int PMS_LUYUN1 = 7;

    private static boolean isInitialized = false;

    @IntDef({PMS_TRANS, PMS_XMS, PMS_X5, PMS_X51, PMS_DEMO, PMS_LUYUN, PMS_LUYUN1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PmsType {
    }

    /**
     * init parameter, this function should be called first, otherwise the following calls can be wrong
     *
     * @param PMS_TYPE
     */
    public static void init(@PmsType int PMS_TYPE) {
        Pms.PMS_TYPE = PMS_TYPE;
        isInitialized = true;
    }

    public static <T> T getService(Class<T> clz) {
        if (!isInitialized)
            throw new RuntimeException("pms request should be initialized first");
        return serviceContainer.getService(clz);
    }

}
