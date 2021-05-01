package com.appdevteam.myapplication.testing;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import com.appdevteam.myapplication.R;
import com.appdevteam.myapplication.data.Library;
import com.appdevteam.myapplication.data.SetOfCards;
import com.appdevteam.myapplication.data.User;
import com.google.gson.Gson;

public class DataTest {

    public static void testOnCreate(Activity sourceActivity, TextView test){
        Gson gson = new Gson();
        Intent info = sourceActivity.getIntent();
        User cUser = gson.fromJson(info.getStringExtra("uInfo"), User.class);
        test = sourceActivity.findViewById(R.id.textView);
        test.setText(cUser.toMap().toString());
    }

    public static void testUpdateUI(User cUser){
        String uid = cUser.getUserId();
        String category =  "Algebra";
        //Cards
        
        //Sets loading
        SetOfCards s0 = new SetOfCards(uid,"Test 1",category);
        SetOfCards s1 = new SetOfCards(uid,"Test 2",category);
        SetOfCards s2 = new SetOfCards(uid,"Test 3",category);

        //Library loading
        SetOfCards [] s = new SetOfCards[0];
        s[0] = s0;
        s[1] = s1;
        s[2] = s2;
        Library l = new Library(uid, s);
        cUser.setLibrary(l);

    }
}
