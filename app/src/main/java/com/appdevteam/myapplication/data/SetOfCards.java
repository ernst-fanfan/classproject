package com.appdevteam.myapplication.data;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SetOfCards{
    public String uid;
    public String title;
    public String category;
    public int numberOfCards = 0;
    public Card [] cards;

    public SetOfCards() {
        // Default constructor required for calls to DataSnapshot.getValue(SetOfCards.class)
    }

    public SetOfCards(String uid, String title, String category) {
        this.uid = uid;
        this.title = title;
        this.category = category;
        this.cards = new Card[0];
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setCards(Card [] cards){
        this.cards = cards;
    }

    public Card[] getCards(){
        return cards;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("title", title);
        result.put("category", category);
        result.put("numberOfCards", numberOfCards);

        return result;
    }
}
