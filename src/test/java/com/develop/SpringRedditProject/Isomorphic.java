package com.develop.SpringRedditProject;

import java.util.*;

public class Isomorphic {
    private void checkIsomorphic(String str1, String str2) {
        if(str1.length() != str2.length()) return;

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch,1);
            } else {
                map.put(ch,map.get(ch) + 1);
            }
        }

        char[] isomorphic = str2.toCharArray();
        Arrays.sort(isomorphic);
        String str3 = isomorphic.toString();
    }
}
