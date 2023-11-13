package com.develop.SpringRedditProject.Revision1.Arrays;

public class KhadaneAlgo {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        largestSumContiguousSubArray(arr);
    }

    private static void largestSumContiguousSubArray(int[] arr) {
        int temp = 0;
        int max = -1;
        for(int i = 0; i < arr.length; i++) {
            temp += arr[i];
               if(temp < 0) {
                   temp = 0;
               } else if(temp > max) {
                   max = temp;
               }
        }
        System.out.println(max);
    }
}
