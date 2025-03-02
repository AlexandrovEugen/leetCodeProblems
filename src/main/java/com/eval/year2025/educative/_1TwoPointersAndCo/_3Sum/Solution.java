package com.eval.year2025.educative._1TwoPointersAndCo._3Sum;

import java.util.*;

class Solution {




    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1, high = n - 1;
            while (low < high) {
                int total = nums[i] + nums[low] + nums[high];
                if (total < 0) {
                    low++;
                } else if (total > 0) {
                    high--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                }
            }
        }

        return result;
    }


    @Deprecated
    public List<List<Integer>> threeSumNotWorking(int[] nums) {
        //Sort the input array in the ascending order. Declare the empty list as a result.
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int num = nums[i];
            //Iterate over the input array. While iterating, if the current element is greater than zero or you have reached the end or the array,
            //terminate the iteration and return the result.
            if (num > 0) {
                break;
            }
            //If the current value in the iteration is the same as the previous value, skip the iteration.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lo = 0;
            int hi = nums.length - 1;
            //Use two pointers (low and high) for each iteration to find pairs that sum to zero along with the current element.
            while (lo < hi) {

                int sum = nums[lo] + nums[hi] + num;
                //If the sum is less than zero, move low forward. If the sum is greater than zero, move high backward.
                if (sum < 0) {
                    lo++;
                } else if (sum > 0) {
                    hi--;
                //If the sum equals zero, add the triplet to the result and adjust both pointers.
                } else {
                    result.add(Arrays.asList(nums[lo], num, nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo - 1]) {
                        lo++;
                    }
                    while (lo < hi && nums[hi] == nums[hi + 1]) {
                        hi--;
                    }
                }
            }
        }
        return result;
    }
}
