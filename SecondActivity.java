package com.example.android.journalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.*;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void addEntry(View v){

        EditText add = (EditText)findViewById(R.id.newEntry);
        TextView change = (TextView)findViewById(R.id.addChanges);
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if(imm.isAcceptingText()) { // verify if the soft keyboard is open
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        if (TextUtils.isEmpty(add.getText())){
            change.setText("Fill in field!");

        }else{
            change.setText(add.getText());
            Intent myintent = new Intent(getBaseContext(), ThirdActivity.class);
            TextView entry = (TextView) findViewById(R.id.newEntry);
            myintent.putExtra("value2", "added entry");
            startActivity(myintent);
        }

    }
}
