package com.eval.year2025.easy.puzzle3375;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: nums = [5,2,5,4,5], k = 2

    Output: 2

    Explanation:

    The operations can be performed in order using valid integers 4 and then 2.

    */
    @Test
    void example1(){
        int[] nums = {5,2,5,4,5};
        int k = 2;


        int res = solution.minOperations(nums, k);

        assertThat(res).isEqualTo(2);
    }


    /*
    Input: nums = [2,1,2], k = 2

    Output: -1

    Explanation:

    It is impossible to make all the values equal to 2.
    */
    @Test
    void example2(){
        int[] nums = {2, 1, 2};
        int k = 2;


        int res = solution.minOperations(nums, k);

        assertThat(res).isEqualTo(-1);
    }

    /*
    Input: nums = [9,7,5,3], k = 1

    Output: 4

    Explanation:

    The operations can be performed using valid integers in the order 7, 5, 3, and 1.
    */
    @Test
    void example3(){
        int[] nums = {9,7,5,3};
        int k = 1;


        int res = solution.minOperations(nums, k);

        assertThat(res).isEqualTo(4);
    }

}