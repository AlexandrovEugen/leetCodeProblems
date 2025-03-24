package com.eval.year2025.medium.puzzle2401;

class Solution {
    public int longestNiceSubarray(int[] nums) {
        int result = 0;
        int cur = 0;
        int l = 0;
        for(int r = 0; r < nums.length - 1; r++){
            while((cur & nums[r]) != 0){
                cur = cur ^ nums[l];
                l++;
            }
            result = Math.max(result, r - l + 1);
            cur = cur ^ nums[r];
        }
        return result;
    }
}
