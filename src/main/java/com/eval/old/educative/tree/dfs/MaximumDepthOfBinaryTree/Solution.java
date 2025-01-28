package com.eval.old.educative.tree.dfs.MaximumDepthOfBinaryTree;

import com.eval.old.educative.tree.TreeNode;

import java.util.Stack;

public class Solution {

    @Deprecated
    public static int findMaxDepthRecursive(TreeNode<Integer> root) {
        return findMaxDepthHelper(root);
    }

    @Deprecated
    private static int findMaxDepthHelper(TreeNode<Integer> node) {
        if (node == null){
            return 0;
        }
        int lb = findMaxDepthHelper(node.left);
        int rb = findMaxDepthHelper(node.right);

        return Math.max(lb, rb) + 1;
    }


    public static int findMaxDepth(TreeNode<Integer> root) {
        if (root == null){
            return 0;
        }
        final Stack<TreeNode<Integer>> parentNode = new Stack<>();
        final Stack<Integer> depths = new Stack<>();

        int maxDepth = 0;

        parentNode.push(root);
        depths.push(1);

        while (!parentNode.isEmpty()){
            TreeNode<Integer> node = parentNode.pop();
            int depth = depths.pop();

            if (node.left != null){
                parentNode.push(node.left);
                depths.push(depth + 1);
            }
            if (node.right != null){
                parentNode.push(node.right);
                depths.push(depth + 1);
            }

            if (node.left == null && node.right == null){
                maxDepth = Math.max(maxDepth, depth);
            }
        }
        return maxDepth;
    }



}
