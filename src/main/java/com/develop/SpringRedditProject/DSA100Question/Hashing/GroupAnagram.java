package com.develop.SpringRedditProject.DSA100Question.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        HashMap<HashMap<Character, Integer>, ArrayList<String>> res = groupAna(strings);
        for(Map.Entry<HashMap<Character, Integer>, ArrayList<String>> ent: res.entrySet()) {
            System.out.println(ent.getValue().toString());
        }
    }

    private static HashMap<HashMap<Character, Integer>, ArrayList<String>> groupAna(String[] strings) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bMap = new HashMap();

        for(String st : strings) {
            HashMap<Character, Integer> fMap = new HashMap<>();
            for(int i=0; i<st.length(); i++) {
                char ch = st.charAt(i);
                fMap.put(ch, fMap.getOrDefault(ch , 0)+ 1);
            }

            if(bMap.containsKey(fMap) == false) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(st);
                bMap.put(fMap, arrayList);
            } else {
                ArrayList<String> strings1 = bMap.get(fMap);
                strings1.add(st);
                bMap.put(fMap, strings1);
            }
        }
        return bMap;
    }
}
