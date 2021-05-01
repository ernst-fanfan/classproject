package com.appdevteam.myapplication.testing;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import com.appdevteam.myapplication.R;
import com.appdevteam.myapplication.data.Card;
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

    public static User testUpdateUI(User cUser){
        String uid = cUser.getUserId();
        String category =  "Algebra";
        //Cards
        Card c0 = new Card(uid, "1+1=","2");
        Card c1 = new Card(uid, "1+2=","3");
        Card c2 = new Card(uid, "1+3=","4");
        Card c3 = new Card(uid, "1+4=","5");
        Card c4 = new Card(uid, "1+5=","6");
        Card c5 = new Card(uid, "1+6=","7");
        //card loading
        Card [] cardArray0 = new Card[3];
        cardArray0[0] = c0;
        cardArray0[1] = c1;
        cardArray0[2] = c2;
        Card [] cardArray1 = new Card[3];
        cardArray1[0] = c1;
        cardArray1[1] = c4;
        cardArray1[2] = c3;
        Card [] cardArray2 = new Card[3];
        cardArray2[0] = c2;
        cardArray2[1] = c4;
        cardArray2[2] = c5;
        //Sets loading
        SetOfCards s0 = new SetOfCards(uid,"Test 1",category);
        SetOfCards s1 = new SetOfCards(uid,"Test 2",category);
        SetOfCards s2 = new SetOfCards(uid,"Test 3",category);

        s0.setCards(cardArray0);
        s1.setCards(cardArray1);
        s2.setCards(cardArray2);

        //Library loading
        SetOfCards [] s = new SetOfCards[3];
        s[0] = s0;
        s[1] = s1;
        s[2] = s2;
        Library l = new Library(uid, s);
        cUser.setLibrary(l);

        return cUser;

    }
}
