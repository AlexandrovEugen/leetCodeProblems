package com.eval.year2025.medium.puzzle2780;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();




    /*
    Input: nums = [1,2,2,2]
    Output: 2
    Explanation: We can split the array at index 2 to obtain arrays [1,2,2] and [2].
    In array [1,2,2], element 2 is dominant since it occurs twice in the array and 2 * 2 > 3.
    In array [2], element 2 is dominant since it occurs once in the array and 1 * 2 > 1.
    Both [1,2,2] and [2] have the same dominant element as nums, so this is a valid split.
    It can be shown that index 2 is the minimum index of a valid split.
    */
    @Test
    void example1(){
        List<Integer> nums = List.of(1,2,2,2);

        int res = solution.minimumIndex(nums);

        assertThat(res).isEqualTo(2);
    }

    /*
    Input: nums = [2,1,3,1,1,1,7,1,2,1]
    Output: 4
    Explanation: We can split the array at index 4 to obtain arrays [2,1,3,1,1] and [1,7,1,2,1].
    In array [2,1,3,1,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 > 5.
    In array [1,7,1,2,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 > 5.
    Both [2,1,3,1,1] and [1,7,1,2,1] have the same dominant element as nums, so this is a valid split.
    It can be shown that index 4 is the minimum index of a valid split.
    */
    @Test
    void example2(){
        List<Integer> nums = List.of(2,1,3,1,1,1,7,1,2,1);

        int res = solution.minimumIndex(nums);

        assertThat(res).isEqualTo(4);
    }

    /*
    Input: nums = [3,3,3,3,7,2,2]
    Output: -1
    Explanation: It can be shown that there is no valid split.
    */
    @Test
    void example3(){
        List<Integer> nums = List.of(3,3,3,3,7,2,2);

        int res = solution.minimumIndex(nums);

        assertThat(res).isEqualTo(-1);
    }

}