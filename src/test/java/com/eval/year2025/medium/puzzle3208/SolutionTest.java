package com.eval.year2025.medium.puzzle3208;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    /*
    Input: colors = [0,1,0,1,0], k = 3

    Output: 3
    */
    @Test
    void example() {
        int[] colors = {0, 1, 0, 1, 0};
        int k = 3;
        int groups = solution.numberOfAlternatingGroups(colors, k);

        assertThat(groups).isEqualTo(3);
    }

    /*
    Input: colors = [0,1,0,0,1,0,1], k = 6

    Output: 2
    */
    @Test
    void example1() {
        int[] colors = {0, 1, 0, 0, 1, 0, 1};
        int k = 6;
        int groups = solution.numberOfAlternatingGroups(colors, k);

        assertThat(groups).isEqualTo(2);
    }


    /*
    Input: colors = [1,1,0,1], k = 4

    Output: 0
    */
    @Test
    void example2() {
        int[] colors = {1, 1, 0, 1};
        int k = 4;
        int groups = solution.numberOfAlternatingGroups(colors, k);

        assertThat(groups).isEqualTo(0);
    }


}