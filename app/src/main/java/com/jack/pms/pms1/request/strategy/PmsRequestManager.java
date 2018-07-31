package com.jack.pms.pms1.request.strategy;

import android.support.annotation.NonNull;

import com.jack.pms.pms1.bean.Holder;


public class PmsRequestManager {

    private IPmsRequest pmsRequest;

    public void setPmsRequest(@NonNull IPmsRequest pmsRequest) {
        this.pmsRequest = pmsRequest;
    }

    public void getGuestInfo(Holder holder) {
        pmsRequest.getGuestInfo(holder);
    }

    public void getMinibarItemList(Holder holder) {
        pmsRequest.getMinibarItemList(holder);
    }

    public void recordMinibarItems(Holder holder) {
        pmsRequest.recordMinibarItems(holder);
    }

    public void getRoomAccountList(Holder holder) {
        pmsRequest.getRoomAccountList(holder);
    }

    public void getRoomList(Holder holder) {
        pmsRequest.getRoomList(holder);
    }
}
