package com.eval.educative.TwoPointers.StringToIntegerAtoi;


public class Solution {

    public static int myAtoi(String s) {
        int result = 0;
        int bit = 1;
        boolean isOnlyDigitExpected = false;
        boolean shouldNegate = false;
        for (int i = 0; i < s.length(); i++){
            char token = s.charAt(i);

            if (Character.isWhitespace(token)){
                if (isOnlyDigitExpected){
                    break;
                }else {
                    continue;
                }
            }
            if (Character.isDigit(token)){
                var num = Character.getNumericValue(token);
                if (!isOnlyDigitExpected){
                    isOnlyDigitExpected = true;
                    if (num != 0) {
                        result += num;
                        bit *=10;
                    }
                }
                 else if (num != 0 || bit != 1) {
                    long tmp = (long) result * bit + num;
                    if (tmp >>> 32 != 0 ) {
                        if (shouldNegate){
                            result = Integer.MIN_VALUE;
                        } else {
                            result = Integer.MAX_VALUE;
                        }
                        shouldNegate = false;
                        break;
                    } else {
                        result = (int)tmp;
                        bit *=10;
                    }
                }
            } else {
                if (isOnlyDigitExpected){
                    break;
                }
                if (token == '+' || token == '-'){
                    isOnlyDigitExpected = true;
                    if (token == '-'){
                        shouldNegate = true;
                    }
                } else {
                    break;
                }
            }

        }

        if (shouldNegate){
            result *=-1;
        }
        // Replace this placeholder return statement with your code
        return result;
    }

}
