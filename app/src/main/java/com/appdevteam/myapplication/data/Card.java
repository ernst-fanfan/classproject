package com.appdevteam.myapplication.data;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Card {
    public String uid;
    public String author;
    public String question;
    public String answer;
    public Map<String, Boolean> card = new HashMap<>();

    public Card() {
        // Default constructor required for calls to DataSnapshot.getValue(SetOfCards.class)
    }

    public Card(String uid, String author, String question, String answer) {
        this.uid = uid;
        this.author = author;
        this.question = question;
        this.answer = answer;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("question", question);
        result.put("answer", answer);

        return result;
    }
}
