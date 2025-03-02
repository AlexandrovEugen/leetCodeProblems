package com.eval.year2025.hard.puzzle1092;


import java.util.HashMap;
import java.util.Map;

class Solution {

    private final Map<int[], String> map = new HashMap<>();

    public String shortestCommonSupersequence(String str1, String str2) {
        return backtrackMemoryExceeded(0, 0, str1, str2);
    }



    private String backtrackMemoryExceeded(int i, int j, String str1, String str2) {
        int[] key = {i, j};
        if(map.containsKey(key)) {
            return map.get(key);
        }
        if (i == str1.length()){
            return str2.substring(j);
        }
        if (j == str2.length()){
            return str1.substring(i);
        }
        if (str1.charAt(i) == str2.charAt(j)){
            return str1.charAt(i) + backtrackTimeExceeded(i + 1, j + 1, str1, str2);
        } else {
            var first = str1.charAt(i) + backtrackTimeExceeded(i + 1, j, str1, str2);
            var second = str2.charAt(j) + backtrackTimeExceeded(i, j + 1, str1, str2);
            if (first.length() > second.length()) {
                map.put(key, first);
                return second;
            } else {
                map.put(key, second);
                return first;
            }
        }
    }


    @Deprecated
    private String backtrackTimeExceeded(int i, int j, String str1, String str2) {
        if (i == str1.length()){
            return str2.substring(j);
        }
        if (j == str2.length()){
            return str1.substring(i);
        }
        if (str1.charAt(i) == str2.charAt(j)){
            return str1.charAt(i) + backtrackTimeExceeded(i + 1, j + 1, str1, str2);
        } else {
            var first = str1.charAt(i) + backtrackTimeExceeded(i + 1, j, str1, str2);
            var second = str2.charAt(j) + backtrackTimeExceeded(i, j + 1, str1, str2);
            if (first.length() > second.length()) {
                return second;
            } else {
                return first;
            }
        }
    }
}