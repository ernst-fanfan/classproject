package com.appdevteam.myapplication.data;

import com.google.firebase.auth.FirebaseUser;
import org.json.JSONObject;

public class User {
    private String userName;
    private String userEmail;
    private JSONObject userCards;

    public User(FirebaseUser user){
        this.userName = user.getDisplayName();
        this.userEmail = user.getEmail();
    }


    public String GetUserName() {
        return userName;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public JSONObject getUserCards() {
        return userCards;
    }

    public void setUserCards(JSONObject userCards){
        this.userCards = userCards;
    }
}
