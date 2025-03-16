package com.eval.year2025.medium.puzzle2560;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = [2,3,5,9], k = 2
    Output: 5
    Explanation:
    There are three ways to rob at least 2 houses:
            - Rob the houses at indices 0 and 2. Capability is max(nums[0], nums[2]) = 5.
            - Rob the houses at indices 0 and 3. Capability is max(nums[0], nums[3]) = 9.
            - Rob the houses at indices 1 and 3. Capability is max(nums[1], nums[3]) = 9.
    Therefore, we return min(5, 9, 9) = 5.
    */
    @Test
    void example1() {
        int[] nums = {2, 3, 5, 9};
        int k = 2;

        int minCapability = solution.minCapability(nums, k);

        assertThat(minCapability).isEqualTo(5);
    }


    /*
    Input: nums = [2,7,9,3,1], k = 2
    Output: 2
    Explanation: There are 7 ways to rob the houses.
    The way which leads to minimum capability is to rob the house at index 0 and 4. Return max(nums[0], nums[4]) = 2.
    */
    @Test
    void example2() {
        int[] nums = {2, 7, 9, 3, 1};
        int k = 2;

        int minCapability = solution.minCapability(nums, k);

        assertThat(minCapability).isEqualTo(2);
    }


}