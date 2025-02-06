package com.eval.year2025.medium.puzzle1726;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    /*
    Input: nums = [2,3,4,6]
    Output: 8
    Explanation: There are 8 valid tuples:
            (2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
            (3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)

    */
    @Test
    void example1(){
        int[] nums = {2,3,4,6};

        int result = solution.tupleSameProduct(nums);

        assertThat(result).isEqualTo(8);
    }


    /*
    Input: nums = [1,2,4,5,10]
    Output: 16
    Explanation: There are 16 valid tuples:
            (1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
            (2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
            (2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)
            (4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)

    */
    @Test
    void example2(){
        int[] nums = {1,2,4,5,10};

        int result = solution.tupleSameProduct(nums);

        assertThat(result).isEqualTo(16);
    }
}