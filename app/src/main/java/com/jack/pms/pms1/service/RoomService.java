package com.jack.pms.pms1.service;


import com.jack.pms.pms1.callback.AbsCallback;

public interface RoomService extends BaseService {

    AbsCallback getRoomAccountList();

    AbsCallback getRoomList();

}
