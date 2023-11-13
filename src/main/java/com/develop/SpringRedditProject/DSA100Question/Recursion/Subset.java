package com.develop.SpringRedditProject.DSA100Question.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};

        List<List<Integer>> result = new ArrayList<>();
        generateSubset(arr, 0,new ArrayList<>(5),result);
        for(List<Integer> list : result) {
            System.out.println(list.toString());
        }
    }

    private static void generateSubset(int[] arr , int cur, List<Integer> temp, List<List<Integer>> result) {
        result.add( new ArrayList<>(temp));
        for(int i = cur;i<arr.length; i++) {
            temp.add(arr[i]);
            generateSubset(arr, i+1, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}
