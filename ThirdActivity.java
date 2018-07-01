package com.example.android.journalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        String savedExtra = getIntent().getStringExtra("value2");
        TextView myText = (TextView) findViewById(R.id.entry1);
        myText.setText(savedExtra);
    }
}
