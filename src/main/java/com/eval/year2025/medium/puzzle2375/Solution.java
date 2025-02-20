package com.eval.year2025.medium.puzzle2375;

import java.util.Stack;

class Solution {



    public String smallestNumber(String pattern) {

        final Stack<Integer> indexStack = new Stack<>();
        final StringBuilder result = new StringBuilder();

        for (int i = 0; i < pattern.length() + 1; i++) {
            indexStack.push(i + 1);

            while (!indexStack.isEmpty() && (i == pattern.length() || pattern.charAt(i) == 'I')) {
                result.append(indexStack.pop());
            }
        }


        return result.toString();
    }
}