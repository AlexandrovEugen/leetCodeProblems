package com.eval.year2025.educative._2BasicDataStructures.BasicCalculator;

import java.util.Stack;

public class Solution {


    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int sign = 1;  // 1 means positive, -1 means negative
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;  // Adjust for loop increment
                sum += sign * num;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                // Push current sum and sign onto stack
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;
            } else if (c == ')') {
                // Compute the value within parentheses
                sum = stack.pop() * sum + stack.pop();
            }
        }

        return sum;
    }


    @Deprecated
    public int calculateNotWorking(String s) {
        final Stack<Character> operands = new Stack<>();
        final Stack<Integer> numbers = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
                continue;
            }
            if (!sb.isEmpty()) {
                int number = Integer.parseInt(sb.toString());
                if (!operands.empty() && operands.peek() == '-') {
                    number *= -1;
                }
                numbers.push(number);
                sb = new StringBuilder();

                if ((c != ')' && c != '(') && !operands.empty() && (operands.peek() == '+' || operands.peek() == '-')) {
                    numbers.push(numbers.pop() + numbers.pop());
                    operands.pop();
                }
            }
            if (c == '(' || c == '+' || c == '-') {
                operands.push(c);
                continue;
            }
            if (c == ')') {
                while (!operands.isEmpty() && operands.peek() != '(') {
                    numbers.push(numbers.pop() + numbers.pop());
                    operands.pop();
                }
                operands.pop();
            }
        }
        if (!sb.isEmpty()) {
            numbers.push(Integer.parseInt(sb.toString()));
        }
        while (!operands.isEmpty()) {
            numbers.push(numbers.pop() + numbers.pop());
            operands.pop();
        }
        return numbers.pop();
    }


    @Deprecated
    public int calculateNotWorking1(String s) {
        final Stack<Integer> numbers = new Stack<>();
        final Stack<Character> operators = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
                continue;
            }
            if (!sb.isEmpty()) {
                numbers.push(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
                if (c != ')' && !operators.isEmpty() && (operators.peek() == '+' || operators.peek() == '-')) {
                    Integer second = numbers.pop();
                    Integer first = numbers.pop();
                    if (operators.pop() == '+') {
                        numbers.push(first + second);
                    } else {
                        numbers.push(first - second);
                    }
                }
            }
            if (c == ' ') {
                continue;
            }
            if (c == '+' || c == '-' || c == '(') {
                operators.push(c);
                continue;
            }
            if (c == ')') {
                while (!operators.peek().equals('(')) {
                    Character operator = operators.pop();
                    //Check unary operator
                    if (operator == '-') {
                        if (operators.peek() == '(') {
                            Integer number = numbers.pop();
                            numbers.push(-1 * number);
                        }
                        break;
                    }

                    Integer second = numbers.pop();
                    Integer first = numbers.pop();

                    if (operator == '+') {
                        numbers.push(first + second);
                    } else {
                        numbers.push(first - second);
                    }
                }
                operators.pop();
            }
        }
        if (!sb.isEmpty()) {
            numbers.push(Integer.parseInt(sb.toString()));
        }
        while (!operators.isEmpty()) {
            Integer second = numbers.pop();
            Integer first = numbers.pop();
            Character operator = operators.pop();
            if (operator == '+') {
                numbers.push(first + second);
            } else {
                numbers.push(first - second);
            }
        }
        return numbers.pop();
    }
}
