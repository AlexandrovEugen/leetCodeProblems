//package com.eval.year2025.hard.puzzle1092;
//
//public class SolutionDP extends Solution {
//
//
//    @Override
//    public String shortestCommonSupersequence(String str1, String str2) {
//        int n = str1.length();
//        int m = str2.length();
//        String [] prev = new String[m];
//        for(int j = 0; j < m; j++) {
//            prev[j] = String.valueOf(str2.charAt(j));
//        }
//        prev[m - 1] = "";
//
//        String[] curr = new String[m + 1];
//        for (int i = 0; i < m; i++) {
//            curr[i] = "";
//        }
//        for (int i = n; i > 0; i--) {
//            curr[i] =
//            for (int j = m; j > 0; j--) {
//                prev = curr;
//            }
//            return curr[0];
//        }
//    }
//
//}
