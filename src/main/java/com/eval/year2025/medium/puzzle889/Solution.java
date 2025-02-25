package com.eval.year2025.medium.puzzle889;


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
class Solution {

    private int[] postToNumIndex;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        postToNumIndex = new int[postorder.length];

        for (int i = 0; i < postorder.length; i++) {
            postToNumIndex[postorder[i]] = i;
        }

        return buildTreeNode(0, preorder.length - 1, 0, preorder.length  -1, preorder, postorder);
    }

    private TreeNode buildTreeNode(int preStart, int preEnd, int poStart, int poEnd, int[] preorder, int[] postorder) {
        if(preStart > preEnd || poStart > poEnd) {
            return null;
        }

        var root = new TreeNode(preorder[preStart]);

        if (preStart != preEnd) {
            int leftVal = preorder[preStart + 1];
            int mid = postToNumIndex[leftVal];
            int leftSize = mid - poStart + 1;

            root.left = buildTreeNode(preStart + 1, preStart + leftSize, poStart, mid, preorder, postorder);
            root.right = buildTreeNode(preStart + leftSize + 1, preEnd, mid + 1, poEnd - 1, preorder, postorder);
        }
        return root;
    }
}