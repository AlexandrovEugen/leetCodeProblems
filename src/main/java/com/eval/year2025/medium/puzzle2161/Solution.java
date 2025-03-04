package com.eval.year2025.medium.puzzle2161;

class Solution {


    public int[] pivotArray(int[] nums, int pivot) {

        int[] result = new int[nums.length];

        int i = 0, j = nums.length - 1;
        int i1 = 0, j1 = nums.length - 1;

        while (i < nums.length) {
            if (nums[i] < pivot) {
                result[i1] = nums[i];
                i1++;
            }
            if (nums[j] > pivot) {
                result[j1] = nums[j];
                j1--;
            }
            i++;
            j--;
        }
        while (i1 <= j1) {
            result[i1] = pivot;
            i1++;
        }
        return result;
    }
}
