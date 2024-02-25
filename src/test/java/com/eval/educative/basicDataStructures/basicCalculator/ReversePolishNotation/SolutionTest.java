package com.eval.educative.basicDataStructures.basicCalculator.ReversePolishNotation;

import com.eval.educative.basicDataStructures.ReversePolishNotation.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test(){
        assertThat(Solution.rpn(new String[]{"2", "5","*","4", "+", "3", "2", "*", "1", "+", "/"}))
                .isEqualTo(2);

    }

    @Test
    void test1(){
        assertThat(Solution.rpn(new String[]{"10", "6", "9", "3", "/", "-", "*"}))
                .isEqualTo(30);

    }

}