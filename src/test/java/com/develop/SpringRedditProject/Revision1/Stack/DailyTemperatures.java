package com.develop.SpringRedditProject.Revision1.Stack;
import java.util.Arrays;
import java.util.Stack;
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();

        int[] res = new int[temperatures.length];
        res[temperatures.length - 1] = 0;
        stack.push(temperatures.length - 1);

        for(int i = temperatures.length - 2; i >= 0 ; i--) {
            while(stack.size() > 0 && temperatures[i] > temperatures[stack.peek()]) {
                stack.pop();
            }
            if(stack.size() == 0) {
                res[i] = 0;
                stack.push(i);
            } else {
                res[i] = stack.peek() - i;
                stack.push(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {89,62,70,58,47,47,46,76,100,70};
        int res[] = dailyTemperatures(ar);
        for(int i = 0 ; i < ar.length ; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
