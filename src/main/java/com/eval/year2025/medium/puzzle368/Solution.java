package com.eval.year2025.medium.puzzle368;

import java.util.*;

class Solution {

    private final Map<Tuple, List<Integer>> cache = new HashMap<>();

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        return backtrack(new Tuple(0, 1), nums);
    }

    private List<Integer> backtrack(Tuple tuple, int[] nums) {
        int index = tuple.index;
        int prevValue = tuple.prevValue;
        if (index == nums.length) {
            return Collections.emptyList();
        }
        if (cache.containsKey(tuple)) {
            return cache.get(tuple);
        }

        List<Integer> res = backtrack(new Tuple(index + 1, prevValue), nums);

        if (nums[index] % prevValue == 0) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(nums[index]);
            tmp.addAll(backtrack(new Tuple(index + 1, nums[index]), nums));
            res = tmp.size() > res.size() ? tmp : res;
        }
        cache.put(tuple, res);
        return res;
    }

    private record Tuple(int index, int prevValue) {
    }
}
