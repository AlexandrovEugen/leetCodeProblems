package com.eval.year2025.hard.puzzle2493;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();


    /*
      Input: n = 6, edges = [[1,2],[1,4],[1,5],[2,6],[2,3],[4,6]]
      Output: 4
      Explanation: As shown in the image we:
      - Add node 5 to the first group.
      - Add node 1 to the second group.
      - Add nodes 2 and 4 to the third group.
      - Add nodes 3 and 6 to the fourth group.
      We can see that every edge is satisfied.
      It can be shown that if we create a fifth group and move any node from the third or fourth group to it, at least on of the edges will not be satisfied.
     */
    @Test
    void example1(){
        final int n = 6;
        final int[][] edges = {{1,2},{1,4},{1,5},{2,6},{2,3},{4,6}};

        final int numberOfGroups = solution.magnificentSets(n, edges);

        assertThat(numberOfGroups).isEqualTo(4);

    }


    /*
    Input: n = 3, edges = [[1,2],[2,3],[3,1]]
    Output: -1
    Explanation: If we add node 1 to the first group, node 2 to the second group,
    and node 3 to the third group to satisfy the first two edges,
    we can see that the third edge will not be satisfied.
    It can be shown that no grouping is possible.
     */
    @Test
    void example2(){
        int n = 3;
        int [][] edges = {{1,2},{2,3},{3,1}};

        final int numberOfGroups = solution.magnificentSets(n, edges);

        assertThat(numberOfGroups).isEqualTo(-1);

    }


}