package com.eval.year2025.medium.puzzle3356;


import java.util.TreeSet;

class Solution {


    public int minZeroArray(int[] nums, int[][] queries) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum == 0) {
            return 0;
        }
        int k = 0;
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int val = query[2];
            while (l <= r) {
                if (nums[l] > 0) {
                    totalSum -= Math.min(nums[l], val);
                    int sub = Math.max(0, nums[l] - val);
                    nums[l] = sub;
                }
                l++;
            }
            k++;
            if (totalSum == 0) {
                return k;
            }
        }
        return -1;
    }


    @Deprecated
    public int minZeroArraySlow(int[] nums, int[][] queries) {
        TreeSet<Integer> nonZeros = new TreeSet<>();

        // Initialize TreeSet with non-zero indices
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeros.add(i);
            }
        }

        if (nonZeros.isEmpty()) {
            return 0;
        }

        int k = 0;
        for (int[] query : queries) {
            int l = query[0], r = query[1], val = query[2];

            var it = nonZeros.subSet(l, true, r, true).iterator();
            while (it.hasNext()) {
                int i = it.next();
                nums[i] = Math.max(0, nums[i] - val);
                if (nums[i] == 0) {
                    it.remove(); // Remove from TreeSet
                }
            }

            k++;
            if (nonZeros.isEmpty()) {
                return k;
            }
        }

        return -1;
    }
}
