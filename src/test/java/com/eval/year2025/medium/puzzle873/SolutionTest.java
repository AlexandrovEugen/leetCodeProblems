package com.eval.year2025.medium.puzzle873;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: arr = [1,2,3,4,5,6,7,8]
    Output: 5
    Explanation: The longest subsequence that is fibonacci-like: [1,2,3,5,8].

     */
    @Test
    void example1() {
        int[] arr = {1,2,3,4,5,6,7,8};

        int result = solution.lenLongestFibSubseq(arr);

        assertThat(result).isEqualTo(5);
    }


    /*
    Input: arr = [1,3,7,11,12,14,18]
    Output: 3
    Explanation: The longest subsequence that is fibonacci-like: [1,11,12], [3,11,14] or [7,11,18].

    */
    @Test
    void example2() {
        int[] arr = {1,3,7,11,12,14,18};

        int result = solution.lenLongestFibSubseq(arr);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void wrongAnswer(){
        int[] arr = {2,4,7,8,9,10,14,15,18,23,32,50};
        int result = solution.lenLongestFibSubseq(arr);
        assertThat(result).isEqualTo(5);
    }

}