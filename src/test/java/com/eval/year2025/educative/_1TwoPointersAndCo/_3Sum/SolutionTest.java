package com.eval.year2025.educative._1TwoPointersAndCo._3Sum;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
    */
    @Test
    void example1(){
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = solution.threeSum(nums);

        assertThat(result).isNotEmpty();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result.getFirst()).containsExactly(-1,-1,2);
        assertThat(result.get(1)).containsExactly(-1,0,1);

    }

    /*
    Input: nums = [0,1,1]
    Output: []
    Explanation: The only possible triplet does not sum up to 0.
    */
    @Test
    void example2(){
        int[] nums = {0,1,1};
        List<List<Integer>> result = solution.threeSum(nums);
        assertThat(result).isEmpty();
    }


    /*
    Input: nums = [0,0,0]
    Output: [[0,0,0]]
    Explanation: The only possible triplet sums up to 0.
    */
    @Test
    void example3(){
        int[] nums = {0, 0, 0};

        List<List<Integer>> result = solution.threeSum(nums);
        assertThat(result).isNotEmpty();
        assertThat(result.size()).isEqualTo(1);
        assertThat(result.getFirst()).containsExactly(0, 0, 0);
    }

    @Test
    void wrongAnswer1(){
        int[] nums = {-1,0,1};
        List<List<Integer>> result = solution.threeSum(nums);
        assertThat(result).isNotEmpty();
        assertThat(result.size()).isEqualTo(1);
    }

}