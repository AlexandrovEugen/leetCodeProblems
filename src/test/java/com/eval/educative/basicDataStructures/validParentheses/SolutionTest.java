package com.eval.educative.basicDataStructures.validParentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {


    @Test
    void test1(){

        assertThat(Solution.isValid("{}[]{}[{}])")).isFalse();
    }

}