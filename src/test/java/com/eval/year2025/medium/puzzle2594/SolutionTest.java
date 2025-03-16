package com.eval.year2025.medium.puzzle2594;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: ranks = [4,2,3,1], cars = 10
    Output: 16
    Explanation:
    - The first mechanic will repair two cars. The time required is 4 * 2 * 2 = 16 minutes.
    - The second mechanic will repair two cars. The time required is 2 * 2 * 2 = 8 minutes.
    - The third mechanic will repair two cars. The time required is 3 * 2 * 2 = 12 minutes.
    - The fourth mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
    It can be proved that the cars cannot be repaired in less than 16 minutes.
    */
    @Test
    void example1() {
        int[] ranks = {4, 2, 3, 1};
        int cars = 10;

        long minTimeToRepair = solution.repairCars(ranks, cars);

        assertThat(minTimeToRepair).isEqualTo(16L);
    }

    /*
    Input: ranks = [5,1,8], cars = 6
    Output: 16
    Explanation:
    - The first mechanic will repair one car. The time required is 5 * 1 * 1 = 5 minutes.
    - The second mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
    - The third mechanic will repair one car. The time required is 8 * 1 * 1 = 8 minutes.
    It can be proved that the cars cannot be repaired in less than 16 minutes.

    */
    @Test
    void example2() {
        int[] ranks = {5, 1, 8};
        int cars = 6;

        long minTimeToRepair = solution.repairCars(ranks, cars);

        assertThat(minTimeToRepair).isEqualTo(16L);
    }
}