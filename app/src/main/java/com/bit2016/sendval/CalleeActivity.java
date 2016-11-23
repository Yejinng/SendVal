package com.bit2016.sendval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalleeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callee);

        Intent intent = getIntent();
        int dataNumber = intent.getIntExtra("data_number", 0);
        String dataString = intent.getStringExtra("data_string");

        String result = "data_number:" + dataNumber + ", data_string:" + dataString;
        TextView textView = (TextView)findViewById(R.id.textView3);
        textView.setText(result);
    }
}
