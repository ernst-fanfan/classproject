package com.appdevteam.myapplication.data;

import com.google.firebase.auth.FirebaseUser;

public class User {
    private String userId;
    private String userName;
    private String userEmail;
    private Library library;

    public User(FirebaseUser user){
        this.userId = user.getUid();
        this.userName = user.getDisplayName();
        this.userEmail = user.getEmail();
        this.library = new Library();
    }

    public String userId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public Library getUserCards() {
        return library;
    }

    public void setUserCards(Library library){
        this.library = library;
    }
}
