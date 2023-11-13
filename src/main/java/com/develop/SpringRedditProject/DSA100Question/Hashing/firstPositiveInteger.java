package com.develop.SpringRedditProject.DSA100Question.Hashing;

import java.util.HashMap;
import java.util.Map;

public class firstPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(findFirstPositive(arr));
    }

    private static int findFirstPositive(int[] arr) {
        Map<Integer,Integer> map = new HashMap();

        for(int i : arr) {
            map.put(i,1);
        }

        for(int i = 1; i < Integer.MAX_VALUE; i++) {
            if(map.get(i) == null) {
                return i;
            }
        }
        return -1;
    }
}
