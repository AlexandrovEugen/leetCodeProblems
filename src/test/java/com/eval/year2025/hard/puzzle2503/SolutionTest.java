package com.eval.year2025.hard.puzzle2503;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: grid = [[1,2,3],[2,5,7],[3,5,1]], queries = [5,6,2]
    Output: [5,8,1]
    Explanation: The diagrams above show which cells we visit to get points for each query.
    */
    @Test
    void example1(){
        int[][] grid = {{1,2,3}, {2,5,7}, {3,5,1}};
        int[] queries = {5,6,2};

        int[] res = solution.maxPoints(grid, queries);

        assertThat(res).containsExactly(5,8,1);
    }


    /*
    Input: grid = [[5,2,1],[1,1,2]], queries = [3]
    Output: [0]
    Explanation: We can not get any points because the value of the top left cell is already greater than or equal to 3.
    */
    @Test
    void example2(){
        int[][] grid = {{5,2,1}, {1,1,2}};
        int[] queries = {3};

        int[] res = solution.maxPoints(grid, queries);

        assertThat(res).containsExactly(0);
    }


}