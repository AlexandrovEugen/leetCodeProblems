package com.eval.year2025.medium.puzzle2685;

import java.util.*;

class Solution {

    final Map<Integer, Set<Integer>> adj = new HashMap<>();
    final Set<Integer> visited = new HashSet<>();


    public int countCompleteComponents(int n, int[][] edges) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.computeIfPresent(u, (_, s) -> {
                s.add(v);
                return s;
            });
            adj.computeIfPresent(v, (_, s) -> {
                s.add(u);
                return s;
            });
            adj.computeIfAbsent(u, _ -> new HashSet<>()).add(v);
            adj.computeIfAbsent(v, _ -> new HashSet<>()).add(u);
        }


        int res = 0;
        for (int v = 0; v < n; v++) {
            if (visited.contains(v)) continue;

            List<Integer> components = dfs(v, new ArrayList<>());
            boolean b = true;
            for (Integer component : components) {
                if (components.size() - 1 != adj.getOrDefault(component, Collections.emptySet()).size()) {
                    b = false;
                    break;
                }
            }
            if (b) {
                res++;
            }
        }
        return res;
    }

    private List<Integer> dfs(int v, List<Integer> components) {
        if (visited.contains(v)) return components;
        visited.add(v);
        components.add(v);
        for (Integer nei : adj.getOrDefault(v, Collections.emptySet())) {
            dfs(nei, components);
        }
        return components;
    }
}