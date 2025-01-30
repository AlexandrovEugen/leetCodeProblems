package com.eval.year2025.medium.puzzle430;


import java.util.Stack;

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        final Stack<Node> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            if (current.child != null) {
                if (current.next != null) {
                    stack.push(current.next);
                    current.next = current.child;
                    current.child.prev = current;
                    current.child = null;
                    current = current.next;
                } else {
                    current.next = current.child;
                    current.child.prev = current;
                    current.child = null;
                    current = current.next;
                }
            } else if (current.next == null) {
                if (!stack.isEmpty()) {
                    current.next = stack.pop();
                    current.next.prev = current;
                    current = current.next;
                } else {
                    current = null;
                }
            } else {
                current.next.prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
