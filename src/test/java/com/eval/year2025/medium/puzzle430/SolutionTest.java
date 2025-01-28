package com.eval.year2025.medium.puzzle430;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example0(){
        //        Input: head = []
        //        Output: head = []
        Node head = null;
        val flattenHead = solution.flatten(head);
        assertThat(flattenHead).isNull();
    }



    @Test
    void example1(){
        // Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
        // Output: head = [1,2,3,7,8,11,12,9,10,4,5,6]


        // Given multi-levelled list
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);

        head.next = node2;

        node2.next = node3;
//        node2.prev = head;

        node3.next = node4;
//        node3.prev = node2;
        node3.child = node7;

        node4.next = node5;
//        node4.prev = node3;

        node5.next = node6;
//        node5.prev = node4;

//        node6.prev = node5;

        node7.next = node8;

        node8.next = node9;
        node8.child = node11;

        node9.next = node10;

        node11.next = node12;


        //When
        val flattenList = solution.flatten(head);


        //Then
        assertThat(flattenList).isNotNull();

        Node flattedHead = new Node(1);
        Node flattedNode2 = new Node(2);
        Node flattedNode3 = new Node(3);
        Node flattedNode4 = new Node(4);
        Node flattedNode5 = new Node(5);
        Node flattedNode6 = new Node(6);
        Node flattedNode7 = new Node(7);
        Node flattedNode8 = new Node(8);
        Node flattedNode9 = new Node(9);
        Node flattedNode10 = new Node(10);
        Node flattedNode11 = new Node(11);
        Node flattedNode12 = new Node(12);

        flattedHead.next = flattedNode2;

//        flattedNode2.prev = flattedHead;
        flattedNode2.next = flattedNode3;

//        flattedNode3.prev = flattedNode2;
        flattedNode3.next = flattedNode7;

//        flattedNode7.prev = flattedNode3;
        flattedNode7.next = flattedNode8;

//        flattedNode8.prev = flattedNode7;
        flattedNode8.next = flattedNode11;

        flattedNode11.next = flattedNode12;

        flattedNode12.next = flattedNode9;

        flattedNode9.next = flattedNode10;

        flattedNode10.next = flattedNode4;

        flattedNode4.next = flattedNode5;

        flattedNode5.next = flattedNode6;

        Node curr = flattenList;
        System.out.print("Output: [");
        while(curr != null){
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
        System.out.print("]");

    }




}