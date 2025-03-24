package com.eval.year2025.medium.puzzle3191;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: nums = [0,1,1,1,0,0]

    Output: 3

    Explanation:
    We can do the following operations:

    Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
    Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
    Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].
    */
    @Test
    void example1() {
        int[] nums = {0,1,1,1,0,0};

        int i = solution.minOperations(nums);

        assertThat(i).isEqualTo(3);
    }

    /*
    Example 2:

    Input: nums = [0,1,1,1]

    Output: -1

    Explanation:
    It is impossible to make all elements equal to 1.
    */
    @Test
    void example2() {
        int[] nums = {0,1,1,1};

        int i = solution.minOperations(nums);

        assertThat(i).isEqualTo(-1);
    }

    @Test
    void example3() {
        int[] nums = {1,0,0,1,1,1,0,1,1,1};

        int i = solution.minOperations(nums);

        assertThat(i).isEqualTo(3);
    }

}