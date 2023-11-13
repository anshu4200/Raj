package com.develop.SpringRedditProject.Revision1.Arrays;

public class KthSmallestElement1 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr, 0, arr.length-1, 3));
    }

    private static int kthSmallest(int[] arr, int low, int high, int tar) {
        int resultElement = getResultElement(arr, low, high);
        if(resultElement == tar-1) {
            return arr[resultElement];
        } else if(resultElement < tar -1) {
            return kthSmallest(arr, resultElement+1, high,tar);
        } else {
            return kthSmallest(arr, low, resultElement-1,tar);
        }
    }

    private static int getResultElement(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low;
        int i = j-1;
        while(j <= high) {
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
