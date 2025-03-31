package com.eval.year2025.medium.puzzle763;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: s = "ababcbacadefegdehijhklij"
    Output: [9,7,8]
    Explanation:
    The partition is "ababcbaca", "defegde", "hijhklij".
    This is a partition so that each letter appears in at most one part.
    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
    */
    @Test
    void example1(){
        var s = "ababcbacadefegdehijhklij";
        List<Integer> result = solution.partitionLabels(s);

        assertThat(result).containsExactly(9, 7, 8);
    }



    /*
    Input: s = "eccbbbbdec"
    Output: [10]
    */
    @Test
    void example2(){
        var s = "eccbbbbdec";
        List<Integer> result = solution.partitionLabels(s);

        assertThat(result).containsExactly(10);
    }


}