package com.eval.year2025.easy.puzzle3105;

class Solution {

    /*
    Fastest solution from LeetCode.
     */
    public int longestMonotonicSubarray(int[] nums) {
            int incLength = 1;
            int decLength = 1;
            int maxLength = 1;

            for(int pos = 0; pos < nums.length - 1; pos++) {
                if(nums[pos + 1] > nums[pos]) {
                    incLength++;
                    decLength = 1;
                } else if(nums[pos + 1] < nums[pos]) {
                    decLength++;
                    incLength = 1;
                } else {
                    incLength = 1;
                    decLength = 1;
                }
                maxLength = Math.max(maxLength, Math.max(incLength, decLength));
            }
            return maxLength;
    }


    @Deprecated
    public int longestMonotonicSubarrayMine(int[] nums) {
        int maxResult = 1;
        int result = 1;

        int isGreater = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                if (isGreater == -1) {
                    isGreater = 1;
                    result++;
                } else {
                    if (isGreater == 0) {
                        isGreater = 1;
                        maxResult = Math.max(maxResult, result);
                        result = 2;
                    } else {
                        result++;
                    }
                }
            }else if(nums[i] > nums[i + 1]) {
                if (isGreater == -1){
                    isGreater = 0;
                    result++;
                } else {
                    if (isGreater == 1) {
                        isGreater = 0;
                        maxResult = Math.max(maxResult, result);
                        result = 2;
                    } else {
                        result++;
                    }
                }
            } else {
                maxResult = Math.max(maxResult, result);
                result = 1;
                isGreater = -1;
            }
        }

        return Math.max(maxResult, result);
    }
}