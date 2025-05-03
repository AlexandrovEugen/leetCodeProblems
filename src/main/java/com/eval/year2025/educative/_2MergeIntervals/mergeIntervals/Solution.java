package com.eval.year2025.educative._2MergeIntervals.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeIntervals(int[][] intervals) {
        // Replace this placeholder return statement with your code
        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int lastI = mergedIntervals.size() - 1;
            final int[] prev = mergedIntervals.get(lastI);
            final int[] curr = intervals[i];

            if (prev[1] >= curr[0]) {
                mergedIntervals.set(lastI, new int[]{prev[0], Math.max(curr[1], prev[1])});
            } else {
                mergedIntervals.add(curr);
            }
        }


        int size = mergedIntervals.size();
        int[][] res = new int[size][2];
        for (int i = 0; i < size; i++) {
            res[i] = mergedIntervals.get(i);
        }
        return res;
    }
}
