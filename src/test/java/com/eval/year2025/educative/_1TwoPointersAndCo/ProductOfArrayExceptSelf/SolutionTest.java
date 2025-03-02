package com.eval.year2025.educative._1TwoPointersAndCo.ProductOfArrayExceptSelf;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    /*
    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
    */
    @Test
    void example1(){
        int[] nums = {1,2,3,4};

        int[] products = solution.productExceptSelf(nums);

        assertThat(products).containsExactly(24,12,8,6);
    }

    /*
    Input: nums = [-1,1,0,-3,3]
    Output: [0, 0, 9, 0, 0]
    */
    @Test
    void example2(){
        int[] nums = {-1,1,0,-3,3};

        int[] products = solution.productExceptSelf(nums);

        assertThat(products).containsExactly(0, 0, 9, 0, 0);
    }






}