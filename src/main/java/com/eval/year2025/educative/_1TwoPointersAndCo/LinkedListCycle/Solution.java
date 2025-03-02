package com.eval.year2025.educative._1TwoPointersAndCo.LinkedListCycle;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode slwPtr = head;
        ListNode fstPtr = head;
        while (slwPtr.next != null && fstPtr != null && fstPtr.next != null) {

            slwPtr = slwPtr.next;
            fstPtr = fstPtr.next.next;
            if (slwPtr == fstPtr) {
                return true;
            }
        }
        return false;
    }
}