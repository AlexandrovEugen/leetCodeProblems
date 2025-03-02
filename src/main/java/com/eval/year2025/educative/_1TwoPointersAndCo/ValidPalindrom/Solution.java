package com.eval.year2025.educative._1TwoPointersAndCo.ValidPalindrom;

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;


        while(left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}