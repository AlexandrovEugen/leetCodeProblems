package com.eval.year2025.medium.puzzle1123;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(new Pair(root, 0)).node;
    }

    private Pair dfs(Pair pair) {
        if (pair.node == null) {
            return new Pair(null, pair.depth + 1);
        }
        var leftPair = dfs(new Pair(pair.node.left, pair.depth + 1));
        var rigthPair = dfs(new Pair(pair.node.right, pair.depth + 1));

        if (leftPair.depth > rigthPair.depth) {
            return leftPair;
        } else if (rigthPair.depth > leftPair.depth) {
            return rigthPair;
        }
        return new Pair(pair.node, leftPair.depth);
    }


    private record Pair(TreeNode node, int depth) {}
}
