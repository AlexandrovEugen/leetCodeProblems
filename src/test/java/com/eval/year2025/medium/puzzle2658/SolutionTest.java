package com.eval.year2025.medium.puzzle2658;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example1(){

        final int[][] grid = {{0, 2, 1, 0},  {4, 0, 0, 3}, {1, 0, 0, 4}, {0, 3, 2, 0}};

        val maxFish = solution.findMaxFish(grid);

        assertThat(maxFish).isEqualTo(7);

    }

}