package com.eval.year2025.educative._1TwoPointersAndCo.LinkedListCycleIII;

// Definition for a Linked List node
// class ListNode {
//     int val;
//     ListNode next;

//     // Constructor
//     public ListNode(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

import java.util.*;

public class Solution {
    public int countCycleLength(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int length = 1;
                slow = slow.next;
                while (slow != fast) {
                    length++;
                    slow = slow.next;
                }
                return length;
            }
        }

        return 0;
    }
}
