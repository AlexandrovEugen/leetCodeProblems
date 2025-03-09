package com.eval.year2025.educative._2BasicDataStructures.BasicCalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: s = "1 + 1"
    Output: 2
    */
    @Test
    void example1() {
        var s = "1 + 1";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(2);
    }

    /*
    Input: s = " 2-1 + 2 "
    Output: 3
    */
    @Test
    void example2() {
        var s = " 2-1 + 2 ";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(3);
    }

    /*
    Input: s = "(1+(4+5+2)-3)+(6+8)"
    Output: 23
    */
    @Test
    void example3() {
        var s = "(1+(4+5+2)-3)+(6+8)";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(23);
    }


    @Test
    void example4() {
        var s = "(1+(14+5+27)-3)+(6+8)";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(58);
    }

    @Test
    void example5() {
        var s = "(1-(3+4)";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(-6);
    }

    @Test
    void example7() {
        var s = "(1+(3-4)";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example6() {
        var s = "1-(4)";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(-3);
    }

    @Test
    void wrongAnswer() {
        var s = "1-(-2)";
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(3);
    }





}