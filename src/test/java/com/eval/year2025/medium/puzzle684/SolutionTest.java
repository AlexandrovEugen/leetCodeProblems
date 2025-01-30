package com.eval.year2025.medium.puzzle684;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example1(){
        final int[][] edges = {{1, 2}, {1,3}, {2,3}};

        val redundantConnection = solution.findRedundantConnection(edges);

        assertThat(redundantConnection[0]).isEqualTo(2);
        assertThat(redundantConnection[1]).isEqualTo(3);

    }

    @Test
    void example2(){
        final int[][] edges = {{1,2},{2,3},{3,4},{1,4},{1,5}};

        val redundantConnection = solution.findRedundantConnection(edges);

        assertThat(redundantConnection[0]).isEqualTo(1);
        assertThat(redundantConnection[1]).isEqualTo(4);

    }    @Test

    void example3(){
        final int[][] edges = {{9,10},{5,8},{2,6},{1,5},{3,8},{4,9},{8,10},{4,10},{6,8},{7,9}};

        val redundantConnection = solution.findRedundantConnection(edges);

        assertThat(redundantConnection[0]).isEqualTo(4);
        assertThat(redundantConnection[1]).isEqualTo(10);

    }

}