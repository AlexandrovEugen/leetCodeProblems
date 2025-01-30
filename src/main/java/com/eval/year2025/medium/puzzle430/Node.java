package com.eval.year2025.medium.puzzle430;

import lombok.Data;
import lombok.ToString;

@Data
class Node {
    public final int val;

    public Node(int val) {
        this.val = val;
    }

    @ToString.Exclude
    public Node prev;
    @ToString.Exclude
    public Node next;
    @ToString.Exclude
    public Node child;
};
