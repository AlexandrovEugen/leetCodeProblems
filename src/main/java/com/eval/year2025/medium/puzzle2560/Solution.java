package com.eval.year2025.medium.puzzle2560;


class Solution {

    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for (int num : nums) {
            l = Math.min(num, l);
            r = Math.max(r, num);
        }

        int res = 0;
        while (l <= r) {
            int mid = (r + l) / 2;
            if (isValid(mid, nums, k)) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    private boolean isValid(int capability, int[] nums, int k) {
       int i = 0;
       int count = 0;
       while (i < nums.length) {
           if (nums[i] <= capability) {
               i+=2;
               count++;
           }else {
               i++;
           }
           if (count == k) {
               break;
           }
       }
       return count == k;
    }


    @Deprecated
    public int minCapabilityMemoryExceeded(int[] nums, int k) {
        return backtrack(0, k, nums);
    }

    private int backtrack(int i, int k, int[] nums) {
        if (i >= nums.length) {
            if (k == 1) {
                return Integer.MAX_VALUE;
            } else {
                return 0;
            }
        }
        int res1 = Math.max(nums[i], backtrack(i + 2, k - 1, nums));
        int res2 = backtrack(i + 1, k, nums);
        return Math.min(res1, res2);
    }

}