package com.eval.year2025.educative._1TwoPointersAndCo.TrappingRainWater;

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int storedWater = 0;
        int leftMax = 0;
        int rightMax = 0;

        while(left <= right){

            if(leftMax <= rightMax){
                storedWater += Math.max(0, leftMax - height[left]);
                leftMax = Math.max(leftMax, height[left]);
                left++;
            } else {
                storedWater += Math.max(0, rightMax - height[right]);
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }
        }



        return storedWater;
    }
}
