package com.jack.pms.pms1.presenter;


import com.jack.pms.pms1.Pms;
import com.jack.pms.pms1.bean.Holder;
import com.jack.pms.pms1.callback.AbsCallback;
import com.jack.pms.pms1.request.PmsDemoRequest;
import com.jack.pms.pms1.request.PmsLuYunRequest;
import com.jack.pms.pms1.request.PmsTransRequest;
import com.jack.pms.pms1.request.PmsX5Request;
import com.jack.pms.pms1.request.PmsXmsRequest;
import com.jack.pms.pms1.request.strategy.IPmsRequest;

public class ServicePresenter extends AbsCallback {

    protected ServicePresenter() {
    }

    public ServicePresenter(Holder holder) {
        super(holder);
    }

    protected IPmsRequest getPmsRequest() {
        switch (Pms.PMS_TYPE) {
            case Pms.PMS_TRANS:
                return new PmsTransRequest();
            case Pms.PMS_DEMO:
                return new PmsDemoRequest();
            case Pms.PMS_XMS:
                return new PmsXmsRequest();
            case Pms.PMS_X5:
            case Pms.PMS_X51:
                return new PmsX5Request();
            case Pms.PMS_LUYUN:
            case Pms.PMS_LUYUN1:
                return new PmsLuYunRequest();
        }

        return null;
    }
}
