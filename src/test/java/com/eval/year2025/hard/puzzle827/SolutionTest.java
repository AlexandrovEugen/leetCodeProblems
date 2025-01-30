package com.eval.year2025.hard.puzzle827;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: grid = [[1,0],[0,1]]
    Output: 3
    Explanation: Change one 0 to 1 and connect two 1s, then we get an island with area = 3.
     */
    @Test
    void example1() {
        int[][] grid ={{1,0},{0,1}};

        int res = solution.largestIsland(grid);

        assertThat(res).isEqualTo(3);
    }

    /*
    Input: grid = [[1,1],[1,0]]
    Output: 4
    Explanation: Change the 0 to 1 and make the island bigger, only one island with area = 4.
     */
    @Test
    void example2() {
        int[][] grid ={{1,1},{1,0}};

        int res = solution.largestIsland(grid);

        assertThat(res).isEqualTo(4);
    }

    /*
    Input: grid = [[1,1],[1,1]]
    Output: 4
    Explanation: Can't change any 0 to 1, only one island with area = 4.
     */
    @Test
    void example3() {
        int[][] grid ={{1,1},{1,1}};

        int res = solution.largestIsland(grid);

        assertThat(res).isEqualTo(4);
    }


    @Test
    void myExample(){
        int[][] grid = {{1, 0, 0, 0, 0},
                        {1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1}};

        int res = solution.largestIsland(grid);
        assertThat(res).isEqualTo(11);
    }
}