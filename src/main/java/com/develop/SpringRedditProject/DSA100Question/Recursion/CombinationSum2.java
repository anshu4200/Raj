package com.develop.SpringRedditProject.DSA100Question.Recursion;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        List<List<Integer>> res = new ArrayList<>();

        combinationSum2(arr, 0, res, new ArrayList<>(),0, 8);

        for(List<Integer> list : res) {
            System.out.println(list.toString());
        }
    }

    private static void combinationSum2(int[] arr, int cur, List<List<Integer>> res, List<Integer> temp, int count , int target) {

        Collections.sort(temp);
        if(count == target) {
            if(!res.contains(temp)) {
                res.add(new ArrayList<>(temp));
            }
        } else if (count > target) {
            return;
        }
        for(int i=cur; i<arr.length; i++) {
            temp.add(arr[i]);
            combinationSum2(arr,i+1, res, temp,count + arr[i],target);
            temp.remove(temp.size()-1);
        }
    }
}
