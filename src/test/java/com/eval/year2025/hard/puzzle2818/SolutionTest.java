package com.eval.year2025.hard.puzzle2818;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    /*
    Input: nums = [8,3,9,3,8], k = 2
    Output: 81
    Explanation: To get a score of 81, we can apply the following operations:
            - Choose subarray nums[2, ..., 2]. nums[2] is the only element in this subarray. Hence, we multiply the score by nums[2]. The score becomes 1 * 9 = 9.
            - Choose subarray nums[2, ..., 3]. Both nums[2] and nums[3] have a prime score of 1, but nums[2] has the smaller index. Hence, we multiply the score by nums[2]. The score becomes 9 * 9 = 81.
    It can be proven that 81 is the highest score one can obtain.
    */
    @Test
    void example1(){
        List<Integer> nums = List.of(8,3,9,3,8);
        int k = 2;


        int score = solution.maximumScore(nums, k);

        assertThat(score).isEqualTo(81);
    }

    /*
    Input: nums = [19,12,14,6,10,18], k = 3
    Output: 4788
    Explanation: To get a score of 4788, we can apply the following operations:
            - Choose subarray nums[0, ..., 0]. nums[0] is the only element in this subarray. Hence, we multiply the score by nums[0]. The score becomes 1 * 19 = 19.
            - Choose subarray nums[5, ..., 5]. nums[5] is the only element in this subarray. Hence, we multiply the score by nums[5]. The score becomes 19 * 18 = 342.
            - Choose subarray nums[2, ..., 3]. Both nums[2] and nums[3] have a prime score of 2, but nums[2] has the smaller index. Hence, we multipy the score by nums[2]. The score becomes 342 * 14 = 4788.
    It can be proven that 4788 is the highest score one can obtain.
    */
    @Test
    void example2(){
        List<Integer> nums = List.of(19,12,14,6,10,18);
        int k = 3;


        int score = solution.maximumScore(nums, k);

        assertThat(score).isEqualTo(4788);
    }

    @Test
    void example3(){
        List<Integer> nums = List.of(3289,2832,14858,22011);
        int k = 6;


        int score = solution.maximumScore(nums, k);

        assertThat(score).isEqualTo(256720975);
    }


}