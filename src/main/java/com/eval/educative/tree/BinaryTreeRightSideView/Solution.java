package com.eval.educative.tree.BinaryTreeRightSideView;

import com.eval.educative.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    // Definiton of a binary tree node class
// class TreeNode<T> {
//     T data;
//     TreeNode<T> left;
//     TreeNode<T> right;

//     TreeNode(T data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

    public static List<Integer> rightSideView(TreeNode<Integer> root) {
        final List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        final Stack<TreeNode<Integer>> parent = new Stack<>();
        final Stack<Integer> depths = new Stack<>();
        parent.push(root);
        depths.push(0);


        while (!parent.isEmpty()){
            final TreeNode<Integer> node = parent.pop();
            final int depth = depths.pop();
            if (depth == result.size()){
                result.add(node.data);
            }
            if (node.left != null){
                parent.push(node.left);
                depths.push(depth + 1);
            }
            if (node.right != null){
                parent.push(node.right);
                depths.push(depth + 1);
            }
        }
        // Replace this placeholder return statement with your code
        return result;
    }

}
