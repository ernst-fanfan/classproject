package com.appdevteam.myapplication.data;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START post_class]
@IgnoreExtraProperties
public class Library {

    public String lid;
    public String uid;
    public SetOfCards [] setOfCards;
    public int numberOfSets = 0;
    public Map<String, Boolean> sets = new HashMap<>();

    public Library() {
        // Default constructor required for calls to DataSnapshot.getValue(Library.class)
    }

    public Library(String lid, String uid, SetOfCards [] setOfCards) {
        this.lid = lid;
        this.uid = uid;
        this.setOfCards = setOfCards;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("lid", lid);
        result.put("uid", uid);
        result.put("set", setOfCards);
        result.put("numberOfSets", numberOfSets);
        result.put("sets", sets);

        return result;
    }
    // [END post_to_map]
}
// [END post_class]