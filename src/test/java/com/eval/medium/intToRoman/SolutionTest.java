package com.eval.medium.intToRoman;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1(){
        val input = 3;
        val expected = "III";
        val actual = solution.intToRoman(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test2(){
        val input = 1994;
        val expected = "MCMXCIV";
        val actual = solution.intToRoman(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test3(){
        val input = 58;
        val expected = "LVIII";
        val actual = solution.intToRoman(input);
        assertThat(actual).isEqualTo(expected);
    }

}