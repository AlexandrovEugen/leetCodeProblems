package com.eval.year2025.medium.puzzle1976;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: n = 7, roads = [[0,6,7],[0,1,2],[1,2,3],[1,3,3],[6,3,3],[3,5,1],[6,5,1],[2,5,1],[0,4,5],[4,6,2]]
    Output: 4
    Explanation: The shortest amount of time it takes to go from intersection 0 to intersection 6 is 7 minutes.
    The four ways to get there in 7 minutes are:
            - 0 ➝ 6
            - 0 ➝ 4 ➝ 6
            - 0 ➝ 1 ➝ 2 ➝ 5 ➝ 6
            - 0 ➝ 1 ➝ 3 ➝ 5 ➝ 6
    */
    @Test
    void example1() {
        int n = 7;
        int[][] roads = {{0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}};

        int res = solution.countPaths(n, roads);

        assertThat(res).isEqualTo(4);

    }

    /*
    Input: n = 2, roads = [[1,0,10]]
    Output: 1
    Explanation: There is only one way to go from intersection 0 to intersection 1, and it takes 10 minutes.
    */
    @Test
    void example2() {
        int n = 2;
        int[][] roads = {{1, 0, 10}};

        int res = solution.countPaths(n, roads);

        assertThat(res).isEqualTo(1);

    }
}