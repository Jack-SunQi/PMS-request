package com.jack.pms.pms1.service;


import com.jack.pms.pms1.callback.AbsCallback;

public interface MinibarService extends BaseService{

    AbsCallback getMinibarItemList();
    AbsCallback recordMinibarItems();

}
