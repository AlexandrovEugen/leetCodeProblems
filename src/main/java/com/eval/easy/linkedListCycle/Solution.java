package com.eval.easy.linkedListCycle;

import com.eval.medium.addTwoNumbers.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return  false;
        ListNode slow = head;
        ListNode fast = head.getNext();

        while (fast != null && fast.getNext() !=null && slow !=null){
            if (fast == slow) return true;
            slow = slow.getNext();
            fast =  fast.getNext().getNext();
        }



        return false;
    }
}