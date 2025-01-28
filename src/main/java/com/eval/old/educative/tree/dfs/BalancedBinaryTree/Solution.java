package com.eval.old.educative.tree.dfs.BalancedBinaryTree;

import com.eval.old.educative.tree.TreeNode;


public class Solution {


    public static boolean isBalanced(TreeNode<Integer> root){
        return -1 != postOrder(root);
    }

    private static int postOrder(TreeNode<Integer> node) {
        if (node == null){
            return 0;
        }
        int lH = 0;
        int rH = 0;

        int dataL = postOrder(node.left);
            if (dataL != -1){
                lH += dataL;
            }else {
                return -1;
            }

        int dataR = postOrder(node.right);
            if (dataR != -1){
                rH += dataR;
            }else {
                return -1;
            }


        if (Math.max(lH, rH) - Math.min(lH, rH) > 1) {
            return -1;
        } else {
            return Math.max(lH, rH) + 1;
        }
    }
}
