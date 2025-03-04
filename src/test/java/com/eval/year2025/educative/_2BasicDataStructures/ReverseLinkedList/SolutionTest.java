package com.eval.year2025.educative._2BasicDataStructures.ReverseLinkedList;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]
    */
    @Test
    void example1(){
        int[] input = {1,2,3,4,5};
        ListNode head = createdList(input);

        ListNode reverseList = solution.reverseList(head);

        int hi = input.length - 1;
        while (reverseList != null) {
            assertThat(reverseList.val).isEqualTo(input[hi]);
            reverseList = reverseList.next;
            hi--;
        }
        assertThat(hi).isEqualTo(-1);
    }

    ListNode createdList(int... array){
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return head;
    }

}