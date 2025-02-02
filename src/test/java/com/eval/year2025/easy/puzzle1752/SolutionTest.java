package com.eval.year2025.easy.puzzle1752;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [3,4,5,1,2]
    Output: true
    Explanation: [1,2,3,4,5] is the original sorted array.
    You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2].
     */
    @Test
    void example1(){
        final int[] nums = {3,4,5,1,2};

        boolean isSortedAndRotated = solution.check(nums);

        assertThat(isSortedAndRotated).isTrue();

    }

    /*
    Input: nums = [2,1,3,4]
    Output: false
    Explanation: There is no sorted array once rotated that can make nums.
     */
    @Test
    void example2(){
        final int[] nums = {2,1,3,4};

        boolean isSortedAndRotated = solution.check(nums);

        assertThat(isSortedAndRotated).isFalse();
    }


    /*
    Input: nums = [1,2,3]
    Output: true
    Explanation: [1,2,3] is the original sorted array.
    You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
     */
    @Test
    void example3(){
        final int[] nums = {1,2,3};

        boolean isSortedAndRotated = solution.check(nums);

        assertThat(isSortedAndRotated).isTrue();
    }


    @Test
    void wrongAnswer1(){
        final int[] nums = {2,1};

        boolean isSortedAndRotated = solution.check(nums);

        assertThat(isSortedAndRotated).isTrue();
    }

    @Test
    void wrongAnswer2(){
        final int[] nums = {5,5,6,6,6,9,1,2};

        boolean isSortedAndRotated = solution.check(nums);

        assertThat(isSortedAndRotated).isTrue();
    }


    @Test
    void wrongAnswer3(){
        final int[] nums = {7,9,1,1,1,3};

        boolean isSortedAndRotated = solution.check(nums);
        assertThat(isSortedAndRotated).isTrue();
    }

    @Test
    void wrongAnswer4(){
        final int[] nums = {2,7,4,1,2,6,2};

        boolean isSortedAndRotated = solution.check(nums);
        assertThat(isSortedAndRotated).isFalse();
    }

    @Test
    void wrongAnswer5(){
        final int[] nums = {6,10,6};

        boolean isSortedAndRotated = solution.check(nums);

        assertThat(isSortedAndRotated).isTrue();
    }

    @Test
    void wrongAnswer6(){
        final int[] nums = {8,5,4,5,1,4,5,2,2};

        boolean isSortedAndRotated = solution.check(nums);
        assertThat(isSortedAndRotated).isFalse();
    }

    @Test
    void wrongAnswer7(){
        final int[] nums = {1,4,1,2,3,5};
        boolean isSortedAndRotated = solution.check(nums);
        assertThat(isSortedAndRotated).isFalse();
    }


}