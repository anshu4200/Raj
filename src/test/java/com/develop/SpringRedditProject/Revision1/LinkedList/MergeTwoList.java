package com.develop.SpringRedditProject.Revision1.LinkedList;

public class MergeTwoList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        head.next = list1 != null ? list1 : list2 != null ? list2 : null;
        if(list1 != null) {
            head.next = list1;
        }
        if(list2 != null) {
            head.next = list2;
        }
        return dummy.next;
    }
}
