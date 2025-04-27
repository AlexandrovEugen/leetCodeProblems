package com.eval.year2025.educative._1TwoPointersAndCo.CircularArrayLoop;

class Solution {
    public boolean circularArrayLoop(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int slow = i;
            int fast = i;

            boolean forward = nums[i] > 0;

            while (true) {
                slow = nextStep(nums, slow);

                if (hasNoCycle(nums, slow, forward)) {
                    break;
                }

                fast = nextStep(nums, fast);

                if (hasNoCycle(nums, fast, forward)) {
                    break;
                }

                fast = nextStep(nums, fast);

                if (hasNoCycle(nums, fast, forward)) {
                    break;
                }

                if (fast == slow) return true;
            }

        }

        return false;
    }

    private static boolean hasNoCycle(int[] nums, int pointer, boolean prevDirection) {
        boolean currentDirection = nums[pointer] > 0;

        return prevDirection != currentDirection || nums[pointer] % nums.length == 0;
    }

    private static int nextStep(int[] nums, int step) {
        int result = (nums[step] + step) % nums.length;
        return result < 0 ? nums.length + result : result;
    }
}
