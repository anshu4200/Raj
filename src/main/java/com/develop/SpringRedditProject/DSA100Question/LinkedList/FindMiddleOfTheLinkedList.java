package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class FindMiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode4 listNode4 = new ListNode4(0);
        ListNode4 listNode5 = new ListNode4(1);
        ListNode4 listNode6 = new ListNode4(2);
        ListNode4 listNode7 = new ListNode4(3);
        ListNode4 head = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = null;

        ListNode4 printList = middleNode(head);
        while(printList != null) {
            System.out.println(printList.val);
            printList = printList.next;
        }


    }
    public static ListNode4 middleNode(ListNode4 head) {
        ListNode4 slow = head;
        ListNode4 fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4() {}
    ListNode4(int val) { this.val = val; }
    ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}

