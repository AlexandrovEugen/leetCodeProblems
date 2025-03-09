package com.eval.year2025.easy.puzzle2379;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: blocks = "WBBWWBBWBW", k = 7
    Output: 3
    Explanation:
    One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
    so that blocks = "BBBBBBBWBW".
    It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
            Therefore, we return 3.
    */
    @Test
    void example1(){
        String blocks = "WBBWWBBWBW";
        int k = 7;

        int result = solution.minimumRecolors(blocks, k);

        assertThat(result).isEqualTo(3);

    }

    /*
    Input: blocks = "WBWBBBW", k = 2
    Output: 0
    Explanation:
    No changes need to be made, since 2 consecutive black blocks already exist.
            Therefore, we return 0.
    */
    @Test
    void example2(){
        String blocks = "WBWBBBW";
        int k = 2;

        int result = solution.minimumRecolors(blocks, k);

        assertThat(result).isEqualTo(0);
    }


}