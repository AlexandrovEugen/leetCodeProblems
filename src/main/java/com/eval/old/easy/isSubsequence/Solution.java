package com.eval.old.easy.isSubsequence;

public class Solution {


    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.equals(t)) return true;
        final char[] tokens = t.toCharArray();
        int start = 0;
        for (char token : s.toCharArray()) {
            int cursor = -1;
            for (int i = start; i < tokens.length; i++) {
                if (token == tokens[i]) {
                    cursor = i;
                    start = i + 1;
                    break;
                }
            }
            if (cursor == -1) return false;
        }
        return true;
    }

}
