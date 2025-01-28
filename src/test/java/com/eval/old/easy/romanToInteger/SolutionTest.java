package com.eval.old.easy.romanToInteger;

import com.eval.old.easy.romanToInteger.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void test1() {
        val input = "III";
        val expectedOutput = 3;
        val actualOutput = solution.romanToInt(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }


    @Test
    void test2() {
        val input = "LVIII";
        val expectedOutput = 58;
        val actualOutput = solution.romanToInt(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    void test3() {
        val input = "MCMXCIV";
        val expectedOutput = 1994;
        val actualOutput = solution.romanToInt(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

}