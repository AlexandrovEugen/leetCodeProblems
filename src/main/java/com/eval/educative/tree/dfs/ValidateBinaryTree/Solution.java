package com.eval.educative.tree.dfs.ValidateBinaryTree;

import com.eval.educative.tree.TreeNode;

import java.util.Stack;

public class Solution {

    public static boolean validateBst(TreeNode<Integer> root) {
        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> node = root;
        Stack<Integer> prev = new Stack<>();
        prev.push(Integer.MIN_VALUE);

        while (node != null || !stack.isEmpty()){
            while (node != null){
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            Integer value = prev.pop();

            if (node.data.compareTo(value) < 0){
                return false;
            } else {
                prev.push(node.data);
            }

            node = node.right;
        }
        return true;
    }

}
