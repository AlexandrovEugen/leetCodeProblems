package com.eval.medium.longestPalindromicSubstring;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        val input = "babad";
        val expectedOutput = "aba";
        val actualOutput = solution.longestPalindrome(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    void test2() {
        val input = "cbbd";
        val expectedOutput = "bb";
        val actualOutput = solution.longestPalindrome(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }


}