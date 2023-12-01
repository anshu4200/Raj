package com.develop.SpringRedditProject.Revision1.Stack;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        while(stack1.size() > 0) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (stack2.size() > 0) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        if(stack1.size() == 0)
            return false;
        else {
            return true;
        }
    }

    public static void main(String[]args){

        MyQueue obj = new MyQueue();
    //    obj.push(x);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}


