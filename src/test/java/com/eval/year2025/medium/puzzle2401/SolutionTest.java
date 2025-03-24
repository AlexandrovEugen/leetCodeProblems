package com.eval.year2025.medium.puzzle2401;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [1,3,8,48,10]
    Output: 3
    Explanation: The longest nice subarray is [3,8,48]. This subarray satisfies the conditions:
            - 3 AND 8 = 0.
            - 3 AND 48 = 0.
            - 8 AND 48 = 0.
    It can be proven that no longer nice subarray can be obtained, so we return 3.
    */
    @Test
    void example1(){
        int[] nums = {1,3,8,48,10};

        int res = solution.longestNiceSubarray(nums);

        assertThat(res).isEqualTo(3);
    }


    /*
    Input: nums = [3,1,5,11,13]
    Output: 1
    Explanation: The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.
    */
    @Test
    void example2(){
        int[] nums = {3,1,5,11,13};

        int res = solution.longestNiceSubarray(nums);

        assertThat(res).isEqualTo(1);
    }


}