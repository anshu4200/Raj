package com.develop.SpringRedditProject.DSA100Question.BitManupulation;

import java.util.Stack;

public class QueueImpl {


        Stack<Integer> st = new Stack<>();
        Stack<Integer> stNew = new Stack<>();
        public QueueImpl() {

        }

        public void push(int x) {
            stNew = new Stack<>();
            while(st.size() > 0) {
                stNew.push(st.pop());
            }
            st.push(x);
            while (stNew.size() > 0) {
                st.push(stNew.pop());
            }
        }

        public int pop() {
            return st.pop();
        }

        public int peek() {
            if(st.size() == 0)
                return -1;
            return st.peek();
        }

        public boolean empty() {
            if(st.size() == 0)
                return false;
            return true;
        }
    }


class ImplQueue {
    public static void main(String[] args) {
        QueueImpl obj = new QueueImpl();
        obj.push(5);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();

        System.out.println(param_2 + " : " + param_3 + " : " + param_4);
    }
}




