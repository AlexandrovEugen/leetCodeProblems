package com.eval.year2025.medium.puzzle3356;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new SolutionFromGitHub();


    /*
    Input: nums = [2,0,2], queries = [[0,2,1],[0,2,1],[1,1,3]]

    Output: 2

    Explanation:

    For i = 0 (l = 0, r = 2, val = 1):
    Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
    The array will become [1, 0, 1].
    For i = 1 (l = 0, r = 2, val = 1):
    Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
    The array will become [0, 0, 0], which is a Zero Array. Therefore, the minimum value of k is 2.
    */
    @Test
    void example1() {
        int[] nums = {2, 0, 2};
        int[][] queries = {{0, 2, 1}, {0, 2, 1}, {1, 1, 3}};

        int result = solution.minZeroArray(nums, queries);
        assertThat(result).isEqualTo(2);
    }

    /*
    Input: nums = [4,3,2,1], queries = [[1,3,2],[1,3,2]]

    Output: -1

    Explanation:

    For i = 0 (l = 1, r = 3, val = 2):
    Decrement values at indices [1, 2, 3] by [2, 2, 1] respectively.
    The array will become [4, 1, 0, 0].
    For i = 1 (l = 0, r = 2, val = 1):
    Decrement values at indices [0, 1, 2] by [1, 1, 0] respectively.
    The array will become [3, 0, 0, 0], which is not a Zero Array.
    */
    @Test
    void example2() {
        int[] nums = {4, 3, 2, 1};
        int[][] queries = {{1, 3, 2}, {1, 3, 2}};

        int result = solution.minZeroArray(nums, queries);
        assertThat(result).isEqualTo(-1);
    }


}