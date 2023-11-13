package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        ListNode2 listNode2 = new ListNode2(0);
        ListNode2 listNode21 = new ListNode2();
        mergeTwoLists(listNode21,listNode2);
    }
    public static ListNode2 mergeTwoLists(ListNode2 list1, ListNode2 list2) {
        if(list1 == null && list2 == null) {
            return null;
        }

        ListNode2 dummy = new ListNode2(0);
        ListNode2 list3 = dummy;
    while(list1 != null && list2 != null) {
        if(list1.val < list2.val) {
            list3.next = new ListNode2(list1.val);
            list1 = list1.next;
            list3 = list3.next;
        } else {
            list3.next = new ListNode2(list2.val);
            list2 = list2.next;
            list3 = list3.next;
    }

        if(list1 != null) {
            list3.next = list1;
        }

        if(list2 != null) {
            list3.next = list2;
        }
}
return dummy.next;

    }
}

class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
 }