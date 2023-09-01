package com.eval.easy.countingBits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    @Test
    void exampleFromLeetCode1(){

        final int n = 2;
        final int[] expectedAns = {0, 1, 1};

        final int[] actualAns = solution.countBits(n);

        assertThat(actualAns).containsExactly(expectedAns);

    }
    @Test
    void exampleFromLeetCode2(){

        final int n = 5;
        final int[] expectedAns = {0,1,1,2,1,2};

        final int[] actualAns = solution.countBits(n);

        assertThat(actualAns).containsExactly(expectedAns);

    }


}