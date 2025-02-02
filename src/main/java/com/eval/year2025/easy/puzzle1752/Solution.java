package com.eval.year2025.easy.puzzle1752;

class Solution {


    public boolean check(int[] nums) {

        int count = 1;

        for (int i = 1; i < nums.length * 2; i++) {
            if (nums[(i - 1) % nums.length] <= nums[i % nums.length]) {
                count++;
            } else {
                count = 1;
            }

            if (count == nums.length) {
                return true;
            }
        }

        return nums.length == 1;
    }




    /*
    This is the last one I tried to solve with myself.
    The next one is going to be the one from the video
     */
    @Deprecated
    public boolean checkLastMame(int[] nums){
        if (nums == null || nums.length == 0 || nums.length == 1 || nums.length  == 2) {
            return true;
        }
        int i = 0;
        int j = nums.length - 1;
        boolean iGo = true;
        boolean jGo = true;

        while (i < j){
            if (nums[i] <= nums[i + 1] && nums[j] >= nums[j - 1]){
                i++;
                j--;
                continue;
            }
            if (nums[i] > nums[i + 1] && nums[j] >= nums[j - 1]){
                if (nums[i] < nums[j]){
                    return false;
                } else {
                    iGo = false;
                }
            }
            if (nums[j] < nums[j - 1]){
                if (nums[j] > nums[i]){
                    return false;
                } else {
                    jGo = false;
                }
            }
            if (!(jGo || iGo)){
                return false;
            }
            if (iGo){
                i++;
            }
            if (jGo){
                j--;
            }
            if (i + 1 >= j - 1) {
                return true;
            }
        }
        return true;
    }


    @Deprecated
    public boolean checkWrongAnswer5Failed(int[] nums){
        if (nums == null || nums.length == 0 || nums.length == 1 || nums.length  == 2) {
            return true;
        }
        int i = 0;
        int j = nums.length - 1;
        boolean iGo = true;
        boolean jGo = true;

        while (i < j){
            if (nums[i] <= nums[i + 1]){
                i++;
            } else {
                iGo = false;
                if (nums[i] < nums[j]){
                    return false;
                }
            }
            if (nums[j] >= nums[j -1]){
                j--;
            } else {
                jGo = false;
                if (nums[j] > nums[i]){
                    return false;
                }
            }
            if (i + 1 == j - 1) {
                return true;
            }
            if (!(jGo || iGo)){
                return false;
            }
        }
        return true;
    }


    @Deprecated
    public boolean checkWrongAnswer4Failed(int[] nums){
        if (nums == null || nums.length == 0 || nums.length == 1 || nums.length  == 2) {
            return true;
        }
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] <= nums[i + 1] && nums[j] >= nums[j -1]){
                i++;
                j--;
            }
            else if (nums[i] > nums[i+1]){
                if (nums[i] >= nums[nums.length - 1]){
                    i++;
                } else {
                    return false;
                }
            }
            else if (nums[j] < nums[j -1]){
                if (nums[j - 1] > nums[nums.length - 1]){
                    j--;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }


    @Deprecated
    public boolean checkNotWorking(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return true;
        }
        if (nums.length == 2) {
            return true;
        }

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] <= nums[i+1] && nums[j] >= nums[j-1]) {
                i++;
                j--;
            }
            else if (nums[i] > nums[i+1]) {
                j--;
            }
            else if (nums[j] < nums[j -1]){
                i++;
            }
            else if (i + 1 == j -1){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}