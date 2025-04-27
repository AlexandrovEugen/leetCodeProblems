package com.eval.year2025.educative._1TwoPointersAndCo.LinkedListCycleIII;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example1() {

        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(8);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        int length = solution.countCycleLength(head);

        assertThat(length).isEqualTo(3);
    }


}