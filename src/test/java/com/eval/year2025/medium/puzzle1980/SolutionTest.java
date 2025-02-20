package com.eval.year2025.medium.puzzle1980;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: nums = ["01","10"]
    Output: "11"
    Explanation: "11" does not appear in nums. "00" would also be correct.
    */
    @Test
    void example1(){
        String[] nums = {"01", "10"};

        String differentBinaryString = solution.findDifferentBinaryString(nums);

        assertThat(differentBinaryString).isEqualTo("11");
    }

    /*
    Input: nums = ["00","01"]
    Output: "11"
    Explanation: "11" does not appear in nums. "10" would also be correct.
     */
    @Test
    void example2(){
        String[] nums = {"00", "01"};

        String differentBinaryString = solution.findDifferentBinaryString(nums);

        assertThat(differentBinaryString).isEqualTo("11");
    }

    /*
    Input: nums = ["111","011","001"]
    Output: "101"
    Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
    */
    @Test
    void example3(){
        String[] nums = {"111","011","001"};

        String differentBinaryString = solution.findDifferentBinaryString(nums);

        assertThat(differentBinaryString).isEqualTo("101");
    }

}