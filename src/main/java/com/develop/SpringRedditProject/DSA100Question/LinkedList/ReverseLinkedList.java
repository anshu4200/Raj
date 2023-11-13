package com.develop.SpringRedditProject.DSA100Question.LinkedList;

public class ReverseLinkedList {
    public ListNode1 reverseList(ListNode1 head) {
        ListNode1 temp = head;
        while(temp.next != null) {
            temp = head.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode1 next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode1 next) { this.val = val; this.next = next; }
}
