package com.eval.year2025.educative._1TwoPointersAndCo.ContainerWithMostWater;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: height = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
    In this case, the max area of water (blue section) the container can contain is 49.
    */
    @Test
    void example1() {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int maxArea = solution.maxArea(height);

        assertThat(maxArea).isEqualTo(49);
    }

    /*
    Input: height = [1,1]
    Output: 1
    */
    @Test
    void example2() {
        int[] height = {1,1};
        int maxArea = solution.maxArea(height);
        assertThat(maxArea).isEqualTo(1);
    }


}