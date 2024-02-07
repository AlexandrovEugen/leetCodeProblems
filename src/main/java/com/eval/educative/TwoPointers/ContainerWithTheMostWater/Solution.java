package com.eval.educative.TwoPointers.ContainerWithTheMostWater;

public class Solution {


    public static int containerWithMostWater(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = -1;

        while (left < right){
            int volume = (right - left) * Math.min(height[left], height[right]);
            if (volume > max){
                max = volume;
            }
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }


        // Replace this placeholder return statement with your code
        return max;
    }
}
