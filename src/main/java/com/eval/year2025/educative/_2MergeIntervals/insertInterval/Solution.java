package com.eval.year2025.educative._2MergeIntervals.insertInterval;

import java.util.*;

class Solution {


    public int[][] insertInterval(int[][] existingIntervals, int[] newInterval) {
        final List<int[]> res = new ArrayList<>();

        int n = existingIntervals.length;
        int i = 0;

        int ns = newInterval[0];
        int ne;

        while (i < n && existingIntervals[i][1] < ns) {
            res.add(existingIntervals[i++]);
        }

        res.add(newInterval);

        for (; i < existingIntervals.length; i++) {
            final int[] interval = existingIntervals[i];

            int lastIndex = res.size() - 1;

            ns = res.get(lastIndex)[0];
            ne = res.get(lastIndex)[1];

            int os = interval[0];
            int oe = interval[1];

            if (ns <= os && ne >= oe) continue;

            if (oe <= ns || os <= ne) {
                res.set(lastIndex, new int[]{Math.min(ns, os), Math.max(ne, oe)});
            } else {
                res.add(interval);
            }
        }

        return res.toArray(new int[0][0]);
    }
}
