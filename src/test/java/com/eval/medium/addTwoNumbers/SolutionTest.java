package com.eval.medium.addTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expectedList = new ListNode(0);

        ListNode actualList = solution.addTwoNumbers(l1, l2);

        assertThat(actualList).isNotNull().isEqualTo(expectedList);
    }

    @Test
    void test2() {
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(4, l11);
        ListNode l13 = new ListNode(2, l12);

        ListNode l21 = new ListNode(4);
        ListNode l22 = new ListNode(6, l21);
        ListNode l23 = new ListNode(5, l22);


        ListNode actualList = solution.addTwoNumbers(l13, l23);

        ListNode l31 = new ListNode(8);
        ListNode l32 = new ListNode(0, l31);
        ListNode expected = new ListNode(7, l32);

        assertThat(actualList).isNotNull().isEqualTo(expected);
    }


    @Test
    void test3() {
        ListNode l11 = new ListNode(9);


        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(9, l21);
        ListNode l23 = new ListNode(9, l22);
        ListNode l24 = new ListNode(9, l23);
        ListNode l25 = new ListNode(9, l24);
        ListNode l26 = new ListNode(9, l25);
        ListNode l27 = new ListNode(9, l26);
        ListNode l28 = new ListNode(9, l27);
        ListNode l29 = new ListNode(9, l28);
        ListNode l210 = new ListNode(1, l29);


        ListNode actual = solution.addTwoNumbers(l11, l210);


        ListNode l31 = new ListNode(1);
        ListNode l32 = new ListNode(0, l31);
        ListNode l33 = new ListNode(0, l32);
        ListNode l34 = new ListNode(0, l33);
        ListNode l35 = new ListNode(0, l34);
        ListNode l36 = new ListNode(0, l35);
        ListNode l37 = new ListNode(0, l36);
        ListNode l38 = new ListNode(0, l37);
        ListNode l39 = new ListNode(0, l38);
        ListNode l310 = new ListNode(0, l39);
        ListNode expected = new ListNode(0, l310);


        assertThat(actual).isNotNull().isEqualTo(expected);

    }

}