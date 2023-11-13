package com.develop.SpringRedditProject.DSA100Question.Stack;

import java.util.Stack;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int len = temperatures.length;
        int[] res = new int[len];

        st.push(temperatures[len-1]);
        res[len-1] = 0;

        for(int i=len-2; i>=0; i--) {
            if(temperatures[st.peek()] > temperatures[i]) {
                res[i] = st.peek() - i;
            } else {
                while(temperatures[st.peek()] < temperatures[i] && st.size() > 0) {
                    st.pop();
                }
                if(st.size() == 0){
                    res[i] = 0;
                    st.push(i);
                } else {
                    res[i] = st.peek() - i;
                }
            }
        }
        return res;
    }
}
