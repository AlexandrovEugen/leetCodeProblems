package com.eval.year2025.easy.puzzle3375;

import java.util.Arrays;


class Solution {

    public int minOperations(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) return -1;
            if (nums[i] > k) {
                boolean found = false;
                for (int j = 0; j < i; j++) {
                    if (nums[j] == nums[i]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    res++;
                }
            }
        }
        return res;
    }


    //N(log(N))
    @Deprecated
    public int minOperationsWithSort(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        if (nums[0] < k) return -1;
        int prev = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != prev) {
                prev = nums[i];
                res++;
            }
        }

        return prev != k ? res + 1 : res;
    }
}
