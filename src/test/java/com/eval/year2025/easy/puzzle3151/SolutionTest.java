package com.eval.year2025.easy.puzzle3151;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [1]
    Output: true
    Explanation:
    There is only one element. So the answer is true.
     */
    @Test
    void example1(){
        final int[] nums = {1};
        boolean isSpecial = solution.isArraySpecial(nums);

        assertThat(isSpecial).isTrue();
    }



    /*
    Input: nums = [2,1,4]
    Output: true
    Explanation:
    There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.
     */
    @Test
    void example2(){
        final int[] nums = {2,1, 4};
        boolean isSpecial = solution.isArraySpecial(nums);

        assertThat(isSpecial).isTrue();
    }


    /*
    Input: nums = [4,3,1,6]
    Output: false
    Explanation:
    nums[1] and nums[2] are both odd. So the answer is false.
     */
    @Test
    void example3(){
        final int[] nums = {4,3,1,6};
        boolean isSpecial = solution.isArraySpecial(nums);

        assertThat(isSpecial).isFalse();
    }

}