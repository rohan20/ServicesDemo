package com.rohantaneja.servicesdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by rohantaneja on 09/08/17.
 */

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();

        if (intent.getAction().equals("my_receiver")) {
            String message = bundle.getString("msg");
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

            //can start another activity here or do any UI operation which could not have been
            // performed inside the service class
        }

    }
}
