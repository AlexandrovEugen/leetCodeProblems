package com.eval.year2025.educative._2BasicDataStructures.EvaluateReversePolishNotation;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.length() > 1 || Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int second = stack.pop();
                int first = stack.pop();
                switch (token.charAt(0)) {
                    case '+' -> stack.push(first + second);
                    case '-' -> stack.push(first - second);
                    case '*' -> stack.push(first * second);
                    case '/' -> stack.push(first / second);
                }
            }
        }
        return stack.pop();
    }
}
