package com.appdevteam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.appdevteam.myapplication.testing.DataTest;

//import com.appdevteam.myapplication.data.Firebase;

public class QMainActivity extends AppCompatActivity {
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_main);

        DataTest.testOnCreate(this, test);


    }
}