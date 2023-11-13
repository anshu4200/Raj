package com.develop.SpringRedditProject.DSA100Question.SearchingAndSorting;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 7, 6, 1, 4, 2};
        System.out.println(quickSelect(arr,0,arr.length-1, 4));
    }
    private static int quickSelect(int[] arr, int lo, int hi, int target) {
        int pivot = arr[hi];
        int pi = partition(arr,lo,hi,pivot);
        if(pi < target) {
            return quickSelect(arr, pi + 1, hi ,pivot);
        } else if(pi > target) {
            return quickSelect(arr, lo, pi-1, pivot);
        } else {
            return arr[pi];
        }
    }

    private static int partition(int[] arr, int lo, int hi, int pivot) {
        int i = lo;
        int j = lo;
        while(j <= hi) {
            if(arr[j] < pivot) {
                swap(arr,i,j);
                i++;
                j++;
            } else {
                j++;
            }
        }
        return j-1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
