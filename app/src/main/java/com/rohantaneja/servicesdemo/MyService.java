package com.rohantaneja.servicesdemo;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by rohantaneja on 09/08/17.
 */

public class MyService extends IntentService {

    public static boolean isServiceRunning = false;

    public MyService() {
        super("MyService");

    }

    public MyService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //runs in background
    }
}
