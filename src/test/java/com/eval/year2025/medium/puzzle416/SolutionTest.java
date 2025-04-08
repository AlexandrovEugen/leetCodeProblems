package com.eval.year2025.medium.puzzle416;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [1,5,11,5]
    Output: true
    Explanation: The array can be partitioned as [1, 5, 5] and [11].
    */
    @Test
    void example1() {
        int[] nums = {1, 5, 11, 5};


        boolean res = solution.canPartition(nums);

        assertThat(res).isTrue();
    }

    /*
    Input: nums = [1,2,3,5]
    Output: false
    Explanation: The array cannot be partitioned into equal sum subsets.
    */
    @Test
    void example2() {
        int[] nums = {1, 2, 3, 5};


        boolean res = solution.canPartition(nums);

        assertThat(res).isFalse();
    }

    @Test
    void example3() {
        int[] nums = {1,3,4,4};


        boolean res = solution.canPartition(nums);

        assertThat(res).isFalse();
    }

}