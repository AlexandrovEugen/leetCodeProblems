package com.eval.year2025.educative._1TwoPointersAndCo.LinkedListCycle;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: head = [3,2,0,-4], pos = 1
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
    */
    @Test
    void example1(){
        ListNode head = new ListNode(3);
        ListNode next = new ListNode(2);
        head.next = next;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = next;

        boolean hasCycle = solution.hasCycle(head);

        assertThat(hasCycle).isTrue();
    }


}