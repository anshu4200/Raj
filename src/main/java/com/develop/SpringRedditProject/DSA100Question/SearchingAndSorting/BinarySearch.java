package com.develop.SpringRedditProject.DSA100Question.SearchingAndSorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println("the target index is: " + binarySearchCustom(arr , 5));
    }

    private static int binarySearchCustom(int[] arr, int tar) {
        int l = 0;
        int r = arr.length - 1;

        while(l<=r) {
            int mid = (l+r)/2;

            if(arr[mid] < tar) {
                l = mid + 1;
            } else if(arr[mid] > tar) {
                r = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
