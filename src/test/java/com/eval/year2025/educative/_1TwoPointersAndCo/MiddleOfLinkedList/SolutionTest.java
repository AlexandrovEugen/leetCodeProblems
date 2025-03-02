package com.eval.year2025.educative._1TwoPointersAndCo.MiddleOfLinkedList;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example1(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        ListNode listNode = solution.middleNode(head);

        assertThat(listNode).isNotNull();
        assertThat(listNode.val).isEqualTo(0);
    }

}