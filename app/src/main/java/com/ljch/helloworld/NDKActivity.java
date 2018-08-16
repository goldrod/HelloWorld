package com.ljch.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;


public class NDKActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndk);
        TextView  tv_ndk = findViewById(R.id.tv_ndk);
        tv_ndk.setText(NDK.getStringFromNative());
    }
}
