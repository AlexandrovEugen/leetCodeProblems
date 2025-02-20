package com.eval.year2025.medium.puzzle1718;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    /*
    Input: n = 3
    Output: [3,1,2,3,2]
    Explanation: [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.
    */
    @Test
    void example1() {
        int n = 3;

        int[] output = solution.constructDistancedSequence(n);

        assertThat(output).containsExactlyInAnyOrder(3, 1, 2, 3, 2);
    }


    /*
    Input: n = 5
    Output: [5,3,1,4,3,5,2,4,2]
    */
    @Test
    void example2() {
        int n = 5;

        int[] output = solution.constructDistancedSequence(n);

        assertThat(output).containsExactlyInAnyOrder(5, 3, 1, 4, 3, 5, 2, 4, 2);
    }

}