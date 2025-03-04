package com.eval.year2025.educative._1TwoPointersAndCo.SearchInRotatedSortedArray;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
    */
    @Test
    void example1(){

        int[] nums = {4,5,6,7,0,1,2};

        int target = 0;

        int index = solution.search(nums, target);

        assertThat(index).isEqualTo(4);
    }


    /*
    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1
    */
    @Test
    void example2(){

        int[] nums = {4,5,6,7,0,1,2};

        int target = 3;

        int index = solution.search(nums, target);

        assertThat(index).isEqualTo(-1);
    }

    /*
    Input: nums = [1], target = 0
    Output: -1
    */
    @Test
    void example3(){

        int[] nums = {1};

        int target = 0;

        int index = solution.search(nums, target);

        assertThat(index).isEqualTo(-1);
    }

    @Test
    void wrongAnswer(){
        int[] nums = {1};
        int target = 1;
        int index = solution.search(nums, target);
        assertThat(index).isEqualTo(0);
    }

    @Test
    void wrongAnswer1(){
        int[] nums = {1, 3};
        int target = 3;
        int index = solution.search(nums, target);
        assertThat(index).isEqualTo(1);
    }



}