package com.develop.SpringRedditProject;

import java.util.Stack;

public class BalancedParenthesis {

   static int lps(String s) {
        // code here
        int[] ar = new int[s.length()];
        ar[0] = 0;

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(ar[i-1])) {
                ar[i] = ar[i-1] + 1;
            }
        }
        int max = -1;
        for(int i=1; i<s.length(); i++) {
            if(ar[i] > max) max = ar[i];
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(lps("abab"));
    }
}
