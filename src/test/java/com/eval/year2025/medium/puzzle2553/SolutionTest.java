package com.eval.year2025.medium.puzzle2553;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example1(){
        int left = 10;
        int right = 19;

        int[] ints = solution.closestPrimNumbers(left, right);

        assertThat(ints).containsExactlyInAnyOrder(11, 13);
    }


}