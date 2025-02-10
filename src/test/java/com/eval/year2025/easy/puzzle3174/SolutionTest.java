package com.eval.year2025.easy.puzzle3174;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: s = "abc"
    Output: "abc"

    Explanation:
    There is no digit in the string.
    */
    @Test
    void example1() {
        String s = "abc";

        String result = solution.clearDigits(s);

        assertThat(result)
                .isEqualTo("abc");
    }

    /*
    Input: s = "cb34"
    Output: ""

    Explanation:
    First, we apply the operation on s[2], and s becomes "c4".
    Then we apply the operation on s[1], and s becomes "".
    */
    @Test
    void example2() {
        String s = "cb34";

        String result = solution.clearDigits(s);

        assertThat(result)
                .isEqualTo("");
    }

}