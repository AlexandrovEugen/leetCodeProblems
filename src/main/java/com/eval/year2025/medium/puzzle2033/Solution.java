package com.eval.year2025.medium.puzzle2033;


import java.util.Arrays;

class Solution {
    public int minOperations(int[][] grid, int x) {
        final int[] flattenGrid = new int[grid.length * grid[0].length];
        int index = 0;
        int totalSum = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt % x == grid[0][0] % x) {
                    flattenGrid[index] = anInt;
                    totalSum += anInt;
                    index++;
                } else {
                    return -1;
                }
            }
        }
        Arrays.sort(flattenGrid);
        int res = Integer.MAX_VALUE;
        int prefixSum = 0;
        for (int i = 0; i < flattenGrid.length; i++) {
            int leftCost = (flattenGrid[i] * i - prefixSum) / x;
            int rightCost = (totalSum - prefixSum - flattenGrid[i] * (flattenGrid.length - i)) / x;
            res = Math.min(res, leftCost + rightCost);
            prefixSum += flattenGrid[i];
        }
        return res;
    }
}
