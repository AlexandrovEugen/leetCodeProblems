package com.eval.addTwoNumbers;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ListNode {
    private int value;
    private ListNode next;


    ListNode(int val) {
        this.value = val;
    }

    ListNode(int val, ListNode next) {
        this.value = val;
        this.next = next;
    }

}
