package com.jack.pms.pms1.imp;

import com.jack.pms.pms1.callback.AbsCallback;
import com.jack.pms.pms1.presenter.ServicePresenter;
import com.jack.pms.pms1.request.strategy.PmsRequestManager;
import com.jack.pms.pms1.service.GuestService;

public class GuestServiceImp extends ServicePresenter implements GuestService {


    @Override
    public AbsCallback getGuestInfo() {

        PmsRequestManager requestManager = new PmsRequestManager();
        requestManager.setPmsRequest(getPmsRequest());
        requestManager.getGuestInfo(getHolder());

        return null;
    }
}
