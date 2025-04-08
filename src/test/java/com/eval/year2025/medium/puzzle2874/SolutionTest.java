package com.eval.year2025.medium.puzzle2874;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();




    /*
    Input: nums = [12,6,1,2,7]
    Output: 77
    Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
    It can be shown that there are no ordered triplets of indices with a value greater than 77.
    */
    @Test
    void example1(){
        int[] nums = {12,6,1,2,7};

        long result = solution.maximumTripletValue(nums);

        assertThat(result).isEqualTo(77L);
    }

    /*
    Input: nums = [1,10,3,4,19]
    Output: 133
    Explanation: The value of the triplet (1, 2, 4) is (nums[1] - nums[2]) * nums[4] = 133.
    It can be shown that there are no ordered triplets of indices with a value greater than 133.
    */
    @Test
    void example2(){
        int[] nums = {1,10,3,4,19};

        long result = solution.maximumTripletValue(nums);

        assertThat(result).isEqualTo(133L);
    }

    /*
    Input: nums = [1,2,3]
    Output: 0
    Explanation: The only ordered triplet of indices (0, 1, 2) has a negative value of (nums[0] - nums[1]) * nums[2] = -3. Hence, the answer would be 0.
    */
    @Test
    void example3(){
        int[] nums = {1,2,3};

        long result = solution.maximumTripletValue(nums);

        assertThat(result).isEqualTo(0L);
    }

}