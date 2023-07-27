package com.develop.SpringRedditProject.DSA100Question.SearchingAndSorting;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr2 = {1,2};
        int[] arr1 = {3,4};
        System.out.println(findMedianOfTwoSortedArray(arr1,arr2));
    }
    private static double findMedianOfTwoSortedArray(int[] arr1, int[] arr2) {
        int[] medianArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                medianArray[k] = arr1[i];
                i++;
                k++;
            } else {
               medianArray[k] = arr2[j];
               j++;
               k++;
            }
        }
        while(i < arr1.length) {
            medianArray[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length) {
            medianArray[k] = arr2[j];
            j++;
            k++;
        }
        int mid = medianArray.length/2;
        double median = 0.0;
        if(medianArray.length % 2 == 0) {
            median = (medianArray[mid] + medianArray[mid-1])/2.0;
        } else {
            median = medianArray[mid];
        }
        return median;
    }

}
