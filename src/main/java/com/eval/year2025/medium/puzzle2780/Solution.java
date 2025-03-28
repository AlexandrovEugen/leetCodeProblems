package com.eval.year2025.medium.puzzle2780;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {

    public int minimumIndex(List<Integer> nums) {
        int count = 0;
        int majority = 0;
        for (Integer num : nums) {
            if (count == 0) {
                majority = num;
                count++;
            } else if (majority == num) {
                count++;
            } else {
                count--;
            }
        }

        final int num = majority;
        long rightCount = nums.stream().filter(i -> i == num).count();
        int leftCount = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == num) {
                leftCount++;
                rightCount--;
            }

            int leftLen = i + 1;
            int rightLen = nums.size() - i - 1;

            if (2 * leftCount > leftLen && 2 * rightCount > rightLen) {
                return i;
            }
        }

        return -1;
    }


    @Deprecated
    public int minimumIndexWithHashMap(List<Integer> nums) {
        final Map<Integer, Long> rightSplit = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final Map<Integer, Long> leftSplit = new HashMap<>();


        for (int i = 0; i < nums.size(); i++) {
            rightSplit.put(nums.get(i), rightSplit.get(nums.get(i)) - 1);
            leftSplit.put(nums.get(i), leftSplit.getOrDefault(nums.get(i), 0L) + 1);

            int leftLen = i + 1;
            int rightLen = nums.size() - i - 1;

            if (2 * leftSplit.getOrDefault(nums.get(i), 0L) > leftLen && 2 * rightSplit.get(nums.get(i)) > rightLen) {
                return i;
            }
        }

        return -1;
    }
}
