package com.appdevteam.myapplication.data;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Card {
    public String uid;
    public String question;
    public String answer;
    public Boolean known;

    public Card() {
        // Default constructor required for calls to DataSnapshot.getValue(SetOfCards.class)
    }

    public Card(String uid, String question, String answer) {
        this.uid = uid;
        this.question = question;
        this.answer = answer;
        this.known = false;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public void toggleKnown(){
        if (this.known) {
            this.known = false;
        }else{
            this.known = true;
        }
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("question", question);
        result.put("answer", answer);
        result.put("known", known);

        return result;
    }
}
