package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode1 head) {

        if(head == null) return false;
        ListNode1 slow = head;
        ListNode1 fast = head.next;

        while(slow != fast) {

            if(fast == null || fast.next != null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1(int x) {
          val = x;
          next = null;
      }
    }