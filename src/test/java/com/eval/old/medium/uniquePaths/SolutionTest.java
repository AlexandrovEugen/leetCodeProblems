package com.eval.old.medium.uniquePaths;

import com.eval.old.medium.uniquePaths.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution = new Solution();


    @Test
    void example1(){
        int m = 3, n = 7;

        int uniquePaths = solution.uniquePaths(m, n);

        assertThat(uniquePaths).isEqualTo(28);
    }
    @Test
    void example2(){
        int m = 3, n = 2;

        int uniquePaths = solution.uniquePaths(m, n);

        assertThat(uniquePaths).isEqualTo(3);
    }

}