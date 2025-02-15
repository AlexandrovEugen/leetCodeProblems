package com.eval.year2025.medium.puzzle3066;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    /*
    Input: nums = [2,11,10,1,3], k = 10

    Output: 2

    Explanation:

    In the first operation, we remove elements 1 and 2, then add 1 * 2 + 2 to nums. nums becomes equal to [4, 11, 10, 3].
    In the second operation, we remove elements 3 and 4, then add 3 * 2 + 4 to nums. nums becomes equal to [10, 11, 10].
    At this stage, all the elements of nums are greater than or equal to 10 so we can stop.

    It can be shown that 2 is the minimum number of operations needed so that all elements of the array are greater than or equal to 10.
    */
    @Test
    void example1(){
        int[] nums = {2,11,10,1,3};
        int k = 10;


        int result = solution.minOperations(nums, k);

        assertThat(result).isEqualTo(2);

    }

    /*
    Input: nums = [1,1,2,4,9], k = 20

    Output: 4

    Explanation:

    After one operation, nums becomes equal to [2, 4, 9, 3].
    After two operations, nums becomes equal to [7, 4, 9].
    After three operations, nums becomes equal to [15, 9].
    After four operations, nums becomes equal to [33].
    At this stage, all the elements of nums are greater than 20 so we can stop.

    It can be shown that 4 is the minimum number of operations needed so that all elements of the array are greater than or equal to 20.
    */
    @Test
    void example2() {
        int[] nums = {1,1,2,4,9};
        int k = 20;


        int result = solution.minOperations(nums, k);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void wrongAnswer(){
        int[] nums = {999999999,999999999,999999999};
        int k = 1000000000;

        int result = solution.minOperations(nums, k);

        assertThat(result).isEqualTo(2);
    }
}