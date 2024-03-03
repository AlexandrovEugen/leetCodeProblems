package com.eval.educative.tree.LowestCommonAncestorOfABinarySearchTree;

import com.eval.educative.tree.TreeNode;

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
public class Solution {


    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> node1, TreeNode<Integer> node2) {
        return lcaHelper(root, node1, node2);
    }

    private static TreeNode<Integer> lcaHelper(TreeNode<Integer> node, TreeNode<Integer> node1, TreeNode<Integer> node2) {
        if (node.data.compareTo(node1.data) * node.data.compareTo(node2.data) < 0){
            return node;
        } else if (node.data.compareTo(node1.data) > 0){
            return lcaHelper(node.left, node1,node2);
        }else {
            return lcaHelper(node.right, node1, node2);
        }
    }


}
