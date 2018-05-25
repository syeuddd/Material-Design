package com.example.xyzreader.ui;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by ehteshs1 on 2018/05/25.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
