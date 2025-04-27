package com.eval.year2025.easy.puzzle2843;

class Solution {


    @Deprecated
    public int countSymmetricIntegersMine(int low, int high) {
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


    /*
    From leetCode editorial
     */
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int a = low; a <= high; ++a) {
            if (a < 100 && a % 11 == 0) {
                res++;
            } else if (1000 <= a && a < 10000) {
                int left = a / 1000 + (a % 1000) / 100;
                int right = (a % 100) / 10 + (a % 10);
                if (left == right) {
                    res++;
                }
            }
        }
        return res;
    }
}
