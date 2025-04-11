package com.eval.year2025.easy.pazzle2843;

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;

        for (int i = low; i <= high; i++) {
            String string = Integer.toString(i);
            if(string.length() % 2 != 0) { continue; }
            int start = 0;
            int end = string.length() - 1;
            int leftHalf = 0;
            int rightHalf = 0;
            while (start < end) {
                leftHalf+= string.charAt(start++) - '0';
                rightHalf+= string.charAt(end--) - '0';
            }
            if (leftHalf == rightHalf && leftHalf != 0) {
                result++;
            }
        }

        return result;
    }
}
