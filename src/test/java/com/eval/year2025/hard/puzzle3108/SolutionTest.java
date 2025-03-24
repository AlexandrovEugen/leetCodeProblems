package com.eval.year2025.hard.puzzle3108;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: n = 5, edges = [[0,1,7],[1,3,7],[1,2,1]], query = [[0,3],[3,4]]

    Output: [1,-1]

    Explanation:
    To achieve the cost of 1 in the first query, we need to move on the following edges: 0->1 (weight 7), 1->2 (weight 1), 2->1 (weight 1), 1->3 (weight 7).

    In the second query, there is no walk between nodes 3 and 4, so the answer is -1.
    */
    @Test
    void example1() {
        int n = 5;
        int[][] edges = {{0, 1, 7}, {1, 3, 7}, {1, 2, 1}};
        int[][] query = {{0, 3}, {3, 4}};

        int[] result = solution.minimumCost(n, edges, query);

        assertThat(result).containsExactly(1, -1);
    }

    /*
    Input: n = 3, edges = [[0,2,7],[0,1,15],[1,2,6],[1,2,1]], query = [[1,2]]

    Output: [0]

    Explanation:


    To achieve the cost of 0 in the first query, we need to move on the following edges: 1->2 (weight 1), 2->1 (weight 6), 1->2 (weight 1).
    */
    @Test
    void example2() {
        int n = 5;
        int[][] edges = {{0,2,7},{0,1,15},{1,2,6},{1,2,1}};
        int[][] query = {{1, 2}};

        int[] result = solution.minimumCost(n, edges, query);

        assertThat(result).containsExactly(0);
    }

}