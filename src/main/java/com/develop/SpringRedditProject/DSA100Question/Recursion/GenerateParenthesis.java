package com.develop.SpringRedditProject.DSA100Question.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        generateBracket("(" ,1,0,3,res);
    }
    private static void generateBracket(String current, int open, int close, int n, List<String> res) {
        if(current.length() == n*2) {
            System.out.println(current);
            return;
        }

        if(open < n) {
            generateBracket(current + "(", open + 1 , close , n , res);
        }

        if(close < open) {
            generateBracket(current + ")", open, close + 1, n, res);
        }
    }
}
