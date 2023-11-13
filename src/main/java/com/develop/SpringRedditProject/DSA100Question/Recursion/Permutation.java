package com.develop.SpringRedditProject.DSA100Question.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        backTrack(arr, res, new ArrayList<>());

        for(List<Integer> list : res) {
            System.out.println(list.toString());
        }

    }

    private static void backTrack(int[] arr, List<List<Integer>> res, ArrayList<Integer> temp) {
        if(temp.size() == arr.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int num : arr) {
            if(!temp.contains(num)) {
                temp.add(num);
                backTrack(arr, res, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
