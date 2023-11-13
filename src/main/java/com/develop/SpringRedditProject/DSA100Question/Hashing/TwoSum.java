package com.develop.SpringRedditProject.DSA100Question.Hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] res = twoSum(arr, 6);
        System.out.println(res[0] + " two sum " + res[1]);
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for(int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if(map.get(diff)!=null && map.get(diff)!=i) {
                res[0] = i;
                res[1] = map.get(diff);
                return res;
            }
        }
        return res;
    }
}
