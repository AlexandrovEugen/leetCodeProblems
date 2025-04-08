package com.eval.year2025.easy.puzzle1863;

class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res | num;
        }
        return res << nums.length -1;
//        return backtrack(0, 0, nums);
    }

    @Deprecated
    private int backtrack(int i, int total, int[] nums) {
        if (i == nums.length) {
            return total;
        }

        return backtrack(i + 1, nums[i] ^ total, nums) + backtrack(i + 1, total, nums);
    }
}
