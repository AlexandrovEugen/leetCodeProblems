package com.eval.year2025.medium.puzzle1780;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: n = 12
    Output: true
    Explanation: 12 = 3^1 + 3^2
    */
    @Test
    void example1() {
        int n = 12;

        boolean result = solution.checkPowersOfThree(n);

        assertThat(result).isTrue();
    }

    /*
    Input: n = 91
    Output: true
    Explanation: 91 = 3^0 + 3^2 + 3^4
    */
    @Test
    void example2() {
        int n = 91;

        boolean result = solution.checkPowersOfThree(n);

        assertThat(result).isTrue();
    }

    /*
    Input: n = 21
    Output: false
    */
    @Test
    void example3() {
        int n = 21;

        boolean result = solution.checkPowersOfThree(n);

        assertThat(result).isFalse();
    }

}