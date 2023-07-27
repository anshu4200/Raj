package com.develop.SpringRedditProject.DSA100Question.Strings;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CCAB";

        System.out.println("rotation is " + checkRotation(s1,s2));
    }

    private static boolean checkRotation(String s1, String s2) {
        return ((s1.length() == s2.length()) && (s1+s1).indexOf(s2)!=-1);
    }
}
