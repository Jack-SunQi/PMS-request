package com.jack.pms.pms1.imp;


import com.jack.pms.pms1.callback.AbsCallback;
import com.jack.pms.pms1.presenter.ServicePresenter;
import com.jack.pms.pms1.request.strategy.PmsRequestManager;
import com.jack.pms.pms1.service.RoomService;

public class RoomServiceImp extends ServicePresenter implements RoomService {


    @Override
    public AbsCallback getRoomAccountList() {
        PmsRequestManager requestManager = new PmsRequestManager();
        requestManager.setPmsRequest(getPmsRequest());
        requestManager.getRoomAccountList(getHolder());
        return null;
    }

    @Override
    public AbsCallback getRoomList() {
        PmsRequestManager requestManager = new PmsRequestManager();
        requestManager.setPmsRequest(getPmsRequest());
        requestManager.getRoomList(getHolder());
        return null;
    }
}
