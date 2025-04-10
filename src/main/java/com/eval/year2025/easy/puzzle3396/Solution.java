package com.eval.year2025.easy.puzzle3396;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
                return i/3 + 1;
            } else {
                seen.add(nums[i]);
            }
        }
        return 0;
    }
}
