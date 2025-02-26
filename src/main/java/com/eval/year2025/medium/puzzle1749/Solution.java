package com.eval.year2025.medium.puzzle1749;

import static java.lang.Math.*;

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curSum = 0;
        int prefixMax = 0;
        int prefixMin = 0;
        int result = 0;

        for (int num : nums) {
            curSum += num;
            int subMin = curSum - prefixMin;
            int subMax = curSum - prefixMax;
            int tmp = max(abs(subMin), abs(subMax));
            result = max(result, tmp);
            prefixMax = max(curSum, prefixMax);
            prefixMin = min(curSum, prefixMin);
        }
        return result;
    }
}