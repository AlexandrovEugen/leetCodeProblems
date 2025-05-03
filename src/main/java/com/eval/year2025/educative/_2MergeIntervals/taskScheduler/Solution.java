package com.eval.year2025.educative._2MergeIntervals.taskScheduler;


import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int[26];
        for (char task : tasks) {
            frequencies[task - 'A']++;
        }

        frequencies = Arrays.stream(frequencies)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int maxGap = frequencies[0] - 1;

        int idleSlots = maxGap * n;

        for (int i = 1; i < frequencies.length; i++) {
            idleSlots -= Math.min(frequencies[i], maxGap);
        }

        idleSlots = Math.max(0, idleSlots);

        return idleSlots + tasks.length;
    }
}
