package com.jack.pms.pms1.request;


import com.jack.pms.pms1.bean.Holder;
import com.jack.pms.pms1.callback.ICallback;
import com.jack.pms.pms1.container.CallbackContainer;
import com.jack.pms.pms1.request.strategy.IPmsRequest;

public class PmsX5Request implements IPmsRequest {

    @Override
    public void getGuestInfo(final Holder holder) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    ICallback<String, String> callback = CallbackContainer.get(holder).getCallback();
                    if (callback == null) {
                        return;
                    }

                    if (Math.random() > 0.3) {
                        callback.onSuccess("success");
                    } else {
                        callback.onFailure("failure");
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void getMinibarItemList(Holder holder) {

    }

    @Override
    public void recordMinibarItems(Holder holder) {

    }

    @Override
    public void getRoomAccountList(Holder holder) {

    }

    @Override
    public void getRoomList(final Holder holder) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    ICallback<String, String> callback = CallbackContainer.get(holder).getCallback();
                    if (callback == null) {
                        return;
                    }

                    if (Math.random() > 0.3) {
                        callback.onSuccess("success");
                    } else {
                        callback.onFailure("failure");
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
