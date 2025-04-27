package com.eval.year2025.easy.puzzle27;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    */
    @Test
    void example1() {
        int[] nums = {3,2,2,3};
        int val = 3;

        int k = solution.removeElement(nums, val);


        assertThat(k).isEqualTo(2);

        assertThat(nums).startsWith(2,2);

    }

    /*
    Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
    Note that the five elements can be returned in any order.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    */
    @Test
    void example2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = solution.removeElement(nums, val);


        assertThat(k).isEqualTo(5);

        assertThat(nums).startsWith(0,1,4,0,3);
    }

    @Test
    void example3() {
        int[] nums = {3,3};
        int val = 3;

        int k = solution.removeElement(nums, val);


        assertThat(k).isEqualTo(0);

    }

    @Test
    void example4() {
        int[] nums = {3,2,2,3};
        int val = 3;

        int k = solution.removeElement(nums, val);


        assertThat(k).isEqualTo(2);

    }

}