package com.eval.year2025.medium.puzzle684;


import java.util.Arrays;

class Solution {


    public int[] findRedundantConnection(int[][] edges) {
        int [] result = {0, 0};

        // 0 1 2 3 4 5 6 7 8 ... n, n + 1 - every vertex is a parent for itself at the beginning.
        int[] parents = new int[edges.length + 1];
        for(int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }

        //rank is a property of the parent. if it's higher than another vertex's rank
        // then vertex with the lesser rank become its child and the parent rank is increased
        // at first all vertex are their own parents, so their ranks are equal to 1
        int[] ranks = new int[edges.length + 1];
        Arrays.fill(ranks, 1);

        for (int[] edge : edges) {
            if (!union(edge[0],edge[1], parents, ranks)) {
                result = edge;
            }
        }
        return result;
    }


    private boolean union(int v1, int v2, int[] parents, int[] ranks) {
        int parent1 = find(v1, parents);
        int parent2 = find(v2, parents);

        if (parent1 == parent2) {
            return false;
        }

        if (ranks[parent1] > ranks[parent2]) {
            parents[parent2] = parent1;
            ranks[parent1] += ranks[parent2];
        } else {
            parents[parent1] = parent2;
            ranks[parent2] += ranks[parent1];
        }
        return true;
    }

    private int find(int v, int[] parents) {
        if (parents[v] != v) {
            parents[v] =  find(parents[v], parents);
        }
        return parents[v];
    }


}
