package com.jack.pms.pms1.request.strategy;


import com.jack.pms.pms1.bean.Holder;

public interface IPmsRequest {

    void getGuestInfo(Holder holder);

    void getMinibarItemList(Holder holder);

    void recordMinibarItems(Holder holder);

    void getRoomAccountList(Holder holder);

    void getRoomList(Holder holder);
}
