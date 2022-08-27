package com.eval.medium.longestSubstringWithoutRepeatingCharacters;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        val input = "abcabcbb";
        val expectedOutput = 3;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }

    @Test
    void test2() {
        val input = "bbbbb";
        val expectedOutput = 1;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }

    @Test
    void test3() {
        val input = "pwwkew";
        val expectedOutput = 3;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }

    @Test
    void test4() {
        val input = " ";
        val expectedOutput = 1;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }

    @Test
    void test5() {
        val input = "";
        val expectedOutput = 0;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }

    @Test
    void test6() {
        val input = "c";
        val expectedOutput = 1;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }

    @Test
    void test7() {
        val input = "ac";
        val expectedOutput = 2;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }

    @Test
    void test8() {
        val input = "dvdf";
        val expectedOutput = 3;
        assertThat(solution.lengthOfLongestSubstring(input)).isEqualTo(expectedOutput);
    }


}