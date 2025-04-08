package com.eval.year2025.easy.puzzle2873;


class Solution {


    //O(n^2)
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        int left = nums[0];
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > left) {
                left = nums[j];
                continue;
            }
            for (int k = j + 1; k < nums.length; k++) {
                result = Math.max(result, (long) (left - nums[j]) * nums[k]);
            }
        }
        return result;
    }

    // O(n^3)
    @Deprecated
    public long maximumTripletValueToSlow(int[] nums) {
        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    result = Math.max(result, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }

        return result;
    }
}
