package com.eval.educative.tree.InverBinaryTree;

import com.eval.educative.tree.TreeNode;

public class Solution {

    public static TreeNode<Integer> invertTree(TreeNode<Integer> root){
        root = postOrderTraversal(root);
        return root;
    }

    private static TreeNode<Integer> postOrderTraversal(TreeNode<Integer> node) {
        if (node == null){
            return null;
        }
        TreeNode<Integer> left = postOrderTraversal(node.left);
        TreeNode<Integer> right =  postOrderTraversal(node.right);
        node.right = left;
        node.left = right;
        return node;
    }

}
