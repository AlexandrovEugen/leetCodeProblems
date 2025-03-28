package com.eval.year2025.medium.puzzle2033;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();




    /*
    Input: grid = [[2,4],[6,8]], x = 2
    Output: 4
    Explanation: We can make every element equal to 4 by doing the following:
    - Add x to 2 once.
    - Subtract x from 6 once.
    - Subtract x from 8 twice.
    A total of 4 operations were used.
     */
    @Test
    void example1(){
        int[][] grid = {{2,4},{6,8}};
        int x = 2;

        int res = solution.minOperations(grid, x);


        assertThat(res).isEqualTo(4);
    }


    /*
    Input: grid = [[1,5],[2,3]], x = 1
    Output: 5
    Explanation: We can make every element equal to 3.
    */
    @Test
    void example2(){
        int[][] grid = {{1,5},{2,3}};
        int x = 1;

        int res = solution.minOperations(grid, x);


        assertThat(res).isEqualTo(5);
    }

    /*
    Input: grid = [[1,2],[3,4]], x = 2
    Output: -1
    Explanation: It is impossible to make every element equal.
    */
    @Test
    void example3(){
        int[][] grid = {{1,2},{3,4}};
        int x = 2;

        int res = solution.minOperations(grid, x);


        assertThat(res).isEqualTo(-1);
    }

    @Test
    void example4(){
        int[][] grid = {{529,529,989},{989,529,345},{989,805,69}};
        int x = 92;
        int res = solution.minOperations(grid, x);
        assertThat(res).isEqualTo(25);
    }

}