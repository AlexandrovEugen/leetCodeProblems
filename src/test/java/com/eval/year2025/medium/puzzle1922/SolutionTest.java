package com.eval.year2025.medium.puzzle1922;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: n = 1
    Output: 5
    Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".
    */
    @Test
    void example1() {
        int n = 1;

        int res = solution.countGoodNumbers(n);

        assertThat(res).isEqualTo(5);
    }

    /*
    Input: n = 4
    Output: 400
    */
    @Test
    void example2() {
        int n = 4;

        int res = solution.countGoodNumbers(n);

        assertThat(res).isEqualTo(400);
    }


    /*
    Input: n = 50
    Output: 564908303
    */
    @Test
    void example3() {
        int n = 50;

        int res = solution.countGoodNumbers(n);

        assertThat(res).isEqualTo(564908303);
    }

}