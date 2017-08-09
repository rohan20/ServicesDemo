package com.rohantaneja.servicesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!MyService.isServiceRunning) {
            MyService.isServiceRunning = true;

            i = new Intent(MainActivity.this, MyService.class);
            startService(i);

            Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        }
    }

    public void stopServiceButtonClicked(View view) {

        if (MyService.isServiceRunning) {
            MyService.isServiceRunning = false;
            stopService(i);

            Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
        }
    }
}
