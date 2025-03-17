package com.eval.year2025.easy.puzzle2206;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    /*
    Input: nums = [3,2,3,2,2,2]
    Output: true
    Explanation:
    There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
    If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
    */
    @Test
    void example1() {
        int[] nums = {3,2,3,2,2,2};

        boolean isPossible = solution.divideArray(nums);

        assertThat(isPossible).isTrue();
    }

    /*
    Input: nums = [1,2,3,4]
    Output: false
    Explanation:
    There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
    */
    @Test
    void example2() {
        int[] nums = {1,2,3,4};

        boolean isPossible = solution.divideArray(nums);

        assertThat(isPossible).isFalse();
    }


}