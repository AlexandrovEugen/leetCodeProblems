package com.eval.year2025.easy.puzzle27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        int k = 0;

        while (i <= j) {
            if (i == j) {
                if (nums[i] != val) {
                    return ++k;
                } return k;
            } else {
                if (nums[i] == val) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        k++;
                        i++;
                    }
                    j--;
                } else {
                    i++;
                    k++;
                }
            }

        }

        return k;
    }
}
