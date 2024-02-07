package com.eval.easy.validPalindrome;

import com.eval.educative.TwoPointers.validPalindrome.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test(){

        assertThat(Solution.isPalindrome("aba")).isTrue();
        assertThat(Solution.isPalindrome("abba")).isTrue();

    }

}