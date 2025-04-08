package com.eval.year2025.medium.puzzle416;


import java.util.HashSet;
import java.util.Set;

class Solution {



    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) return false;
        Set<Integer> dp = new HashSet<>();
        dp.add(0);

        for (int i = nums.length - 1; i >= 0; i--) {
            Set<Integer> temp = new HashSet<>();
            for (Integer t : dp) {
                if (t + nums[i] == sum/2) return true;
                temp.add(t + nums[i]);
                temp.add(t);
            }
            dp = temp;
        }

        return dp.contains(sum/2);
    }




    @Deprecated
    public boolean canPartitionTimeExceed(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) return false;

        return backtrack(0, sum / 2, nums);
    }

    private boolean backtrack(int i, int target, int[] nums) {
        if (i == nums.length) return false;
        if (target == 0) {
            return true;
        }

        return backtrack(i + 1, target - nums[i], nums) || backtrack(i + 1, target, nums);
    }
}