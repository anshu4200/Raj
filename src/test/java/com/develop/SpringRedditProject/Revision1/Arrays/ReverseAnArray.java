package com.develop.SpringRedditProject.Revision1.Arrays;

public class ReverseAnArray {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        reverseAnArray(arr);

        for(int i : arr) {
            System.out.println(i);
        }
    }

    private static void reverseAnArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        while(low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low ++;
            high --;
        }
    }
}
