package com.eval.year2025.educative._1TwoPointersAndCo.FindTheDuplicateNumber;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example1(){

        int[] nums = {1,3,6,2,7,3,5,4};

        int duplicate = solution.findDuplicate(nums);

        assertThat(duplicate).isEqualTo(3);

    }

    @Test
    void example2(){

        int[] nums = {1,3,6,2,7,3,5,4};

        int duplicate = solution.findDuplicate2(nums);

        assertThat(duplicate).isEqualTo(3);

    }

}