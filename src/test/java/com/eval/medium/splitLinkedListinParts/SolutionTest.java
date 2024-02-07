package com.eval.medium.splitLinkedListinParts;


import com.eval.medium.addTwoNumbers.ListNode;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example1(){
        final ListNode head = generateList(17);
        final int k = 5;

        val listNodes = solution.splitListToParts(head, k);
        assertThat(listNodes[4]).isNotNull();

    }
    @Test
    void example2(){
        final ListNode head = generateList(3);
        final int k = 5;

        val listNodes = solution.splitListToParts(head, k);
        assertThat(listNodes[2]).isNotNull();
        assertThat(listNodes[3]).isNull();
        assertThat(listNodes[4]).isNull();

    }

    private ListNode generateList(int counter) {
        ListNode headPrev = new ListNode(0);
        ListNode head = headPrev;
        var i = 1;
        while (i <= counter){
            head.next = new ListNode(i);
            head = head.next;
            i++;
        }
        return headPrev.next;
    }


}