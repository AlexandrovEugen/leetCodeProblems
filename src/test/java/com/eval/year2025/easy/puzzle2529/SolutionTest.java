package com.eval.year2025.easy.puzzle2529;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: nums = [-2,-1,-1,1,2,3]
    Output: 3
    Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
    */
    @Test
    void example1() {
        int[] nums = {-2,-1,-1,1,2,3};

        int result = solution.maximumCount(nums);

        assertThat(result).isEqualTo(3);
    }

    /*
    Input: nums = [-3,-2,-1,0,0,1,2]
    Output: 3
    Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
    */
    @Test
    void example2() {
        int[] nums = {-3,-2,-1,0,0,1,2};

        int result = solution.maximumCount(nums);

        assertThat(result).isEqualTo(3);
    }

    /*
    Input: nums = [5,20,66,1314]
    Output: 4
    Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
    */
    @Test
    void example3() {
        int[] nums = {5,20,66,1314};

        int result = solution.maximumCount(nums);

        assertThat(result).isEqualTo(4);
    }

}