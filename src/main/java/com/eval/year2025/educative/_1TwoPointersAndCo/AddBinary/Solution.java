package com.eval.year2025.educative._1TwoPointersAndCo.AddBinary;

public class Solution {

    String addBinary(String s1, String s2) {
        //Iterate two strings in reverse order using ptr1, ptr2 respectively
        int ptr1 = s1.length() - 1;
        int ptr2 = s2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while(ptr1 >= 0 || ptr2 >= 0) {
            //For each iteration retrieve the corresponding digits of the two strings
            int digit1 = 0;
            int digit2 = 0;
            if (ptr1 >= 0){
                digit1 = s1.charAt(ptr1) - '0';
            }
            if (ptr2 >= 0){
                digit2 = s2.charAt(ptr2) - '0';
            }
            //Sum retrieved digits and carry. Convert sum into the binary and add it to the result. Calculate carry for the next iteration.
            int sum = digit1 + digit2;
            if (sum == 2){
                if (carry == 0){
                    sb.append(0);
                    carry = 1;
                }else {
                    sb.append(1);
                }
            }else if (sum == 1) {
                if (carry == 1){
                    sb.append(0);
                }else {
                    sb.append(1);
                }
            } else {
                if (carry == 1){
                    sb.append(1);
                    carry = 0;
                }else {
                    sb.append(0);
                }
            }
            ptr1--;
            ptr2--;
        }
        //If carry equals to 1 after the strings traversal then append it to the result.
        if(carry == 1){
            sb.append(1);
        }
        //Reverse the result and return it.
        return sb.reverse().toString();
    }

}
