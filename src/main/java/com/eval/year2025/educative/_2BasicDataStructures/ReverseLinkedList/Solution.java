package com.eval.year2025.educative._2BasicDataStructures.ReverseLinkedList;

import lombok.ToString;

@ToString
class ListNode {
    int val;
    @ToString.Exclude
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;
        while (next != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
            cur.next = prev;

        }
        return cur;
    }
}