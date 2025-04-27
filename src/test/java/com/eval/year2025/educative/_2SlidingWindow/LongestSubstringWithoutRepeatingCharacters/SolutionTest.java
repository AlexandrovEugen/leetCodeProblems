package com.eval.year2025.educative._2SlidingWindow.LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example1() {
        String s = "abcdbea";

        int res = solution.findLongestSubstring(s);

        assertThat(res).isEqualTo(5);
    }

    @Test
    void example2() {
        String s = "aba";

        int res = solution.findLongestSubstring(s);

        assertThat(res).isEqualTo(2);
    }

    @Test
    void example3() {
        String s = "abccabcabcc";

        int res = solution.findLongestSubstring(s);

        assertThat(res).isEqualTo(3);
    }

    @Test
    void example4() {
        String s = "aaaabaaa";

        int res = solution.findLongestSubstring(s);

        assertThat(res).isEqualTo(2);
    }

    @Test
    void example5() {
        String s = "bbbbb";

        int res = solution.findLongestSubstring(s);

        assertThat(res).isEqualTo(1);
    }

}