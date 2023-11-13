package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class IntersectionOfTwoLinkedList {
    public ListNode8 getIntersectionNode(ListNode8 headA, ListNode8 headB) {
        int count1 = 0;
        int count2 = 0;
        ListNode8 first = headA;
        ListNode8 second = headB;
        while(first != null) {
            count1 ++;
            first = first.next;
        }

        while (second != null) {
            count2 ++;
            second = second.next;
        }

        int diff = Math.abs(count2 - count1);
        ListNode8 first1 = headA;
        ListNode8 second1 = headB;
        if(count1 > count2) {
            for(int i=0; i<diff;i++) {
                first1 = first1.next;
            }
        } else {
            for(int i=0; i<diff;i++) {
                second1 = second1.next;
            }
        }

        while (first1 != null && second1 != null) {
            if(first1.val == second1.val)
                return first1;
            first1 = first1.next;
            second1 = second1.next;
        }
        return null;
    }
}


   class ListNode8 {
      int val;
      ListNode8 next;
      ListNode8(int x) {
          val = x;
          next = null;
      }
  }
