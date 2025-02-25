package com.eval.year2025.medium.puzzle2467;

import java.util.*;

class Solution {

    final HashMap<Integer, Integer> visited = new HashMap<>();
    final HashMap<Integer, Set<Integer>> adjacencyList = new HashMap<>();


    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        //Dry run
        for (int[] edge : edges) {
            adjacencyList.computeIfPresent(edge[0], (_, s) -> {
                s.add(edge[1]);
                return s;
            });
            adjacencyList.computeIfPresent(edge[1], (_, s) -> {
                s.add(edge[0]);
                return s;
            });
            adjacencyList.computeIfAbsent(edge[0], (_) -> new HashSet<>()).add(edge[1]);
            adjacencyList.computeIfAbsent(edge[1], (_) -> new HashSet<>()).add(edge[0]);
        }

        dfs(bob, -1,0);

        final Deque<int[]> queue = new LinkedList<>();
        //node, time, parent, total profit
        int result = Integer.MIN_VALUE;
        int[] root_tuple = {0, 0, -1, amount[0]};
        queue.add(root_tuple);


        while (!queue.isEmpty()) {
            var tuple = queue.poll();
            int node = tuple[0];
            int time = tuple[1];
            int parent = tuple[2];
            int total_amount = tuple[3];
            for (Integer adjNode : adjacencyList.get(node)) {
                if (adjNode == parent) continue;
                var next_time = time + 1;
                var profit = amount[adjNode];
                if (visited.containsKey(adjNode)) {
                    if (next_time > visited.get(adjNode)) {
                        profit = 0;
                    }
                    else if (next_time == visited.get(adjNode)) {
                        profit /= 2;
                    }
                }
                queue.add(new int[] {adjNode, next_time, node, profit + total_amount});
                if (adjacencyList.get(adjNode).size() == 1) {
                    result = Math.max(result, profit + total_amount);
                }
            }
        }
        return result;
    }


    private boolean dfs(int node,int prev, int time) {
        visited.put(node, time);
        if (node == 0) return true;
        for (Integer adjNode : adjacencyList.get(node)) {
            if (adjNode == prev) continue;
            if (dfs(adjNode, node, time + 1)){
                visited.put(node, time);
                return true;
            }
        }
        return false;
    }
}