package com.eval.year2025.medium.puzzle1079;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final SolutionFromLeetCodeTheFastest solution = new SolutionFromLeetCodeTheFastest();

    /*
    Input: tiles = "AAB"
    Output: 8
    Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
    */
    @Test
    void example1(){
        String tiles = "AAB";

        int amount = solution.numTilePossibilities(tiles);

        assertThat(amount)
                .isEqualTo(8);
    }


    /*
    Input: tiles = "AAABBC"
    Output: 188
    */
    @Test
    void example2(){
        String tiles = "AAABBC";

        int amount = solution.numTilePossibilities(tiles);

        assertThat(amount)
                .isEqualTo(188);
    }

    /*
    Input: tiles = "V"
    Output: 1
    */
    @Test
    void example3(){
        String tiles = "V";

        int amount = solution.numTilePossibilities(tiles);

        assertThat(amount)
                .isEqualTo(1);
    }

}