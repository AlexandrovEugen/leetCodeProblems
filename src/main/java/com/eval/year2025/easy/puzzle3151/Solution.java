package com.eval.year2025.easy.puzzle3151;

class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        for (int i = 1; i < nums.length ; i++) {
          int prev = nums[i - 1];
          int cur = nums[i];
          if ((cur % 2 == 0 && prev % 2 == 1) || (cur % 2 == 1 && prev % 2 == 0) ) {
              continue;
          }
          return false;
        }
        return true;
    }
}