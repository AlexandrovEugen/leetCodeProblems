package com.eval.year2025.easy.pazzle2843;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();



    /*
    Input: low = 1, high = 100
    Output: 9
    Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
    */

    @Test
    void example1(){
        int low = 1;
        int high = 100;

        int res = solution.countSymmetricIntegers(low, high);

        assertThat(res).isEqualTo(9);
    }

    /*
    Input: low = 1200, high = 1230
    Output: 4
    Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
    */
    @Test
    void example2(){
        int low = 1200;
        int high = 1230;

        int res = solution.countSymmetricIntegers(low, high);

        assertThat(res).isEqualTo(4);
    }

    @Test
    void example3(){
        int low = 100;
        int high = 1782;

        int res = solution.countSymmetricIntegers(low, high);

        assertThat(res).isEqualTo(44);
    }

}