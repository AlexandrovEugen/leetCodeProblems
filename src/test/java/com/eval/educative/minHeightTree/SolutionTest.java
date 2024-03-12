package com.eval.educative.minHeightTree;

import com.eval.educative.tree.dfs.minHeightTree.Solution;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void case1(){
        List<Integer> roots = Solution.minHeightTrees(6, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {4, 5}});
        assertThat(roots).isNotEmpty();

        List.of(0, 4).forEach(v -> assertThat(roots.contains(v)).isTrue());

    }

    @Test
    void case2(){
        List<Integer> roots = Solution.minHeightTrees(9, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 4}, {0, 5}, {5, 6}, {0, 7}, {0, 8}});
        assertThat(roots).isNotEmpty();

        List.of(0).forEach(v -> assertThat(roots.contains(v)).isTrue());

    }

}