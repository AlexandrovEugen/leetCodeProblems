package com.eval.educative.tree.dfs.DiameterOfBinaryTree;

import com.eval.educative.tree.TreeNode;

import java.util.Stack;

public class Solution {


    public static int diameterOfBinaryTree(TreeNode<Integer> root){
        Stack<Integer> diameters = new Stack<>();
        diameters.push(0);
        nodeHeight(root, diameters);
        return diameters.pop();
    }
    private static int nodeHeight(TreeNode<Integer> node, Stack<Integer> diameter){
        int leftHight = 0;
        int rigthHight = 0;
        if(node.left != null){
            leftHight += nodeHeight(node.left, diameter);
        }
        if(node.right != null){
            rigthHight += nodeHeight(node.right, diameter);
        }
        if (diameter.peek().compareTo(leftHight + rigthHight) < 0){
            diameter.pop();
            diameter.push(leftHight + rigthHight);
        }
        return  Math.max(leftHight,rigthHight) + 1;
    }

}
