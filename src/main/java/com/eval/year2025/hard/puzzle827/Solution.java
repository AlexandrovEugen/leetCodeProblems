package com.eval.year2025.hard.puzzle827;


import java.util.*;

class Solution {

    private final Map<Integer, Integer> hashMap = new HashMap<>();

    public int largestIsland(int[][] grid) {
        // Mark all islands.
        int mark = 2;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    hashMap.put(mark, dfs(i, j, grid, mark));
                    mark++;
                }
            }
        }

        //Try flip every water
        int result = hashMap.values().stream().max(Integer::compareTo).orElse(0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 0) {
                    result = Math.max(result, connect(i, j, grid));
                }
            }
        }
        return result;
    }



    private int dfs(int i, int j, int[][] grid, int mark) {
        int res = 0;
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != 1) {
            return res;
        }
        res += grid[i][j];
        grid[i][j] = mark;
        int [][] neighbors = new int[][]{{i - 1, j}, {i + 1, j}, {i, j - 1}, {i, j + 1}};
        for (int[] neighbor : neighbors) {
            int nr = neighbor[0];
            int nc = neighbor[1];
            res += dfs(nr, nc, grid, mark);
        }
        return res;
    }

    private int connect(int i, int j, int[][] grid) {
        final Set<Integer> visited = new HashSet<>();
        visited.add(0);
        int res = 0;

        int [][] neighbors = new int[][]{{i - 1, j}, {i + 1, j}, {i, j - 1}, {i, j + 1}};
        for (int[] neighbor : neighbors) {
            int nr = neighbor[0];
            int nc = neighbor[1];
            if ((nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[nr].length) && !visited.contains(grid[nr][nc])) {
                    res += hashMap.get(grid[nr][nc]);
                    visited.add(grid[nr][nc]);
            }
        }
        return res + 1;
    }

}