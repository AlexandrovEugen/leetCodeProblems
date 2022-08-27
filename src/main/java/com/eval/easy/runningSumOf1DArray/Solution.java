package com.eval.easy.runningSumOf1DArray;

public class Solution {

    public int [] runningSum(int [] nums){
        for (int i = 1; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < i + 1; j++) {
                sum += nums[j];
            }
            nums[i] = sum + nums[i-1];
        }
        return nums;
    }

}
