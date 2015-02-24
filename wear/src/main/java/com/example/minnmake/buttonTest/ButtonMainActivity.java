package com.example.minnmake.buttonTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ButtonMainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_layout);
        final LinearLayout layout = (LinearLayout) findViewById(R.id.root_layout);
        final Button bn = (Button) findViewById(R.id.btnaddnewtext);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Code for Activities what will appears when user click button
                //Starting Server etc.
                TextView tv1 = new TextView(v.getContext());
                tv1.setText("Starting Server ...");
                layout.addView(tv1);

            }
        });
    }
}
