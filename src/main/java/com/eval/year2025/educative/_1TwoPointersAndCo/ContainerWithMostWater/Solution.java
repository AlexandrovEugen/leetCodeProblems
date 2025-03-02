package com.eval.year2025.educative._1TwoPointersAndCo.ContainerWithMostWater;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int area = h * (right - left);
            maxArea = Math.max(maxArea, area);
            while (left< right && height[left] <= h) left++;
            while (left < right && height[right] <= h) right--;
        }


        return maxArea;
    }
}
