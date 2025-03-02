package com.eval.year2025.educative._1TwoPointersAndCo.TrappingRainWater;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array
    */
    @Test
    void example1(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int trap = solution.trap(height);

        assertThat(trap).isEqualTo(6);
    }


    /*
    Input: height = [4,2,0,3,2,5]
    Output: 9
    */
    @Test
    void example2(){
        int[] height = {4,2,0,3,2,5};
        int trap = solution.trap(height);
        assertThat(trap).isEqualTo(9);
    }


}