package com.eval.educative.tree.SerializeAndDeserializeBinaryTree;


import com.eval.educative.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


class Solution {
    // Initializing our marker as the max possible int value
    private static final String MARKER = "M";
    private static int m = 1;

    private static void serializeRec(TreeNode<Integer> node, List<String> stream) {
        if (node == null) {
            String s = Integer.toString(m);
            stream.add(MARKER + s);
            m = m + 1;
            return;
        }

        stream.add(String.valueOf(node.data));

        serializeRec(node.left, stream);
        serializeRec(node.right, stream);
    }

    // Function to serialize tree into a list.
    public static List<String> serialize(TreeNode<Integer> root) {
        List<String> stream = new ArrayList<>();
        serializeRec(root, stream);
        return stream;
    }

    public static TreeNode<Integer> deserializeHelper(List<String> stream) {
        String val = stream.remove(stream.size() - 1);

        if (val.charAt(0) == MARKER.charAt(0)) {
            return null;
        }

        TreeNode<Integer> node = new TreeNode<Integer>(Integer.parseInt(val));

        node.left = deserializeHelper(stream);
        node.right = deserializeHelper(stream);

        return node;
    }

    // Function to deserialize list into a binary tree.
    public static TreeNode<Integer> deserialize(List<String> stream) {
        Collections.reverse(stream);
        TreeNode<Integer> node = deserializeHelper(stream);
        return node;
    }

    // Driver cod


    @Deprecated
    public static List<String> serializeOld(TreeNode<Integer> root) {
        final List<String> nodes = new ArrayList<>();
        preOrderTraversalOld(root, nodes);

        return nodes;
    }

    @Deprecated
    private static void preOrderTraversalOld(TreeNode<Integer> root, List<String> nodes) {
        if (root == null) {
            nodes.add("null");
        } else {
            nodes.add(String.valueOf(root.data));
            preOrderTraversalOld(root.left, nodes);
            preOrderTraversalOld(root.right, nodes);
        }
    }

    @Deprecated
    public static TreeNode<Integer> deserializeOld(List<String> nodes) {
        final Stack<TreeNode<Integer>> parent = new Stack<>();
        if (nodes.isEmpty() || "null".equals(nodes.get(0))) {
            return null;
        }
        TreeNode<Integer> root = new TreeNode<>(Integer.valueOf(nodes.remove(0)));
        final TreeNode<Integer> tmp = root;
        parent.push(tmp);
        parent.push(root);


        for (String node : nodes) {
            if (!"null".equals(node)) {
                final Integer value = Integer.valueOf(node);
                if (root.data.compareTo(value) >= 0) {
                    root.left = new TreeNode<>(value);
                    root = root.left;
                } else {
                    root.right = new TreeNode<>(value);
                    root = root.right;
                }
                parent.push(root);
            } else {
                root = parent.pop();
            }
        }

        // Replace this placeholder return statement with your code
        return tmp;
    }


}
