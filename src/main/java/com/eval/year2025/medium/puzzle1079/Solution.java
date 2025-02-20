package com.eval.year2025.medium.puzzle1079;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numTilePossibilities(String tiles) {
        final Map<Character,Integer> map = new HashMap<>();

        for (char c : tiles.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return backtrack(map);
    }

    private int backtrack(Map<Character, Integer> map) {
        int result = 0;
        for (char c : map.keySet()) {
            if (map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                result += 1;
                result += backtrack(map);
                map.put(c, map.get(c) + 1);
            }
        }
        return result;
    }
}