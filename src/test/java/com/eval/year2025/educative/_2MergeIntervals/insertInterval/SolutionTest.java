package com.eval.year2025.educative._2MergeIntervals.insertInterval;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    @Test
    void example1() {

        int[][] intervals = {{1, 2}, {3, 6}, {7, 10}, {11, 18}};
        int[] newInterval = {2, 5};

        int[][] res = solution.insertInterval(intervals, newInterval);

        assertThat(res).containsExactly(new int[]{1, 6}, new int[]{7, 10}, new int[]{11, 18});


    }

    @Test
    void example2() {

        int[][] intervals = {{1, 2}, {3, 4}, {5, 8}, {9, 15}};
        int[] newInterval = {2, 5};

        int[][] res = solution.insertInterval(intervals, newInterval);

        int[][] expected = {{1, 8}, {9, 15}};

        assertThat(res).containsExactly(expected);


    }

    @Test
    void example3() {

        int[][] intervals = {{1, 6}, {8, 9}, {10, 15}, {16, 18}};
        int[] newInterval = {9, 10};

        int[][] res = solution.insertInterval(intervals, newInterval);

        int[][] expected = {{1, 6}, {8, 15}, {16, 18}};

        assertThat(res).containsExactly(expected);


    }


}