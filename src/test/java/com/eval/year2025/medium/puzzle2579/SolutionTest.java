package com.eval.year2025.medium.puzzle2579;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: n = 1
    Output: 1
    Explanation: After 1 minute, there is only 1 blue cell, so we return 1.
    */
    @Test
    void example1() {
        int n = 1;
        long output = solution.coloredCells(n);

        assertThat(output).isEqualTo(1L);
    }

    /*
    Input: n = 2
    Output: 5
    Explanation: After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5.
    */
    @Test
    void example2() {
        int n = 2;
        long output = solution.coloredCells(n);

        assertThat(output).isEqualTo(5L);
    }

}