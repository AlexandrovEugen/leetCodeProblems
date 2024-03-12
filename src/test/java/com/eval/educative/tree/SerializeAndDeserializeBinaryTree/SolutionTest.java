package com.eval.educative.tree.SerializeAndDeserializeBinaryTree;

import com.eval.educative.tree.TreeNode;
import com.eval.educative.tree.dfs.SerializeAndDeserializeBinaryTree.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {


    @Test
    void case1(){
        List<Integer> stream = List.of(50, 25, 75, 200, 350);
        TreeNode<Integer> root = new TreeNode<>(100);

        stream.forEach(i -> buildTree(root, i));


        val serialize = Solution.serialize(root);

        TreeNode<Integer> rootDes = Solution.deserialize(serialize);

        assertThat(rootDes).isEqualTo(root);

    }
    @Test
    void case2(){
        List<Integer> stream = List.of(50, 200, 25, 75, 350);
        TreeNode<Integer> root = new TreeNode<>(100);

        stream.forEach(i -> buildTree(root, i));


        val serialize = Solution.serialize(root);

        TreeNode<Integer> rootDes = Solution.deserialize(serialize);

        assertThat(rootDes).isEqualTo(root);

    }

    private void buildTree(TreeNode<Integer> root, int value) {
        if (root.data > value){
            if (root.left != null){
                buildTree(root.left, value);
            } else {
                root.left = new TreeNode<>(value);
            }
        } else {
            if (root.right != null){
                buildTree(root.right, value);
            } else {
                root.right = new TreeNode<>(value);
            }
        }
    }


}