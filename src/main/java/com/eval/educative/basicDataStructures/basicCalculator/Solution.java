package com.eval.educative.basicDataStructures.basicCalculator;

import java.util.Stack;

public class Solution {


    public static int calculator(String expression){
        final Stack<String> stack = new Stack<>();
        int number = 0;
        int result = 0;
        char sign = ' ';

        for (char c : expression.toCharArray()) {
            switch (c) {
                case '-', '+' -> {
                    if (sign == ' '){
                        sign = c;
                        result += number;
                        number = 0;
                    } else if (sign == '+'){
                        result += number;
                        number = 0;
                        sign = c;
                    } else {
                        result -= number;
                        number = 0;
                        sign = c;
                    }
                }
                case '(' -> {
                    stack.add(String.valueOf(result));
                    stack.add(String.valueOf(sign));
                    result = 0;
                    sign = ' ';
                }
                case ')' -> {
                    if (sign != ' '){
                        if (sign == '+'){
                            result += number;
                        } else {
                            result -= number;
                        }
                    }

                    char operator = stack.pop().charAt(0);
                    int prevResult = Integer.parseInt(stack.pop());

                    if (operator == '-'){
                        result = prevResult - result;
                    } else {
                        result = prevResult + result;
                    }
                    number = 0;
                    sign = ' ';
                }
                default -> {
                    if (Character.isDigit(c)){
                        number = number * 10 + Character.getNumericValue(c);
                    }
                }
            }
        }

        if (sign != ' '){
            if (sign == '-'){
                result -= number;
            }
            else {
                result += number;
            }
        }

        return result;
    }


    @Deprecated
    public static int calculatorBroken(String expression){
        final Stack<String> stack = new Stack<>();
        int result = 0;
        int number = 0;
        char curSign = ' ';

        for (int i = 0; i < expression.toCharArray().length; i++) {
            char curChar = expression.charAt(i);

            if (Character.isDigit(curChar)){
                    number = number * 10 + Character.getNumericValue(curChar);
            } else if(curChar == '+' || curChar == '-'){
                curSign = curChar;
                stack.add(String.valueOf(number));
                number = 0;
            } else if (curChar == '('){
                stack.add(String.valueOf(number));
                stack.add(String.valueOf(curSign));
                number = 0;
                curSign = ' ';
            } else if (curChar == ')'){
                curSign = stack.pop().charAt(0);
                number = Integer.parseInt(stack.pop());
                if (curSign == '-'){
                    result = number - result;
                } else if (curSign == '+'){
                    result = number + result;
                }
                curSign = ' ';
                number = 0;
            }
        }
        return result;

    }


}
