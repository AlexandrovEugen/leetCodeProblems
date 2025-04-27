package com.eval.year2025.easy.puzzle26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;

        int k = 1;
        while (j < nums.length) {
            if (nums[j] == nums[i]) {
                j++;
            } else {
                nums[++i] = nums[j];
                k++;
            }
        }
        return k;
    }
}
