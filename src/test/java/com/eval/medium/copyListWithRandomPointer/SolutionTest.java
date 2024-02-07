package com.eval.medium.copyListWithRandomPointer;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    final Solution solution = new Solution();
    @Test
    void example1(){

        Node head = new Node(7);
        Node next1 = new Node(13);
        Node next2 = new Node(11);
        Node next3 = new Node(10);
        Node next4 = new Node(1);

        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;

        next1.random = head;
        next2.random = next4;
        next3.random = next2;
        next4.random = head;

        val node = solution.copyRandomList(head);
        System.out.println(node);

    }


}