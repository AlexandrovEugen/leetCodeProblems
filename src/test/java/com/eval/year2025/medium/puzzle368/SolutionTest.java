package com.eval.year2025.medium.puzzle368;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new OptimalSolution();



    /*
    Input: nums = [1,2,3]
    Output: [1,2]
    Explanation: [1,3] is also accepted.
    */
    @Test
    void example1(){
        int[] nums = {1,2,3};

        List<Integer> result = solution.largestDivisibleSubset(nums);

        assertThat(result).size().isEqualTo(2);
    }



    /*
    Input: nums = [1,2,4,8]
    Output: [1,2,4,8]
    */
    @Test
    void example2(){
        int[] nums = {1,2,4,8};

        List<Integer> result = solution.largestDivisibleSubset(nums);

        assertThat(result).containsExactly(1,2,4,8);
    }


}