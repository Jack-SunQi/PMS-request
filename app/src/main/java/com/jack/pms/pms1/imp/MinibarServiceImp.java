package com.jack.pms.pms1.imp;

import com.jack.pms.pms1.callback.AbsCallback;
import com.jack.pms.pms1.presenter.ServicePresenter;
import com.jack.pms.pms1.request.strategy.PmsRequestManager;
import com.jack.pms.pms1.service.MinibarService;

public class MinibarServiceImp extends ServicePresenter implements MinibarService {


    @Override
    public AbsCallback getMinibarItemList() {
        PmsRequestManager requestManager = new PmsRequestManager();
        requestManager.setPmsRequest(getPmsRequest());
        requestManager.getMinibarItemList(getHolder());
        return null;
    }

    @Override
    public AbsCallback recordMinibarItems() {
        PmsRequestManager requestManager = new PmsRequestManager();
        requestManager.setPmsRequest(getPmsRequest());
        requestManager.recordMinibarItems(getHolder());
        return null;
    }
}
