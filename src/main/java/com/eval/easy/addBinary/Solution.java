package com.eval.easy.addBinary;

public class Solution {

    public static String addBinary (String str1, String str2) {
        int ptr1 = str1.length() - 1;
        int ptr2 = str2.length() - 1;
        int carry = 0;
        final StringBuilder sb = new StringBuilder();
        while(ptr1 >= 0 || ptr2 >= 0){
            if (ptr1 < 0){
                if (str2.charAt(ptr2) == '1'){
                    if (carry == 0){
                        sb.append(1);
                    }else {
                        sb.append(0);
                    }
                } else {
                    if (carry == 0){
                        sb.append(0);
                    }else {
                        sb.append(1);
                        carry = 0;
                    }
                }
                ptr2--;
            } else if (ptr2 < 0) {
                if (str1.charAt(ptr1) == '1'){
                    if (carry == 0){
                        sb.append(1);
                    }else {
                        sb.append(0);
                    }
                } else {
                    if (carry == 0){
                        sb.append(0);
                    }else {
                        sb.append(1);
                        carry = 0;
                    }
                }
                ptr1--;
            } else {
                char d1 = str1.charAt(ptr1);
                char d2 = str2.charAt(ptr2);
                if (d1 == d2){
                    if (carry == 1){
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    if (d1 == '1'){
                        carry = 1;
                    } else {
                        carry = 0;
                    }
                } else {
                    if (carry == 1){
                        sb.append(0);
                    } else {
                        sb.append(1);
                    }
                }
                ptr1--;
                ptr2--;
            }
        }
        if (carry == 1){
            sb.append(1);
        }
        // Replace this placeholder return statement with your code
        return sb.reverse().toString();
    }
}

