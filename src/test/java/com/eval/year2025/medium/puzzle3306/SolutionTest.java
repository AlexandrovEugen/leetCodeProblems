package com.eval.year2025.medium.puzzle3306;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: word = "aeioqq", k = 1

    Output: 0

    Explanation:

    There is no substring with every vowel.
    */
    @Test
    void example1(){
        var word = "aeioqq";
        int k = 1;

        long result = solution.countOfSubstrings(word, k);

        assertThat(result).isEqualTo(0);
    }


    /*
    Input: word = "aeiou", k = 0

    Output: 1

    Explanation:

    The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".
    */
    @Test
    void example2(){
        var word = "aeiou";
        int k = 0;

        long result = solution.countOfSubstrings(word, k);

        assertThat(result).isEqualTo(1);
    }


    /*
    Input: word = "ieaouqqieaouqq", k = 1

    Output: 3

    Explanation:

    The substrings with every vowel and one consonant are:

    word[0..5], which is "ieaouq".
    word[6..11], which is "qieaou".
    word[7..12], which is "ieaouq".
    */
    @Test
    void example3(){
        var word = "ieaouqqieaouqq";
        int k = 1;

        long result = solution.countOfSubstrings(word, k);

        assertThat(result).isEqualTo(3);
    }
    @Test
    void example4(){
        var word = "ieaouqqieaouqq";
        int k = 1;

        long result = solution.countOfSubstrings(word, k);

        assertThat(result).isEqualTo(3);
    }


}