package com.eval.old.medium.numberOfIslands;

import com.eval.old.medium.numberOfIslands.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    @Test
    void test1() {
        final char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        val expectedOutput = 1;
        val actualOutput = solution.numIslands(grid);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    void test2() {
        final char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        val expectedOutput = 3;
        val actualOutput = solution.numIslands(grid);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
    @Test
    void test3() {
        final char[][] grid = {
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'}
        };
        val expectedOutput = 1;
        val actualOutput = solution.numIslands(grid);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
}