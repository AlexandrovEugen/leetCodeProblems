package com.eval.easy.isomorphicStrings;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void test1() {
        val str1 = "ACAB";
        val str2 = "XCXY";

        val isomorphic = solution.isIsomorphic(str1, str2);
        assertThat(isomorphic).isTrue();
    }

    @Test
    void test2() {
        val str1 = "foo";
        val str2 = "bar";

        val isomorphic = solution.isIsomorphic(str1, str2);
        assertThat(isomorphic).isFalse();
    }

    @Test
    void test3() {
        val str1 = "paper";
        val str2 = "title";

        val isomorphic = solution.isIsomorphic(str1, str2);
        assertThat(isomorphic).isTrue();
    }

    @Test
    void test4() {
        val str1 = "foo";
        val str2 = "baa";

        val isomorphic = solution.isIsomorphic(str1, str2);
        assertThat(isomorphic).isTrue();
    }


}