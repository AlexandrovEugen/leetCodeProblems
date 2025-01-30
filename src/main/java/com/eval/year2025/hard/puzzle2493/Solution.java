package com.eval.year2025.hard.puzzle2493;

import java.util.*;

class Solution {

    public int magnificentSets(int n, int[][] edges) {
        List<Integer>[] g = new List[n];
        Arrays.setAll(g, _ -> new ArrayList<>());
        for (var e : edges) {
            int a = e[0] - 1, b = e[1] - 1;
            g[a].add(b);
            g[b].add(a);
        }
        int[] d = new int[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; ++i) {
            Deque<Integer> q = new ArrayDeque<>();
            q.offer(i);
            Arrays.fill(dist, 0); //????? it's already populated with 0.
            dist[i] = 1;
            int mx = 1;
            int root = i;
            while (!q.isEmpty()) {
                int a = q.poll();
                root = Math.min(root, a);
                for (int b : g[a]) {
                    if (dist[b] == 0) {
                        dist[b] = dist[a] + 1;
                        mx = Math.max(mx, dist[b]);
                        q.offer(b);
                    } else if (Math.abs(dist[b] - dist[a]) != 1) {
                        return -1;
                    }
                }
            }
            d[root] = Math.max(d[root], mx);
        }
        return Arrays.stream(d).sum();
    }


    @Deprecated
    public int magnificentSetsNotWorking(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> adjacencyMap = new HashMap<>();
        for (int[] edge : edges) {
            if (adjacencyMap.containsKey(edge[0])) {
                adjacencyMap.get(edge[0]).add(edge[1]);
            } else {
                List<Integer> value = new ArrayList<>();
                value.add(edge[1]);
                adjacencyMap.put(edge[0], value);
            }
            if (adjacencyMap.containsKey(edge[1])) {
                adjacencyMap.get(edge[1]).add(edge[0]);
            } else {
                List<Integer> value = new ArrayList<>();
                value.add(edge[0]);
                adjacencyMap.put(edge[1], value);
            }
        }

        int[] visited = new int[n + 1];

        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 1) {
                continue;
            }
            visited[i] = 1;

            List<Integer> components = getConnectedComponent(i, adjacencyMap);
            int maxCount = 0;
            for (int source : components) {
                int length = longestPathFromTheSource(source, adjacencyMap);
                if (length == -1) {
                    return -1;
                }
                maxCount = Math.max(maxCount, length);
            }
            res += maxCount;
        }
        return res;
    }

    //BFS Implementation
    private int longestPathFromTheSource(int source, HashMap<Integer, List<Integer>> adjacencyMap) {
        final Deque<int[]> nodesAndGroup = new ArrayDeque<>(); // int[0] - node, int[1] - group.
        int[] dist = new int[adjacencyMap.size() + 1];
        nodesAndGroup.add(new int[]{source, 1});

        while (!nodesAndGroup.isEmpty()) {
            int[] nodeAndGroup = nodesAndGroup.removeFirst();
            int node = nodeAndGroup[0];
            int group = nodeAndGroup[1];
            for (int neighbor : adjacencyMap.get(node)) {
                if (dist[neighbor] != 0) {
                    if (dist[neighbor] == group) {
                        return -1;
                    }
                    continue;
                }
                nodesAndGroup.add(new int[]{neighbor, group + 1});
                dist[neighbor]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int group : dist) {
            max = Math.max(max, group);
        }
        return max;
    }

    private List<Integer> getConnectedComponent(int src, HashMap<Integer, List<Integer>> adjacencyMap) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(src);

        List<Integer> comp = new ArrayList<>();
        comp.add(src);

        while (!stack.isEmpty()) {
            int node = stack.removeFirst();
            for (int neighbor : adjacencyMap.get(node)) {
                if (comp.contains(neighbor)) {
                    continue;
                }
                stack.push(neighbor);
                comp.add(neighbor);
            }
        }
        return comp;
    }

}
