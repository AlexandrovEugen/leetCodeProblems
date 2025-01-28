package com.eval.old.educative.basicDataStructures.validParentheses;

import com.eval.old.educative.basicDataStructures.validParentheses.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {


    @Test
    void test1(){

        assertThat(Solution.isValid("{}[]{}[{}])")).isFalse();
    }

}