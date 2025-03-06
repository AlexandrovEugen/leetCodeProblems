package com.eval.year2025.easy.puzzle2965;

import java.util.TreeSet;

class Solution {


    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum = 0, sqrSum = 0;
        long n = grid.length;
        long total = n * n;

        // Calculate actual sum and squared sum from grid
        for (int[] ints : grid) {
            for (int col = 0; col < n; ++col) {
                sum += ints[col];
                sqrSum += (long) ints[col] * ints[col];
            }
        }

        // Calculate differences from expected sums
        // Expected sum: n(n+1)/2, Expected square sum: n(n+1)(2n+1)/6
        long sumDiff = sum - (total * (total + 1)) / 2;
        long sqrDiff = sqrSum - (total * (total + 1) * (2 * total + 1)) / 6;

        // Using math: If x is repeated and y is missing
        // sumDiff = x - y
        // sqrDiff = x² - y²
        int repeat = (int) (sqrDiff / sumDiff + sumDiff) / 2;
        int missing = (int) (sqrDiff / sumDiff - sumDiff) / 2;

        return new int[] { repeat, missing };
    }



    @Deprecated
    public int[] findMissingAndRepeatedValuesSlow(int[][] grid) {
        int[] result = new int[2];

        TreeSet<Integer> set = new TreeSet<>();
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (set.contains(anInt)) {
                    result[0] = anInt;
                } else {
                    set.add(anInt);
                }
            }
        }
        int first = 1;
        while (set.contains(first)) {
            first++;
        }
        result[1] = first;
        return result;
    }


}