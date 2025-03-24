package com.eval.year2025.hard.puzzle3108;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        // 1. Build Components
        final UnionFind uf = UnionFind.build(n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }

        // 2. Get costs of each component
        Map<Integer, Integer> cost = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int w = edge[2];
            int root = uf.find(u);
            if (!cost.containsKey(root)) {
                cost.put(root, w);
            } else {
                cost.put(root, cost.get(root) & w);
            }
        }
        //3. Quires
        int[] res = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int r1 = uf.find(query[i][0]);
            int r2 = uf.find(query[i][1]);
            if (r1 != r2) {
                res[i] = -1;
            } else {
                res[i] = cost.get(r1);
            }
        }
        return res;
    }

    private record UnionFind(int[] parents, int[] size) {

        private static UnionFind build(int n) {
            int[] parents = new int[n];
            for (int i = 0; i < n; i++) {
                parents[i] = i;
            }
            int[] size = new int[n];
            Arrays.fill(size, 1);
            return new UnionFind(parents, size);
        }


        int find(int node) {
            if (node != parents[node]) {
                parents[node] = find(parents[node]);
            }
            return parents[node];
        }

        void union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x != y) {
                if (size[x] < size[y]) {
                    parents[x] = y;
                    size[y] += size[x];
                }else {
                    parents[y] = x;
                    size[x] += size[y];
                }
            }
        }

    }

}
