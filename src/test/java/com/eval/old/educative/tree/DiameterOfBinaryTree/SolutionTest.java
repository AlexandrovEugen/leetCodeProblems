package com.eval.old.educative.tree.DiameterOfBinaryTree;

import com.eval.old.educative.tree.TreeNode;
import com.eval.old.educative.tree.dfs.DiameterOfBinaryTree.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {


    @Test
    void case1(){
        TreeNode<Integer> root = new TreeNode<>(1);
        var tmpLeft  = root.left = new TreeNode<>(2);
        var tmpRight = root.right = new TreeNode<>(3);
        tmpLeft.left = new TreeNode<>(4);
        tmpLeft.right = new TreeNode<>(5);
        tmpRight.left = new TreeNode<>(6);

        assertThat(Solution.diameterOfBinaryTree(root)).isEqualTo(4);

    }

}