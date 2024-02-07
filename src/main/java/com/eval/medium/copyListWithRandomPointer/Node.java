package com.eval.medium.copyListWithRandomPointer;

import lombok.Data;
import lombok.ToString;


@Data
class Node {
    int val;
    @ToString.Exclude
    Node random;
    @ToString.Exclude
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

}
