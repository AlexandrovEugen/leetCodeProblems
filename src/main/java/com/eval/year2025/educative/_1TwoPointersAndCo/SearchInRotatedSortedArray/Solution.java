package com.eval.year2025.educative._1TwoPointersAndCo.SearchInRotatedSortedArray;

class Solution {
    public int search(int[] nums, int target) {

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int middle = lo + (hi - lo) / 2;

            if (nums[middle] == target) {
                return middle;
            }
            //lo - middle - sorted
            if (nums[lo] <= nums[middle]) {
                if (target >= nums[lo] && target < nums[middle]) {
                    hi = middle - 1;
                } else {
                    lo = middle + 1;
                }
            } else {
                if (target >= nums[middle] && target <= nums[hi]) {
                    lo = middle + 1;
                } else {
                    hi = middle - 1;
                }
            }
        }
        return -1;
    }


}