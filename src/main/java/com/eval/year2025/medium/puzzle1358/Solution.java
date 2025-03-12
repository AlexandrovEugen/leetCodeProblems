package com.eval.year2025.medium.puzzle1358;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {

    public int numberOfSubstrings(String s) {
        int l = 0;
        final Set<Character> set = Set.of('a', 'b', 'c');
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (int r = 0; r < s.length(); r++) {
            if (set.contains(s.charAt(r))) {
                map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (map.size() == 3) {
                result += s.length() - r;
                if (map.containsKey(s.charAt(l))) {
                    map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                    if (map.get(s.charAt(l)) == 0) {
                        map.remove(s.charAt(l));
                    }
                }
                l++;
            }
        }
        return result;
    }
}
