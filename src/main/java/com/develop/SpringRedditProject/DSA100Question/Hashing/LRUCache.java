package com.develop.SpringRedditProject.DSA100Question.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Map<Integer, Integer> map = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
           this.capacity = capacity;
    }

    public int get(int key) {
        if(map.get(key) != null) {
            return map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.size() < capacity) {
            map.put(key, value);
        } else {
            
        }
    }
}
