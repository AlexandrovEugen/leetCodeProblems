package com.eval.year2025.medium.puzzle1358;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new FastestFromLeetCode();

    /*
    Input: s = "abcabc"
    Output: 10
    Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
    */
    @Test
    void example1(){
        var s = "abcabc";

        int result = solution.numberOfSubstrings(s);

        assertThat(result).isEqualTo(10);
    }

    /*
    Input: s = "aaacb"
    Output: 3
    Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
    */
    @Test
    void example2(){
        var s = "aaacb";

        int result = solution.numberOfSubstrings(s);

        assertThat(result).isEqualTo(3);
    }

    /*
    Input: s = "abc"
    Output: 1
    */
    @Test
    void example3(){
        var s = "abc";

        int result = solution.numberOfSubstrings(s);

        assertThat(result).isEqualTo(1);
    }



}