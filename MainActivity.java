package com.example.android.journalapplication;

import android.content.Intent;
import android.view.View;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
 }
 public void openApp(View view){
  Intent intent = new Intent(getBaseContext(), SecondActivity.class);
  startActivity(intent);
 }

}