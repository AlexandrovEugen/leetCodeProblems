package com.eval.year2025.medium.puzzle3394;


import java.util.Comparator;
import java.util.TreeSet;

class Solution {
    @SuppressWarnings("unused")
    public boolean checkValidCuts(int n, int[][] rectangles) {
        TreeSet<int[]> x = new TreeSet<>(Comparator.comparing(a -> a[0]));
        TreeSet<int[]> y = new TreeSet<>(Comparator.comparing(a -> a[0]));

        for (int[] rectangle : rectangles) {
            x.add(new int[]{rectangle[0], rectangle[2]});
            y.add(new int[]{rectangle[1], rectangle[3]});
        }

        return Math.max(nonOverlappingIntervals(x), nonOverlappingIntervals(y)) >= 3;
    }

    private int nonOverlappingIntervals(TreeSet<int[]> intervals) {
        int count = 0;
        int prev_end = -1;
        while (!intervals.isEmpty()){
            int[] interval = intervals.pollFirst();
            int start = interval[0];
            int end = interval[1];
            if (prev_end <= start) {
                count++;
            }
            prev_end = Math.max(end, prev_end);
        }
        return count;
    }
}
