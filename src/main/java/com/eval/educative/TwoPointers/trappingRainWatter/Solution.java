package com.eval.educative.TwoPointers.trappingRainWatter;

public class Solution {

    public static int rainWater(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int storedWater = 0;
        int rMax = 0;
        int lMax = 0;

        while (left <= right){
            if (lMax <= right){
                storedWater += Math.max(0, lMax - heights[left]);
                lMax = Math.max(lMax, heights[left]);
                left++;
            } else {
                storedWater += Math.max(0, rMax - heights[right]);
                rMax = Math.max(rMax, heights[right]);
                right--;
            }
        }
        // Replace this placeholder return statement with your code
        return storedWater;
    }

}
