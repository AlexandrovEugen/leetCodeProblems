package com.eval.old.educative.tree.dfs.LowestCommonAncestorOfABinaryTree;

import com.eval.old.educative.tree.TreeNode;

import java.util.Stack;

public class Solution {

    public TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        final Stack<TreeNode<Integer>> stack = new Stack<>();
        traversHelper(root, p, q, stack);
        return stack.pop();
    }

    private int traversHelper(TreeNode<Integer> node, TreeNode<Integer> p, TreeNode<Integer> q, Stack<TreeNode<Integer>> stack) {
        if (node == null){
            return 0;
        }



        int ln = traversHelper(node.left, p, q, stack);
        int rn = traversHelper(node.right, p, q, stack);
        int c = 0;
        if (node.data.equals(p.data) || node.data.equals(q.data)){
            c = 1;
        }
        int check = ln + rn + c;
        if (check == 2){
            stack.push(node);
            return 0;
        }
        return check;
    }

}
