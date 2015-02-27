package com.example.minnmake.buttonTest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.wearable.internal.v;

public class ButtonMainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_layout);
        final LinearLayout layout = (LinearLayout) findViewById(R.id.root_layout);
        final Button bn1 = (Button) findViewById(R.id.btnaddnewtext1);
        final Button bn2 = (Button) findViewById(R.id.btnaddnewtext2);

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Code for Activities what will appears when user click button

                TextView tv1 = new TextView(v.getContext());
                tv1.setText("...");
                layout.addView(tv1);

            }

        });

        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Code for Activities what will appears when user click button
                //Bn2 Have to show Battery Level in Tv2(TextArea) or in Notification
                //TODO:call Method batteryLevel

                TextView tv2 = new TextView(v.getContext());
                tv2.setText("...");
                layout.addView(tv2);

            }
        });
    }

            //Method Shows Battery Level
            private String batteryLevel(Context context) {

            Intent intent;
            intent = context.registerReceiver(null, new
                    IntentFilter(Intent.ACTION_BATTERY_CHANGED));
            int    level   = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            int    scale   = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
            int    percent = (level*100)/scale;
            return String.valueOf(percent) + "%";
        }

        //TODO: Start and Stop server if needed

}
