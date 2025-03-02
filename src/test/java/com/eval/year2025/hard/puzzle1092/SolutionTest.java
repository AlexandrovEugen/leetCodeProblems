package com.eval.year2025.hard.puzzle1092;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: str1 = "abac", str2 = "cab"
    Output: "cabac"
    Explanation:
    str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
    str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
    The answer provided is the shortest such string that satisfies these properties.
    */
    @Test
    void example1(){
        var str1 = "abac";
        var str2 = "cab";

        String result = solution.shortestCommonSupersequence(str1, str2);

        assertThat(result).isEqualTo("cabac");

    }


    /*
    Input: str1 = "aaaaaaaa", str2 = "aaaaaaaa"
    Output: "aaaaaaaa"
    */
    @Test
    void example2(){
        var str1 = "aaaaaaaa";
        var str2 = "aaaaaaaa";
        String result = solution.shortestCommonSupersequence(str1, str2);
        assertThat(result).isEqualTo("aaaaaaaa");
    }

    @Test
    void myExample1(){
        var str1 = "abc";
        var str2 = "kabcd";
        String result = solution.shortestCommonSupersequence(str1, str2);
        assertThat(result).isEqualTo("kabcd");
    }

}