package com.eval.year2025.educative._1TwoPointersAndCo.SortColors;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
    */
    @Test
    void example1(){
        int[] nums = {2,0,2,1,1,0};

        solution.sortColors(nums);

        assertThat(nums).containsExactly(0,0,1,1,2,2);
    }

    /*
    Input: nums = [2,0,1]
    Output: [0,1,2]
    */
    @Test
    void example2(){
        int[] nums = {2,0,1};

        solution.sortColors(nums);

        assertThat(nums).containsExactly(0,1,2);
    }



}