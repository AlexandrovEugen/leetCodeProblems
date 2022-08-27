package com.eval.easy.findPivotIndex;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void test1() {
        final int[] nums = {1, 7, 3, 6, 5, 6};
        val expected = 3;
        val actual = solution.pivotIndex(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test2() {
        final int[] nums = {1, 2, 3};
        val expected = -1;
        val actual = solution.pivotIndex(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test3() {
        final int[] nums = {2, 1, -1};
        val expected = 0;
        val actual = solution.pivotIndex(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test4() {
        final int[] nums = {-1, -1, -1, -1, -1, 0};
        val expected = 2;
        val actual = solution.pivotIndex(nums);
        assertThat(actual).isEqualTo(expected);
    }

}