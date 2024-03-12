package com.eval.educative.tree.dfs.BuildBinaryTreeFromPreorderAndInorderTraversal;

import com.eval.educative.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {



    public static TreeNode<Integer> buildTree(int[] pOrder, int[] iOrder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < iOrder.length; i++) {
            map.put(iOrder[i], i);
        }

        int[] pIndex = {0};


        return buildTreeHelperIterative(pOrder, 0, iOrder.length -1, map, pIndex);
    }

    private static TreeNode<Integer> buildTreeHelperIterative(int[] pOrder, int left, int right, Map<Integer, Integer> map, int[] pIndex) {
        return null;
    }

    private static TreeNode<Integer> buildTreeHelper(int[] pOrder, int left, int right, Map<Integer, Integer> map, int[] pIndex) {
        if (left > right) return null;
        int cur = pOrder[pIndex[0]];
        pIndex[0]++;
        TreeNode<Integer> node = new TreeNode<>(cur);

        if (left == right) return node;

        int iIndex = map.get(cur);

        node.left = buildTreeHelper(pOrder, left, iIndex - 1, map, pIndex);
        node.right = buildTreeHelper(pOrder, iIndex + 1, right, map, pIndex);


        return node;
    }




}
