package com.eval.medium.longestPalindromicSubstring;

public class Solution {

    static int maxLength;
    static String res;

    private void cSubUtil(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        if (r - l - 1 >= maxLength) {
            res = s.substring(l + 1, r);
            maxLength = r - l - 1;
        }
    }

    public String longestPalindrome(String str) {
        res = "";
        maxLength = 1;
        for (int i = 0; i < str.length(); i++) {
            cSubUtil(str, i, i);
            cSubUtil(str, i, i + 1);
        }
        return res;
    }
}
