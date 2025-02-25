package com.eval.year2025.medium.puzzle1261;


import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {

    private final TreeNode root;
    private final Set<Integer> elements = new HashSet<>();

    public FindElements(TreeNode root) {
        if (root != null) {
            root.val = 0;
            healTheTree(root.left,0, 1);
            healTheTree(root.right,0, 2);
        }
        this.root = root;
    }

    private void healTheTree(TreeNode node, int parentVal, int inc) {
        if (node == null) {
            return;
        }
        node.val = parentVal * 2 + inc;
        elements.add(node.val);
        healTheTree(node.left, node.val, 1);
        healTheTree(node.right,node.val, 2);
    }

    public boolean find(int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }
        return elements.contains(target);
    }

}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */