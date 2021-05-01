package com.appdevteam.myapplication.data;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// [START post_class]
@IgnoreExtraProperties
public class Library {
    public String uid;
    public int numberOfSets = 0;
    public SetOfCards [] setOfCards;


    public Library() {
        // Default constructor required for calls to DataSnapshot.getValue(Library.class)
    }

    public Library(String uid, SetOfCards [] setOfCards) {
        this.uid = uid;
        this.setOfCards = setOfCards;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("numberOfSets", numberOfSets);

        return result;
    }
    // [END post_to_map]
}
// [END post_class]