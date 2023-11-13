package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class PalindromeLinkedList {

    // find middle element
    // reverse from middle element.
    // traverse and check if it is palindrome or not.

    public boolean isPalindrome(ListNode9 head) {
        ListNode9 slow = head;
        ListNode9 fast= head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode9 res = reverse(slow);
        ListNode9 curr = head;
        while(curr != null) {
            if(curr.val != res.val)
                return false;
            curr = curr.next;
            res = res.next;
        }
        return true;
    }

    private ListNode9 reverse(ListNode9 head) {
        ListNode9 prev = null;
        ListNode9 curr = head;

        while(curr != null) {
            ListNode9 temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}




 class ListNode9 {
      int val;
      ListNode9 next;
      ListNode9() {}
      ListNode9(int val) { this.val = val; }
      ListNode9(int val, ListNode9 next) { this.val = val; this.next = next; }
  }
