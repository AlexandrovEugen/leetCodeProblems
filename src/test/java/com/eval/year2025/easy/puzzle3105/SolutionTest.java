package com.eval.year2025.easy.puzzle3105;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: nums = [1,4,3,3,2]

    Output: 2

    Explanation:

    The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

    The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].

    Hence, we return 2.
     */
    @Test
    void example1(){
        int[] nums = {1,4,3,3,2};

        int result = solution.longestMonotonicSubarray(nums);

        assertThat(result).isEqualTo(2);
    }


    /*
    Input: nums = [3,3,3,3]

    Output: 1

    Explanation:

    The strictly increasing subarrays of nums are [3], [3], [3], and [3].

    The strictly decreasing subarrays of nums are [3], [3], [3], and [3].

    Hence, we return 1.
    */
    @Test
    void example2(){
        int[] nums = {3,3,3,3};

        int result = solution.longestMonotonicSubarray(nums);

        assertThat(result).isEqualTo(1);
    }

    /*
    Input: nums = [3,2,1]

    Output: 3

    Explanation:

    The strictly increasing subarrays of nums are [3], [2], and [1].

    The strictly decreasing subarrays of nums are [3], [2], [1], [3,2], [2,1], and [3,2,1].
     */
    @Test
    void example3(){
        int[] nums = {3,2,1};

        int result = solution.longestMonotonicSubarray(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void wrongAnswer1(){
        int[] nums = {1,9,7,1};

        int result = solution.longestMonotonicSubarray(nums);

        assertThat(result).isEqualTo(3);
    }


}