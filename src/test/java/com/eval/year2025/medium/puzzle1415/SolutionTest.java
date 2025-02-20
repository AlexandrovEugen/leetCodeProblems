package com.eval.year2025.medium.puzzle1415;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    /*
    Input: n = 1, k = 3
    Output: "c"
    Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
    */
    @Test
    void example1(){
        int n = 1;
        int k = 3;

        var result = solution.getHappyString(n, k);

        assertThat(result)
                .isEqualTo("c");
    }


    /*
    Input: n = 1, k = 4
    Output: ""
    Explanation: There are only 3 happy strings of length 1.
    */
    @Test
    void example2(){
        int n = 1;
        int k = 4;

        var result = solution.getHappyString(n, k);

        assertThat(result)
                .isEqualTo("");

    }

    /*
    Input: n = 3, k = 9
    Output: "cab"
    Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"
    */
    @Test
    void example3(){
        int n = 3;
        int k = 9;

        var result = solution.getHappyString(n, k);

        assertThat(result)
                .isEqualTo("cab");

    }


}