package com.appdevteam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.appdevteam.myapplication.testing.DataTest;

//import com.appdevteam.myapplication.data.Firebase;

public class QMainActivity extends AppCompatActivity {
    TextView test0;
    TextView test1;
    TextView test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_main);

        DataTest.testOnCreate(this, test0, test1, test2);


    }
}