package com.eval.medium.sortTheMatrixDiagonally;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void test1() {
        int[][] mat = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] expectedOutput = {{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}};
        val actualOutput = solution.diagonalSort(mat);
        assertThat(actualOutput.length).isEqualTo(3);
        assertThat(actualOutput[0]).contains(expectedOutput[0]);
        assertThat(actualOutput[1]).contains(expectedOutput[1]);
        assertThat(actualOutput[2]).contains(expectedOutput[2]);


    }


}