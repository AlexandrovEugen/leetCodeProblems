package com.eval.year2025.educative._2BasicDataStructures.LargestRectangleInHistogram;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: heights = [2,1,5,6,2,3]
    Output: 10
    Explanation: The above is a histogram where width of each bar is 1.
    The largest rectangle is shown in the red area, which has an area = 10 units.
    */
    @Test
    void example1(){
        int [] heights = {2,1,5,6,2,3};

        int result = solution.largestRectangleArea(heights);

        assertThat(result).isEqualTo(10);
    }


    /*
    Input: heights = [2,4]
    Output: 4
    */
    @Test
    void example2(){
        int [] heights = {2,4};

        int result = solution.largestRectangleArea(heights);

        assertThat(result).isEqualTo(4);
    }


}