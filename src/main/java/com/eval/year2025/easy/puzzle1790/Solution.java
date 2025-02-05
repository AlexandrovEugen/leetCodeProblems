package com.eval.year2025.easy.puzzle1790;


class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int mismatchCount = 0;
        char s1FirstsMismatch = '1';
        char s2FirstsMismatch = '2';
        char s1SecondMismatch = '3';
        char s2SecondMismatch = '4';

        for(int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                mismatchCount++;
                if (mismatchCount >2) return false;
                if (mismatchCount == 1) {
                    s1FirstsMismatch = s1.charAt(i);
                    s2FirstsMismatch = s2.charAt(i);
                }
                if (mismatchCount == 2) {
                    s1SecondMismatch = s1.charAt(i);
                    s2SecondMismatch = s2.charAt(i);
                }
            }
        }
        if (mismatchCount == 0) return true;

        return (s1FirstsMismatch == s2SecondMismatch) && (s2FirstsMismatch == s1SecondMismatch);
    }
}