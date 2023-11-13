package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class ReorderLinkedList {

    public void reOrderList(ListNode6 head) {

        ListNode6 slow = head;
        ListNode6 fast = head;
        ListNode6 prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        reverseLinkedList(slow);

        merge(head , prev);
    }
    private void merge(ListNode6 l1, ListNode6 l2) {
        ListNode6 listNode6 = new ListNode6(0);
        ListNode6 dummy = listNode6;
        int count = 0;
        while (l1 != null && l2 != null) {
            if(count % 2 == 0) {
                ListNode6 list = new ListNode6(l1.val);
                listNode6.next = list;
                listNode6 = list.next;
            } else {
                ListNode6 list = new ListNode6(l2.val);
                listNode6.next = list;
                listNode6 = list.next;
            }
            count++;
        }

        if(l1 != null) {
            listNode6.next = l1;
        }

        if(l2 != null) {
            listNode6.next = l2;
        }


    }



    public void reorderList(ListNode6 head) {
       ListNode6 mid = findMiddleElementList(head);
       reverseLinkedList(mid);
       ListNode6 finalList = new ListNode6(0);
       ListNode6 dummy = finalList;
       while(mid != null) {
           ListNode6 finalList1 = new ListNode6(head.val);
           ListNode6 finalList2 = new ListNode6(mid.val);
           head = head.next;
           mid = mid.next;
           finalList1.next = finalList2;
       }
    }

    private void reverseLinkedList(ListNode6 head) {
        ListNode6 prev = null;
        ListNode6 cur = head;

        while(cur != null) {
            ListNode6 temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
    }

    private ListNode6 findMiddleElementList(ListNode6 head) {
        ListNode6 slow = head;
        ListNode6 fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

  class ListNode6 {
      int val;
      ListNode6 next;
      ListNode6() {}
      ListNode6(int val) { this.val = val; }
      ListNode6(int val, ListNode6 next) { this.val = val; this.next = next; }
  }