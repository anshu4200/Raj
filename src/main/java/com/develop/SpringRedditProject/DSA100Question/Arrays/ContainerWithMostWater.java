package com.develop.SpringRedditProject.DSA100Question.Arrays;

public class ContainerWithMostWater {

    public static void mostWater(int ar[]) {
        int max = 0;
        for(int i=0;i<ar.length;i++) {
            for(int j=0 ; j<ar.length && j!=i ; j++) {
                int maxWater = Math.min(ar[i],ar[j])*Math.abs(i-j);
                if(maxWater > max) max = maxWater;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int ar[] = {1,1};
        mostWater(ar);
    }
}
