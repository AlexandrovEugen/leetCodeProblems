package com.eval.medium.numberOfIslands;

public class Solution {

    public int numIslands(char [][] grid){
        int numberOfIslands = 0;
        if (grid.length == 0) return numberOfIslands;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1'){
                    markIsland(grid, i, j);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }

    private void markIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '2';
        markIsland(grid, i -1, j);
        markIsland(grid, i + 1, j);
        markIsland(grid, i, j -1);
        markIsland(grid, i, j + 1);
    }

}
