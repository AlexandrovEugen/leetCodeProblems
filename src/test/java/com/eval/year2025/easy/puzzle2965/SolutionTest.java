package com.eval.year2025.easy.puzzle2965;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: grid = [[1,3],[2,2]]
    Output: [2,4]
    Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
    */
    @Test
    void example1(){
     int[][] grid = {{1,3}, {2, 2}};

        int[] missingAndRepeatedValues = solution.findMissingAndRepeatedValues(grid);

        assertThat(missingAndRepeatedValues).containsExactly(2,4);

    }

    /*
    Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
    Output: [9,5]
    Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
    */
    @Test
    void example2(){
        int[][] grid = {{9,1,7}, {8,9,2}, {3,4,6}};

        int[] missingAndRepeatedValues = solution.findMissingAndRepeatedValues(grid);

        assertThat(missingAndRepeatedValues).containsExactly(9,5);
    }


}