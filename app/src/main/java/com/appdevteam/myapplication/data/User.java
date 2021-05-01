package com.appdevteam.myapplication.data;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User{
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

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library){
        this.library = library;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("userId", userId);
        result.put("userName", userName);
        result.put("userEmail", userEmail);

        return result;
    }
}
