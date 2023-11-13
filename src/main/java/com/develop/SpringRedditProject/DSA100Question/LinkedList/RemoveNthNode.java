package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class RemoveNthNode {
    public ListNode3 removeNthFromEnd(ListNode3 head, int n) {

        ListNode3 fast = head;
        ListNode3 slow = head;

        for(int i = 0; i<n ; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
class ListNode3 {
      int val;
      ListNode3 next;
      ListNode3() {}
      ListNode3(int val) { this.val = val; }
     ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }}