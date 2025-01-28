package com.eval.old.educative.basicDataStructures.basicCalculator;

import com.eval.old.educative.basicDataStructures.basicCalculator.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test(){
        String expression = "12 - (6 + 2) + 5";
        assertThat(Solution.calculator(expression)).isEqualTo(9);
    }
    @Test
    void test1(){
        String expression = "(8 + 100) + (13 - 8 - (2 + 1))";
        assertThat(Solution.calculator(expression)).isEqualTo(110);
    }

}