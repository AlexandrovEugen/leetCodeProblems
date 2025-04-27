package com.eval.year2025.educative._1TwoPointersAndCo.ReverseWordsInAString;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example1(){
        String sentence = "Hello     World";

        String reverseWords = solution.reverseWords(sentence);


        assertThat(reverseWords).isEqualTo("World Hello");


    }

}