package com.eval.year2025.educative._1TwoPointersAndCo.CircularArrayLoop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example1() {

        int[] nums = {3, 1, 2};

        boolean hasCycle = solution.circularArrayLoop(nums);

        assertThat(hasCycle).isTrue();
    }

    @Test
    void example2() {

        int[] nums = {2, 1, -1, -2};

        boolean hasCycle = solution.circularArrayLoop(nums);

        assertThat(hasCycle).isFalse();
    }




}