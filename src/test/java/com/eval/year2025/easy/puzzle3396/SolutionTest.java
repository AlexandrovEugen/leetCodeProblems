package com.eval.year2025.easy.puzzle3396;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: nums = [1,2,3,4,2,3,3,5,7]

    Output: 2

    Explanation:

    In the first operation, the first 3 elements are removed, resulting in the array [4, 2, 3, 3, 5, 7].
    In the second operation, the next 3 elements are removed, resulting in the array [3, 5, 7], which has distinct elements.
    Therefore, the answer is 2.
    */
    @Test
    void example1() {
        int[] nums = {1,2,3,4,2,3,3,5,7};

        int result = solution.minimumOperations(nums);

        assertThat(result).isEqualTo(2);
    }


    /*
    Input: nums = [4,5,6,4,4]

    Output: 2

    Explanation:

    In the first operation, the first 3 elements are removed, resulting in the array [4, 4].
    In the second operation, all remaining elements are removed, resulting in an empty array.
    Therefore, the answer is 2.
    */
    @Test
    void example2() {
        int[] nums = {4,5,6,4,4};

        int result = solution.minimumOperations(nums);

        assertThat(result).isEqualTo(2);
    }


    /*
    Input: nums = [6,7,8,9]

    Output: 0

    Explanation:

    The array already contains distinct elements. Therefore, the answer is 0.
    */
    @Test
    void example3() {
        int[] nums = {6,7,8,9};

        int result = solution.minimumOperations(nums);

        assertThat(result).isEqualTo(0);
    }



}