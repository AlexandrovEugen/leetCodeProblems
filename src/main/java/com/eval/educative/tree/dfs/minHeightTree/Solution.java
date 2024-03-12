package com.eval.educative.tree.dfs.minHeightTree;

import java.util.*;


public class Solution {

    @Deprecated
    public static List<Integer> minHeightTreesDeprecated(int n, int[][] edges) {
        Map<Integer, Integer> nodes = new HashMap<>();
        List<Integer> roots = new ArrayList<>();
        int maxCount = 1;
        if (n == 1){
            roots.add(0);
            return roots;
        }
        if (n == 2){
            roots.add(edges[0][0]);
            roots.add(edges[0][1]);
        }


        for (int[] edge : edges) {
            int vert1 = edge[0];
            int vert2 = edge[1];

            if (nodes.containsKey(vert1)){
                int count  = nodes.merge(vert1, 1, Integer::sum);
                if (maxCount < count){
                    maxCount = count;
                }
            } else {
                nodes.put(vert1, 1);
            }
            if (nodes.containsKey(vert2)){
                int count = nodes.merge(vert2, 1, Integer::sum);
                if (maxCount < count){
                    maxCount = count;
                }
            } else {
                nodes.put(vert2, 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nodes.get(i) == maxCount){
                roots.add(i);
            }
        }
        
        
        // Replace this placeholder return statement with your code
        return roots;
    }


    public static List<Set<Integer>> constructAdjacencyList(int n, int[][] edges) {
        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }

        return adj;
    }

    // Function to find the minimum height trees in a graph
    public static List<Integer> minHeightTrees(int n, int[][] edges) {
        if (n <= 2) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                result.add(i);
            }
            return result;
        }

        List<Set<Integer>> adj = constructAdjacencyList(n, edges);

        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adj.get(i).size() == 1) {
                leaves.add(i);
            }
        }

        int remNodes = n;

        while (remNodes > 2) {
            remNodes -= leaves.size();

            List<Integer> tempLeaves = new ArrayList<>();

            while (!leaves.isEmpty()) {
                int leaf = leaves.remove(leaves.size() - 1);

                int neighbor = adj.get(leaf).iterator().next();
                adj.get(leaf).remove(neighbor);

                adj.get(neighbor).remove(leaf);

                if (adj.get(neighbor).size() == 1) {
                    tempLeaves.add(neighbor);
                }
            }

            leaves = tempLeaves;
        }

        return leaves;
    }
}
