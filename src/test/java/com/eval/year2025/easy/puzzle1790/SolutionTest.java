package com.eval.year2025.easy.puzzle1790;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: s1 = "bank", s2 = "kanb"
    Output: true
    Explanation: For example, swap the first character with the last character of s2 to make "bank".
    */
    @Test
    void example1(){
        String s1 = "bank", s2 = "kanb";

        boolean areAlmostEqual = solution.areAlmostEqual(s1, s2);
        assertThat(areAlmostEqual).isTrue();
    }


    /*
    Input: s1 = "attack", s2 = "defend"
    Output: false
    Explanation: It is impossible to make them equal with one string swap.
    */
    @Test
    void example2(){
        String s1 = "attack", s2 = "defend";

        boolean areAlmostEqual = solution.areAlmostEqual(s1, s2);
        assertThat(areAlmostEqual).isFalse();
    }

    /*
    Input: s1 = "kelb", s2 = "kelb"
    Output: true
    Explanation: The two strings are already equal, so no string swap operation is required.
     */
    @Test
    void example3(){
        String s1 = "kelb", s2 = "kelb";

        boolean areAlmostEqual = solution.areAlmostEqual(s1, s2);
        assertThat(areAlmostEqual).isTrue();
    }

}