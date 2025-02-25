package com.eval.year2025.medium.puzzle2467;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionFromChatGpt {

    static class Result {
        int maxProfit = Integer.MIN_VALUE;
    }

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
        List<Integer>[] graph = new ArrayList[n];

        // Initialize adjacency list
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        // Find Bob's path from bob to root (0)
        Map<Integer, Integer> bobTime = new HashMap<>();
        findBobPath(graph, bob, -1, 0, bobTime);

        // DFS to find max profit path for Alice
        Result result = new Result();
        dfsAlice(graph, 0, -1, 0, 0, bobTime, amount, result);

        return result.maxProfit;
    }

    // DFS to track Bob's time to each node
    private boolean findBobPath(List<Integer>[] graph, int node, int parent, int time, Map<Integer, Integer> bobTime) {
        bobTime.put(node, time);
        if (node == 0) return true;

        for (int neighbor : graph[node]) {
            if (neighbor != parent && findBobPath(graph, neighbor, node, time + 1, bobTime)) {
                return true;
            }
        }

        bobTime.remove(node);
        return false;
    }

    // DFS for Alice, tracking max profit
    private void dfsAlice(List<Integer>[] graph, int node, int parent, int time, int profit, Map<Integer, Integer> bobTime, int[] amount, Result result) {
        if (bobTime.containsKey(node)) {
            int bobArrival = bobTime.get(node);
            if (bobArrival > time) {
                profit += amount[node];  // Alice alone
            } else if (bobArrival == time) {
                profit += amount[node] / 2;  // Split with Bob
            }
        } else {
            profit += amount[node]; // Alice alone
        }

        boolean isLeaf = true;
        for (int neighbor : graph[node]) {
            if (neighbor != parent) {
                isLeaf = false;
                dfsAlice(graph, neighbor, node, time + 1, profit, bobTime, amount, result);
            }
        }

        if (isLeaf) {
            result.maxProfit = Math.max(result.maxProfit, profit);
        }
    }

}
