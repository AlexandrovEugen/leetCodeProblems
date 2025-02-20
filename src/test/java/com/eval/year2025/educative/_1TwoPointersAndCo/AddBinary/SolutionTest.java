package com.eval.year2025.educative._1TwoPointersAndCo.AddBinary;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: a = "11", b = "1"
    Output: "100"
    */
    @Test
    void example1(){
        String a = "11";
        String b = "1";

        String result = solution.addBinary(a, b);

        assertThat(result).isEqualTo("100");
    }

    /*
    Input: a = "1010", b = "1011"
    Output: "10101"
    */
    @Test
    void example2(){
        String a = "1010";
        String b = "1011";

        String result = solution.addBinary(a, b);

        assertThat(result).isEqualTo("10101");
    }


}