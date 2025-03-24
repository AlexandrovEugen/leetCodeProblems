package com.eval.year2025.medium.puzzle1976;


import java.util.*;

class Solution {

    public int countPaths(int n, int[][] roads) {
        final Map<Integer, Set<VW>> adj = new HashMap<>();
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int w = road[2];
            adj.computeIfPresent(u, (_, set) -> {
                set.add(new VW(v, w));
                return set;
            });
            adj.computeIfPresent(v, (_, set) -> {
                set.add(new VW(u, w));
                return set;
            });
            adj.computeIfAbsent(u, _ -> new HashSet<>()).add(new VW(v, w));
            adj.computeIfAbsent(v, _ -> new HashSet<>()).add(new VW(u, w));
        }

        final TreeSet<CostNode> minHeap = new TreeSet<>(Comparator.comparing(costNode -> costNode.w));
        minHeap.add(new CostNode(0, 0));

        int[] minCost = new int[n];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        int[] pathCount = new int[n];
        pathCount[0] = 1;

        int MOD = 1000000007;
        while (!minHeap.isEmpty()) {
            CostNode costNode = minHeap.pollFirst();
            int node = costNode.node();
            int cost = costNode.w();

            for (VW vw : adj.get(node)) {
                int nei = vw.v();
                int nei_cost = vw.w();
                if (cost + nei_cost < minCost[nei]) {
                    minCost[nei] = cost + nei_cost;
                    pathCount[nei] = pathCount[node];
                    minHeap.add(new CostNode(nei_cost + cost, nei));
                } else if (cost + nei_cost == minCost[nei]) {
                    pathCount[nei] = (pathCount[nei] + pathCount[node]) % MOD;
                }
            }
        }
        return pathCount[n - 1];
    }

    private record VW(int v, int w) {
    }

    private record CostNode(int w, int node) {
    }
}