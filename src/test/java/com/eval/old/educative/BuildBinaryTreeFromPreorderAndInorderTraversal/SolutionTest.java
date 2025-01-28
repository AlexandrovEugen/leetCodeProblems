package com.eval.old.educative.BuildBinaryTreeFromPreorderAndInorderTraversal;


import com.eval.old.educative.tree.dfs.BuildBinaryTreeFromPreorderAndInorderTraversal.Solution;
import com.eval.old.educative.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void case1(){
        TreeNode<Integer> node = Solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertThat(node).isNotNull();
        assertThat(node.data).isEqualTo(3);
    }

}