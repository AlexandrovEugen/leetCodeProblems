package com.eval.year2025.easy.puzzle1863;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [1,3]
    Output: 6
    Explanation: The 4 subsets of [1,3] are:
            - The empty subset has an XOR total of 0.
            - [1] has an XOR total of 1.
            - [3] has an XOR total of 3.
            - [1,3] has an XOR total of 1 XOR 3 = 2.
            0 + 1 + 3 + 2 = 6

     */
    @Test
    void example1() {
        int[] nums = {1,3};

        int res = solution.subsetXORSum(nums);

        assertThat(res).isEqualTo(6);
    }

    /*
    Input: nums = [5,1,6]
    Output: 28
    Explanation: The 8 subsets of [5,1,6] are:
            - The empty subset has an XOR total of 0.
            - [5] has an XOR total of 5.
            - [1] has an XOR total of 1.
            - [6] has an XOR total of 6.
            - [5,1] has an XOR total of 5 XOR 1 = 4.
            - [5,6] has an XOR total of 5 XOR 6 = 3.
            - [1,6] has an XOR total of 1 XOR 6 = 7.
            - [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
            0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28

     */
    @Test
    void example2() {
        int[] nums = {5,1,6};

        int res = solution.subsetXORSum(nums);

        assertThat(res).isEqualTo(28);
    }

    /*
    Input: nums = [3,4,5,6,7,8]
    Output: 480
    Explanation: The sum of all XOR totals for every subset is 480.
    */
    @Test
    void example3() {
        int[] nums = {3, 4, 5, 6, 7, 8};

        int res = solution.subsetXORSum(nums);

        assertThat(res).isEqualTo(480);
    }

}