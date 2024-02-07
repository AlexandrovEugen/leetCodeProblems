package com.eval.educative.TwoPointers.SearchInRotatedSortedArray;

import java.util.List;

public class Solution {



    public static int binarySearchRotated(List<Integer> nums, int target){

        int low = 0;
        int high = nums.size() -1;
        int middle;

        while (low <= high) {

            middle = (high + low)/2;
            if (nums.get(middle).equals(target)){
                return middle;
            }
            if (low == high) return  -1;

            if (nums.get(middle).compareTo(target) < 0){
                if (nums.get(high).compareTo(target) >= 0){
                    low = middle + 1;
                } else {
                    high = middle;
                }
            } else {
                if (nums.get(low).compareTo(target) <= 0){
                    high = middle;
                } else {
                    if (nums.get(low).compareTo(nums.get(middle)) > 0){
                        high = middle;
                    } else {
                        low = middle + 1;
                    }
                }
            }
        }

        return -1;
    }



}
