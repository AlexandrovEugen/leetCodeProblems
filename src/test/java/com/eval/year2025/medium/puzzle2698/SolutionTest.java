package com.eval.year2025.medium.puzzle2698;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: n = 10
    Output: 182
    Explanation: There are exactly 3 integers i in the range [1, 10] that satisfy the conditions in the statement:
            - 1 since 1 * 1 = 1
            - 9 since 9 * 9 = 81 and 81 can be partitioned into 8 and 1 with a sum equal to 8 + 1 == 9.
            - 10 since 10 * 10 = 100 and 100 can be partitioned into 10 and 0 with a sum equal to 10 + 0 == 10.
    Hence, the punishment number of 10 is 1 + 81 + 100 = 182
    */
    @Test
    void example1(){
        int n = 10;

        int punishmentNumber = solution.punishmentNumber(n);

        assertThat(punishmentNumber).isEqualTo(182);
    }


    /*
    Input: n = 37
    Output: 1478
    Explanation: There are exactly 4 integers i in the range [1, 37] that satisfy the conditions in the statement:
            - 1 since 1 * 1 = 1.
            - 9 since 9 * 9 = 81 and 81 can be partitioned into 8 + 1.
            - 10 since 10 * 10 = 100 and 100 can be partitioned into 10 + 0.
            - 36 since 36 * 36 = 1296 and 1296 can be partitioned into 1 + 29 + 6.
    Hence, the punishment number of 37 is 1 + 81 + 100 + 1296 = 1478
    */
    @Test
    void example2(){
        int n = 37;

        int punishmentNumber = solution.punishmentNumber(n);

        assertThat(punishmentNumber).isEqualTo(1478);
    }


}