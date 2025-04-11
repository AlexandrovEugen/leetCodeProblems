package com.eval.year2025.hard.pazzle2999;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 *   Constraints:
 *             1 <= start <= finish <= 1015
 *             1 <= limit <= 9
 *             1 <= s.length <= floor(log10(finish)) + 1
 *     s only consists of numeric digits which are at most limit.
 *     s does not have leading zeros.
 */
class SolutionTest {

    private final Solution solution = new DFSSolution();

    /*
    Input: start = 1, finish = 6000, limit = 4, s = "124"
    Output: 5
    Explanation: The powerful integers in the range [1..6000] are 124, 1124, 2124, 3124, and, 4124.
    All these integers have each digit <= 4, and "124" as a suffix. Note that 5124 is not a powerful integer because the first digit is 5 which is greater than 4.
    It can be shown that there are only 5 powerful integers in this range.
    */
    @Test
    void example1(){
        int start = 1;
        int finish = 6000;
        int limit = 4;
        String s = "124";

        long count = solution.numberOfPowerfulInt(start, finish, limit, s);

        assertThat(count).isEqualTo(5);
    }

    /*
    Input: start = 15, finish = 215, limit = 6, s = "10"
    Output: 2
    Explanation: The powerful integers in the range [15..215] are 110 and 210.
    All these integers have each digit <= 6, and "10" as a suffix.
    It can be shown that there are only 2 powerful integers in this range.
    */
    @Test
    void example2(){
        int start = 15;
        int finish = 215;
        int limit = 6;
        String s = "10";

        long count = solution.numberOfPowerfulInt(start, finish, limit, s);

        assertThat(count).isEqualTo(2);
    }

    /*
    Input: start = 1000, finish = 2000, limit = 4, s = "3000"
    Output: 0
    Explanation: All integers in the range [1000..2000] are smaller than 3000,
     hence "3000" cannot be a suffix of any integer in this range.
    */
    @Test
    void example3(){
        int start = 1000;
        int finish = 2000;
        int limit = 4;
        String s = "3000";

        long count = solution.numberOfPowerfulInt(start, finish, limit, s);

        assertThat(count).isEqualTo(0);
    }

    @Test
    void example4(){

        long start = 1;
        long finish = 971;
        int limit = 9;
        String s = "71";
        long count = solution.numberOfPowerfulInt(start, finish, limit, s);

        assertThat(count).isEqualTo(10);
    }

    @Test
    void example5(){

        long start = 20;
        long finish = 1159;
        int limit = 5;
        String s = "20";
        long count = solution.numberOfPowerfulInt(start, finish, limit, s);

        assertThat(count).isEqualTo(8);
    }




}