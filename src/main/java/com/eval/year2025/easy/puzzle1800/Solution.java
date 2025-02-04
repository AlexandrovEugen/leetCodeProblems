package com.eval.year2025.easy.puzzle1800;

class Solution {

    @Deprecated
    public int maxAscendingSum_MostEfficientByMemory(int[] nums) {
        int maxSum = 0;
        int currentSubarraySum = nums[0];

        // Loop through the array starting from the second element
        for (int currentIdx = 1; currentIdx < nums.length; ++currentIdx) {
            if (nums[currentIdx] <= nums[currentIdx - 1]) {
                // If the current element is not greater than the previous one,
                // update maxSum
                maxSum = Math.max(maxSum, currentSubarraySum);
                // Reset the sum for the next ascending subarray
                currentSubarraySum = 0;
            }
            currentSubarraySum += nums[currentIdx];
        }

        // Final check after the loop ends to account for the last ascending
        // subarray
        return Math.max(maxSum, currentSubarraySum);
    }



    public int maxAscendingSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = nums[0];
        int maxSum = sum;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] < nums[i+1]) {
                sum += nums[i+1];
            }else {
                sum = nums[i + 1];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}