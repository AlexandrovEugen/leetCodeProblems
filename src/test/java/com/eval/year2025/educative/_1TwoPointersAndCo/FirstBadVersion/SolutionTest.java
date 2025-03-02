package com.eval.year2025.educative._1TwoPointersAndCo.FirstBadVersion;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example1(){
        int n = 5, bad = 4;
        solution.setFirstBadVersion(bad);
        int firstBadVersion = solution.firstBadVersion(n);

        assertThat(firstBadVersion).isEqualTo(bad);
    }

    @Test
    void example2(){
        int n = 2126753390, bad = 1702766719;
        solution.setFirstBadVersion(bad);
        int firstBadVersion = solution.firstBadVersion(n);

        assertThat(firstBadVersion).isEqualTo(bad);
    }

}