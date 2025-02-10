package com.eval.year2025.easy.puzzle3174;

import java.util.Stack;

class Solution {
    public String clearDigits(String s) {
        final Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!stack.isEmpty() && !Character.isDigit(stack.peek())) {
                    stack.pop();
                }
            }else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }


    @Deprecated
    public String clearDigitsFromLeetCode(String s)
    {
        int len = s.length();
        StringBuilder str = new StringBuilder ();
        int i=-1;

        for(int j=0;j<len;j++)
        {
            char c = s.charAt(j);
            if(c>='a' && c<='z')
            {
                i++;
                str.append(c);
            }

            else{
                if(i>=0)
                {
                    str.deleteCharAt(i);
                    i--;
                }
            }
        }

        return str.toString();
    }
}