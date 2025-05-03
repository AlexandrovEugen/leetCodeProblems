package com.eval.year2025.educative._2MergeIntervals.mergeIntervals;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example1() {

        int[][] ints = solution.mergeIntervals(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});

        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};

        assertThat(ints).containsExactly(expected);

    }

    @Test
    void example2() {

        int[][] ints = solution.mergeIntervals(new int[][]{{1, 5}, {3, 7}, {4, 6}});

        int[][] expected = {{1, 7}};

        assertThat(ints).containsExactly(expected);

    }

}