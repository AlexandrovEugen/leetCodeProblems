package com.eval.educative.TwoPointers.sumOfTreeValues;

import java.util.Arrays;

public class Solution {

    public static boolean findSumOfThree(int[] nums, int target) {
        Arrays.sort(nums);
        int low, high, triplet;

        for (int i = 0; i < nums.length; i++) {
            low = i + 1;
            high = nums.length -1;

            while (low < high){
                triplet = nums[i] + nums[low] + nums[high];

                if (triplet == target) return true;
                else if (triplet < target) {
                    low++;
                }else {
                    high--;
                }
            }
        }

        return false;
    }

}
