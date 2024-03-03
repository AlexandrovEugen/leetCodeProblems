package com.eval.educative.tree.LowestCommonAncestorOfABinarySearchTree;


import com.eval.educative.tree.TreeNode;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.*;


class SolutionTest {


    @Test
    void case1(){
        List<TreeNode<Integer>> nodeList = new ArrayList<>();
        Arrays.asList(6,2,8,0,4,7,9,null,null,3,5).forEach(i -> {
            if (Objects.isNull(i)){
                nodeList.add(null);
            } else {
                nodeList.add(new TreeNode<>(i));
            }
        });
        val root = createBinaryTree(nodeList);

        Solution.lowestCommonAncestor(root, new TreeNode<>(2), new TreeNode<>(4));

    }

    private TreeNode<Integer> createBinaryTree(List<TreeNode<Integer>> ListOfNodes) {
        if (ListOfNodes.isEmpty()) {
            return null;
        }

        // Create the root node of the binary tree
        TreeNode<Integer> root = new TreeNode<>(ListOfNodes.get(0).data);

        // Create a queue and add the root node to it
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        // Start iterating over the list of ListOfNodes starting from the second node
        int i = 1;
        while (i < ListOfNodes.size()) {
            // Get the next node from the queue
            TreeNode<Integer> curr = q.remove();

            // If the node is not null, create a new TreeNode object for its left child,
            // set it as the left child of the current node, and add it to the queue
            if (ListOfNodes.get(i) != null) {
                curr.left = new TreeNode<>(ListOfNodes.get(i).data);
                q.add(curr.left);
            }

            i++;

            // If there are more ListOfNodes in the list and the next node is not null,
            // create a new TreeNode object for its right child, set it as the right child
            // of the current node, and add it to the queue
            if (i < ListOfNodes.size() && ListOfNodes.get(i) != null) {
                curr.right = new TreeNode<>(ListOfNodes.get(i).data);
                q.add(curr.right);
            }

            i++;
        }

        // Return the root of the binary tree
        return root;
    }

}