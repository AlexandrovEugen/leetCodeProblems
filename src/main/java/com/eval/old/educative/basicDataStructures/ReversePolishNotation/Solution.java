package com.eval.old.educative.basicDataStructures.ReversePolishNotation;

import java.util.Stack;

public class Solution {


    public static int rpn(String[] tokens) {
        final Stack<Integer> integers = new Stack<>();


        for (String token : tokens) {
            if("+".equals(token)){
                Integer second = integers.pop();
                Integer first = integers.pop();
                integers.push(second + first);
            } else if ("-".equals(token)){
                Integer second = integers.pop();
                Integer first = integers.pop();
                integers.push(first - second);
            } else if ("*".equals(token)){
                Integer second = integers.pop();
                Integer first = integers.pop();
                integers.push(first * second);
            } else if ("/".equals(token)){
                Integer second = integers.pop();
                Integer first = integers.pop();
                integers.push(first / second);
            } else {
                integers.push(Integer.parseInt(token));
            }
        }

        return integers.pop();
    }

}
