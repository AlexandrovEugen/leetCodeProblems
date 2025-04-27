package com.eval.year2025.easy.puzzle26;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    */
    @Test
    void example1() {
        int[] nums = {1, 1, 2};

        int res = solution.removeDuplicates(nums);

        assertThat(res).isEqualTo(2);
    }

    /*
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    */
    @Test
    void example2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int res = solution.removeDuplicates(nums);

        assertThat(res).isEqualTo(5);
    }

}