package com.eval.year2025.medium.puzzle2161;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [9,12,5,10,14,3,10], pivot = 10
    Output: [9,5,3,10,10,12,14]
    Explanation:
    The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
    The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
    The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
    */
    @Test
    void example1() {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        int[] numsPivoted = solution.pivotArray(nums, pivot);

        assertThat(numsPivoted).containsExactly(9, 5, 3, 10, 10, 12, 14);
    }


    /*
    Input: nums = [-3,4,3,2], pivot = 2
    Output: [-3,2,4,3]
    Explanation:
    The element -3 is less than the pivot so it is on the left side of the array.
    The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
    The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.
    */
    @Test
    void example2() {
        int[] nums = {-3, 4, 3, 2};
        int pivot = 2;

        int[] numsPivoted = solution.pivotArray(nums, pivot);

        assertThat(numsPivoted).containsExactly(-3,2,4,3);
    }
}