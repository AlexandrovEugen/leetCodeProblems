package com.eval.old.easy.linkedListCycle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    private  final Solution solution = new Solution();

    @Test
    void example1(){
        ListNode listNode3 = new ListNode(-4);
        ListNode listNode2 = new ListNode(0);
        listNode2.next = listNode3;
        ListNode listNode1 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode = new ListNode(3);
        listNode.next = listNode1;
        listNode3.next = listNode1;

        final boolean hasCycle = solution.hasCycle(listNode);

        assertThat(hasCycle).isTrue();
    }

}