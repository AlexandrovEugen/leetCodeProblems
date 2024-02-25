package com.eval.educative.basicDataStructures.validParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    @Deprecated
    public static boolean isValidWithSwitch(String s) {
        final Stack<Character> opening = new Stack<>();
        boolean isValid = true;
        int i = 0;
        while(i < s.length() && isValid){
            char c = s.charAt(i);
            switch(c){
                case'(':
                case'{':
                case'[': opening.push(c);
                break;
                case'}':  {
                    if (opening.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    if('{' != opening.peek()){
                        isValid = false;
                    } else {
                        opening.pop();
                    }
                }
                break;
                case']':{
                    if (opening.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    if('[' != opening.peek()){
                        isValid = false;
                    } else {
                        opening.pop();
                    }
                }
                break;
                case ')':{
                    if (opening.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    if('(' != opening.peek()){
                        isValid = false;
                    } else {
                        opening.pop();
                    }
                }
            }
            i++;
        }

        // Replace this placeholder return statement with your code
        return opening.isEmpty() && isValid;
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>(); // The stack to keep track of brackets
        HashMap<Character, Character> hashmap = new HashMap<>();
        hashmap.put(')', '(');
        hashmap.put('}', '{');
        hashmap.put(']', '[');

        for (char ch : s.toCharArray()) {
            // If the character is an opening bracket
            if (!hashmap.containsKey(ch)) {
                // Simply push it onto the stack
                stack.push(ch);
            } else {
                // Pop the element from the stack, if it is not empty
                char poppedElement = (stack.isEmpty()) ? '*' : stack.pop();

                // If the mapping for the opening bracket in our hashmap and the popped
                // element of the stack don't match, return false
                if (hashmap.get(ch) != poppedElement) {
                    return false;
                }
            }
        }

        // If the stack is empty, we will return true; otherwise, false
        return stack.isEmpty();
    }

}
