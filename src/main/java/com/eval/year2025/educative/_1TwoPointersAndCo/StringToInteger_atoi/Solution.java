package com.eval.year2025.educative._1TwoPointersAndCo.StringToInteger_atoi;

public class Solution {

    public int myAtoi(String s) {
        //Remove any leading whitespaces before s or simple ignore
        int sign = 1;
        boolean digitEncounteredOrSign = false;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            //Next, check the leading sign + or - sign. Store -1 in the value sign
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (digitEncounteredOrSign) {
                    return result * sign;
                }
                continue;
            }
            if (ch == '-') {
                if (digitEncounteredOrSign) {
                    return result * sign;
                }
                digitEncounteredOrSign = true;
                sign *= -1;
                continue;
            }

            if (ch == '+') {
                if (digitEncounteredOrSign) {
                    return result * sign;
                }
                digitEncounteredOrSign = true;
                continue;
            }
            if (!Character.isDigit(ch)) {
                return result * sign;
            }
            if (Character.isDigit(ch)) {
                //While collecting digits, keep checking for the integer overflow.
                //If the result goes beyond  of 32-bite integers, return max of min value whithin
                //the  limit
                digitEncounteredOrSign = true;
                long tmp = result * 10L + (ch - '0');
                if (tmp > Integer.MAX_VALUE) {
                    if (sign > 0) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    result = result * 10 + ch - '0';
                }
            }
        }
        return result * sign;
    }
}
