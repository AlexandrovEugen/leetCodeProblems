package com.eval.year2025.educative._2MergeIntervals.taskScheduler;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    @Test
    void example1(){
        char[] tasks = {'A', 'B', 'A', 'A', 'B', 'C'};
        int n = 3;

        int res = solution.leastInterval(tasks, n);

        assertThat(res).isEqualTo(9);
    }

}