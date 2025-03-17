package com.eval.year2025.easy.puzzle2206;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> odd = new HashSet<>();

        for (int num : nums) {
            if (!odd.contains(num)) {
                odd.add(num);
            } else {
                odd.remove(num);
            }
        }
        return odd.isEmpty();
    }


    @Deprecated
    public boolean divideArrayNotOptimized(int[] nums) {
        int pairs = nums.length / 2;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int times = map.get(num);
                if (times % 2 == 0) {
                    if (count >= pairs) {
                        return false;
                    } else {
                        map.put(num, times + 1);
                        count++;
                    }
                } else {
                    map.put(num, times + 1);
                }
            } else {
                if (count >= pairs) {
                    return false;
                } else {
                    map.put(num, 1);
                    count++;
                }
            }
        }
        return true;
    }
}