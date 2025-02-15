package com.eval.year2025.medium.puzzle2342;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [18,43,36,13,7]
    Output: 54
    Explanation: The pairs (i, j) that satisfy the conditions are:
            - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
            - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
    So the maximum sum that we can obtain is 54.
    */
    @Test
    void example1() {
        int[] nums = {18,43,36,13,7};

        int result = solution.maximumSum(nums);

        assertThat(result).isEqualTo(54);
    }


    /*
    Input: nums = [10,12,19,14]
    Output: -1
    Explanation: There are no two numbers that satisfy the conditions, so we return -1.
    */
    @Test
    void example2() {
        int[] nums = {10,12,19,14};

        int result = solution.maximumSum(nums);

        assertThat(result).isEqualTo(-1);
    }

    @Test
    void wrongAnswer1() {
        int[] nums = {368,369,307,304,384,138,90,279,35,396,114,328,251,364,300,191,438,467,183};

        int result = solution.maximumSum(nums);

        assertThat(result).isEqualTo(835);
    }

    @Test
    void wrongAnswer2() {
        int[] nums = {279,169,463,252,94,455,423,315,288,64,494,337,409,283,283,477,248,8,89,166,188,186,128};

        int result = solution.maximumSum(nums);

        assertThat(result).isEqualTo(872);
    }





}