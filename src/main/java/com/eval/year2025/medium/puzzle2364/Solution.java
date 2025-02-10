package com.eval.year2025.medium.puzzle2364;

import java.util.HashMap;
import java.util.Map;

class Solution {

    @Deprecated
    public long countBadPairsTimeExceed(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            while (j != i){
                if (!(j - i == nums[j] - nums[i])){
                    result++;
                }
                j--;
            }
        }
        return result;
    }


    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long) n * (n - 1) / 2;
        Map<Integer,Integer> freq = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int key = nums[i]  - i;
            goodPairs += freq.getOrDefault(key,0);
            freq.put(key,freq.getOrDefault(key,0) + 1);
        }
        return totalPairs - goodPairs;
    }
}