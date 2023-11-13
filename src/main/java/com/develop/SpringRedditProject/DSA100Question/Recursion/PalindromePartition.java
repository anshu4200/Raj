package com.develop.SpringRedditProject.DSA100Question.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public static void main(String[] args) {
        String st = "aabb";
        List<List<String>> res = new ArrayList<>();
        dfs(0,st,res,new ArrayList<>());

        for(List<String> list : res) {
            System.out.println(list.toString());
        }
    }

    private static void dfs(int i, String st, List<List<String>> res, ArrayList<String> temp) {
        if(i >= st.length()) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int j=i; j<st.length(); j++) {
            String sub = st.substring(i,j+1);
            if(isPalindrome(sub)) {
                temp.add(sub);
                dfs(j+1, st, res, temp);
                temp.remove(sub);

            }

        }

    }

    private static boolean isPalindrome(String st) {
        int i = 0;
        int j = st.length() - 1;
        while (i <= j) {
            if (st.charAt(i)!=st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
