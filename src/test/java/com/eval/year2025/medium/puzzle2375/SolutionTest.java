package com.eval.year2025.medium.puzzle2375;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: pattern = "IIIDIDDD"
    Output: "123549876"
    Explanation:
    At indices 0, 1, 2, and 4 we must have that num[i] < num[i+1].
    At indices 3, 5, 6, and 7 we must have that num[i] > num[i+1].
    Some possible values of num are "245639871", "135749862", and "123849765".
    It can be proven that "123549876" is the smallest possible num that meets the conditions.
    Note that "123414321" is not possible because the digit '1' is used more than once.
    */
    @Test
    void example1(){
        var pattern = "IIIDIDDD";

        var result = solution.smallestNumber(pattern);

        assertThat(result).isEqualTo("123549876");
    }


    /*
    Input: pattern = "DDD"
    Output: "4321"
    Explanation:
    Some possible values of num are "9876", "7321", and "8742".
    It can be proven that "4321" is the smallest possible num that meets the conditions.
    */
    @Test
    void example2(){
        var pattern = "DDD";

        var result = solution.smallestNumber(pattern);

        assertThat(result).isEqualTo("4321");
    }


}