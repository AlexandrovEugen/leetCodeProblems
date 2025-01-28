package com.eval.year2025.medium.puzzle2658;

import static java.lang.Math.max;

public class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int[][] visited = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxFish = max(maxFish, dfs(i, j, grid, visited));
            }
        }

        return maxFish;
    }

    private int dfs(int i, int j, int[][] grid, int[][] visited) {
        int res;
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j] == 1) {
            return 0;
        }
        visited[i][j] = 1;
        res = grid[i][j];
        int [][] neighbors = new int[][]{{i - 1, j}, {i + 1, j}, {i, j - 1}, {i, j + 1}};
        for (int[] neighbor : neighbors) {
            int nr = neighbor[0];
            int nc = neighbor[1];
            res += dfs(nr, nc, grid, visited);
        }
        return res;
    }
}
