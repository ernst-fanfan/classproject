package com.appdevteam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

//import com.appdevteam.myapplication.data.Firebase;

public class QMainActivity extends AppCompatActivity {
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_main);
//        Firebase db = new Firebase();
        Intent info = getIntent();
        String uInfo = info.getStringExtra(MainActivity.EXTRA_INFO);
        test = findViewById(R.id.textView);
        test.setText(uInfo);


//        db.write("message");

    }
}