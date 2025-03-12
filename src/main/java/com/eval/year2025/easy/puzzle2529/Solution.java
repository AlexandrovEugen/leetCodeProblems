package com.eval.year2025.easy.puzzle2529;

class Solution {
    public int maximumCount(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int negCount = 0;
        int posCount = 0;

        while (l <= r && (nums[l] < 0 || nums[r] > 0)) {
            if (nums[r] > 0) {
                posCount++;
                r--;
            }
            if (nums[l] < 0) {
                negCount++;
                l++;
            }
        }
        return Math.max(posCount, negCount);
    }
}