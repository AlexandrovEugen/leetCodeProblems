package com.eval.year2025.educative._1TwoPointersAndCo.ProductOfArrayExceptSelf;

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int productL = 1;
        int productR = 1;
        int[] products = new int[nums.length];
        Arrays.fill(products, 1);
        while (left < nums.length && right >= 0) {
            products[left] *= productL;
            products[right] *= productR;
            productL *= nums[left];
            productR *= nums[right];
            left++;
            right--;
        }
        return products;
    }
}
