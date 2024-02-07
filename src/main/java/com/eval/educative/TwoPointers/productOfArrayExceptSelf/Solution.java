package com.eval.educative.TwoPointers.productOfArrayExceptSelf;

import java.util.Arrays;

public class Solution {

    public static int[] productExceptSelf(int[] arr) {

        int l = 0;
        int r = arr.length -1;
        int productL = 1;
        int productR = 1;
        int[] res = new int[arr.length];
        Arrays.fill(res, 1);

        while (l < arr.length && r >= 0){
            res[l] *= productL;
            res[r] *= productR;
            productL *= arr[l];
            productR *= arr[r];
            l++;
            r--;
        }


        // Replace this placeholder return statement with your code

        return res;
    }

}
