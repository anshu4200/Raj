package com.develop.SpringRedditProject.DSA100Question.Strings;

import java.util.Arrays;

public class FindAllAnagram {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cbaebabacd";

        int[] str1 = new int[26];
        int[] str2 = new int[26];

        Arrays.fill(str1,0);
        Arrays.fill(str2,0);

        for(int i=0; i<a.length(); i++) {
            str1[a.charAt(i)-'a'] = str1[a.charAt(i)-'a']+1;
        }
        int itr = b.length() - a.length() + 1;
        int init = 0;
        while (init < itr) {
            for(int i=0+init; i<a.length()+init; i++) {
                str2[b.charAt(i)-'a'] = 1;
            }


        }



        for(int i=0; i<str2.length; i++) {

        }


        System.out.println(compareArray(str1,str2));
    }

    private static boolean compareArray(int[] str1, int[] str2) {
        for(int i=0;i<26;i++) {
            if(str1[i] != str2[i]) return false;
        }
        return true;
    }
}
