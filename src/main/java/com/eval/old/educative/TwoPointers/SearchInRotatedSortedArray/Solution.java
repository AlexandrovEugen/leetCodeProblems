package com.eval.old.educative.TwoPointers.SearchInRotatedSortedArray;

import java.util.List;

public class Solution {



    @Deprecated
    public static int binarySearchRotatedOld(List<Integer> nums, int target){

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
                    if (nums.get(high).compareTo(nums.get(middle)) > 0){
                        high = middle;
                    } else {
                        low = middle + 1;
                    }
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

    public static int binarySearchRotated(List<Integer> nums, int target){
        int start = 0;
        int end = nums.size() - 1;

        while (start <= end) {
            // Finding the mid using integer division
            int mid = start + (end - start) / 2;
            // Target value is present at the middle of the array
            if (nums.get(mid) == target)
                return mid;
            // start to mid is sorted
            if (nums.get(start) <= nums.get(mid)) {
                if (nums.get(start) <= target && target < nums.get(mid)) {
                    end = mid - 1; // target is within the sorted first half of the array
                } else {
                    start = mid + 1; // target is not within the sorted first half, so let’s examine the unsorted second half
                }
            }
            // mid to end is sorted
            else {
                if (nums.get(mid) < target && target <= nums.get(end))
                    start = mid + 1; // target is within the sorted second half of the array
                else
                    end = mid - 1; // target is not within the sorted second half, so let’s examine the unsorted first half
            }
        }
        return -1;
    }



}
