package com.eval.year2025.medium.puzzle3160;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    /*
    Input: limit = 4, queries = [[1,4],[2,5],[1,3],[3,4]]
    Output: [1,2,2,3]
    Explanation:
    * After query 0, ball 1 has color 4.
    * After query 1, ball 1 has color 4, and ball 2 has color 5.
    * After query 2, ball 1 has color 3, and ball 2 has color 5.
    * After query 3, ball 1 has color 3, ball 2 has color 5, and ball 3 has color 4.
    */
    @Test
    void example1(){
        int limit = 4;
        int[][] queries = {{1,4},{2,5},{1,3},{3,4}};


        int[] results = solution.queryResults(limit, queries);

        assertThat(results).containsExactlyInAnyOrder(1,2,2,3);

    }

    /*
    Input: limit = 4, queries = [[0,1],[1,2],[2,2],[3,4],[4,5]]
    Output: [1,2,2,3,4]
    Explanation:
    * After query 0, ball 0 has color 1.
    * After query 1, ball 0 has color 1, and ball 1 has color 2.
    * After query 2, ball 0 has color 1, and balls 1 and 2 have color 2.
    * After query 3, ball 0 has color 1, balls 1 and 2 have color 2, and ball 3 has color 4.
    * After query 4, ball 0 has color 1, balls 1 and 2 have color 2, ball 3 has color 4, and ball 4 has color 5.
    */
    @Test
    void example2(){
        int limit = 4;
        int[][] queries = {{0,1},{1,2},{2,2},{3,4}, {4,5}};


        int[] results = solution.queryResults(limit, queries);

        assertThat(results).containsExactlyInAnyOrder(1,2,2,3,4);
    }

    @Test
    void runtimeException(){
        int limit = 1;
        int[][] queries = {{0,1},{0,4},{0,4},{0,1},{1,2}};


        int[] results = solution.queryResults(limit, queries);

        assertThat(results).containsExactlyInAnyOrder(1,1,1,1,2);
    }



}