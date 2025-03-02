package com.eval.year2025.easy.puzzle2460;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int[] applyOperations(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[i] = 0;
                nums[i - 1] = 2 * nums[i - 1];
            }
        }


        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                queue.offer(i);
            }else {
                if (!queue.isEmpty()) {
                    nums[queue.poll()] = nums[i];
                    nums[i] = 0;
                    queue.offer(i);
                }
            }
        }
        return nums;
    }


    @Deprecated
    public int[] applyOperationsNotWorkingProperly(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                nums[i] = 2 * nums[i];
                nums[j] = 0;
            }
            i++;
            j++;
        }

        i = 0;
        j = nums.length - 1;

        while (i < j) {
            if (nums[i] == 0){
                if (nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }


        return nums;
    }
}