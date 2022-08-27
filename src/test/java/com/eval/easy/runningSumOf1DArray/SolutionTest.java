package com.eval.easy.runningSumOf1DArray;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        val actual = solution.runningSum(nums);
        assertThat(actual).hasSameSizeAs(expected).contains(expected);
    }


    @Test
    void test2() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};
        val actual = solution.runningSum(nums);
        assertThat(actual).hasSameSizeAs(expected).contains(expected);
    }


}