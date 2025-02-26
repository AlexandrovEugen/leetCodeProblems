package com.eval.year2025.medium.puzzle1524;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new NeetCodeSolution();


    /*
    Input: arr = [1,3,5]
    Output: 4
    Explanation: All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
    All sub-arrays sum are [1,4,9,3,8,5].
    Odd sums are [1,9,3,5] so the answer is 4.
    */
    @Test
    void example1(){
        int[] arr = {1, 3, 5};

        int result = solution.numOfSubarrays(arr);

        assertThat(result).isEqualTo(4);

    }


    /*
    Input: arr = [2,4,6]
    Output: 0
    Explanation: All subarrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
    All sub-arrays sum are [2,6,12,4,10,6].
    All sub-arrays have even sum and the answer is 0.
    */
    @Test
    void example2(){
        int[] arr = {2, 4, 6};

        int result = solution.numOfSubarrays(arr);

        assertThat(result).isEqualTo(0);
    }


    /*
    Input: arr = [1,2,3,4,5,6,7]
    Output: 16
    */
    @Test
    void example3(){
        int[] arr = {1,2,3,4,5,6,7};

        int result = solution.numOfSubarrays(arr);

        assertThat(result).isEqualTo(16);
    }


}