package com.eval.year2025.medium.puzzle368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalSolution extends Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        List<Integer>[] dp = new ArrayList[nums.length];
        for (int i = 0; i < dp.length; i++) {
            List<Integer> integers = new ArrayList<>();
            integers.add(nums[i]);
            dp[i] = integers;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % nums[i] == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.addAll(dp[j]);
                    dp[i] = tmp.size() > res.size() ? tmp : dp[i];
                }
            }
            res = dp[i].size() < res.size() ? res : dp[i];
        }


        return res;
    }
}
