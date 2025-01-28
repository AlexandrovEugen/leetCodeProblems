package com.eval.old.medium.extraCharactersInAString;

import com.eval.old.medium.extraCharactersInAString.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    final Solution solution  = new Solution();

    @Test
    void example1(){

        val s = "leetscode";
        final String[] dictionary = {"leet", "code", "leetcode"};

        val minExtraChar = solution.minExtraChar(s, dictionary);

        assertThat(minExtraChar).isEqualTo(1);

    }
    @Test
    void example2(){

        val s = "sayhelloworld";
        final String[] dictionary = {"hello", "world"};

        val minExtraChar = solution.minExtraChar(s, dictionary);

        assertThat(minExtraChar).isEqualTo(1);

    }


}