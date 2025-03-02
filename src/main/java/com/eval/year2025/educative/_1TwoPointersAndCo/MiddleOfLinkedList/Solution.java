package com.eval.year2025.educative._1TwoPointersAndCo.MiddleOfLinkedList;


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode middleNode(ListNode head) {

        if (head == null) return null;

        ListNode slwPtr = head;
        ListNode fstPtr = head;
        while (slwPtr.next != null && fstPtr != null && fstPtr.next != null) {

            slwPtr = slwPtr.next;
            fstPtr = fstPtr.next.next;
        }
        return slwPtr;
    }
}