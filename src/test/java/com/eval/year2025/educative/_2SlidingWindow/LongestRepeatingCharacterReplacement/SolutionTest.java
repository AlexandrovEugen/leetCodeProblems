package com.eval.year2025.educative._2SlidingWindow.LongestRepeatingCharacterReplacement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    @Test
    void example1(){
        String s = "";

        int res = solution.longestRepeatingCharacterReplacement(s, 1);


        assertThat(res).isEqualTo(0);
    }


    @Test
    void example2(){
        String s = "aaacbbbaabab";
        int k = 2;

        int res = solution.longestRepeatingCharacterReplacement(s, k);


        assertThat(res).isEqualTo(6);
    }

    @Test
    void example3(){
        String s = "dippitydip";
        int k = 4;

        int res = solution.longestRepeatingCharacterReplacement(s, k);


        assertThat(res).isEqualTo(6);
    }

    @Test
    void example4(){
        String s = "coollooc";
        int k = 2;

        int res = solution.longestRepeatingCharacterReplacement(s, k);


        assertThat(res).isEqualTo(6);
    }

}