package com.eval.year2025.medium.puzzle1749;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new LeeCodeFasterSolution();

    /*
    Input: nums = [1,-3,2,3,-4]
    Output: 5
    Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5
    */
    @Test
    void example1() {
        int[] nums = {1,-3,2,3,-4};

        int result = solution.maxAbsoluteSum(nums);

        assertThat(result).isEqualTo(5);
    }

    /*
    Input: nums = [2,-5,1,-4,3,-2]
    Output: 8
    Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
    */
    @Test
    void example2() {
        int[] nums = {2,-5,1,-4,3,-2};

        int result = solution.maxAbsoluteSum(nums);

        assertThat(result).isEqualTo(8);
    }


}