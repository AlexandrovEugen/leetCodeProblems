package com.eval.year2025.easy.puzzle1800;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    /*
    Input: nums = [10,20,30,5,10,50]
    Output: 65
    Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
    */
    @Test
    void example1(){
        int [] nums = {10,20,30,5,10,50};

        int maxAscendingSum = solution.maxAscendingSum(nums);

        assertThat(maxAscendingSum).isEqualTo(65);
    }

    /*
    Input: nums = [10,20,30,40,50]
    Output: 150
    Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
    */
    @Test
    void example2(){
        int [] nums = {10,20,30,40,50};

        int maxAscendingSum = solution.maxAscendingSum(nums);

        assertThat(maxAscendingSum).isEqualTo(150);
    }
    /*
    Input: nums = [12,17,15,13,10,11,12]
    Output: 33
    Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
    */
    @Test
    void example3(){
        int [] nums = {12,17,15,13,10,11,12};

        int maxAscendingSum = solution.maxAscendingSum(nums);

        assertThat(maxAscendingSum).isEqualTo(33);
    }
}