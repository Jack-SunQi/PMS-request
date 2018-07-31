package com.jack.pms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jack.pms.pms1.Pms;
import com.jack.pms.pms1.callback.ICallback;
import com.jack.pms.pms1.service.GuestService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_request).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pms.getService(GuestService.class).getGuestInfo().setCallback(new ICallback<String, String>() {
                    @Override
                    public void onSuccess(String result) {

                    }

                    @Override
                    public void onFailure(String error) {

                    }
                });
            }
        });
    }
}
