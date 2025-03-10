package com.eval.year2025.medium.puzzle3306;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {

    final Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');

    public long countOfSubstrings(String word, int k) {
        return atLeast(word, k) - atLeast(word, k + 1);
    }


    private long atLeast(String word, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int non_vowel = 0;
        long result = 0;
        int l = 0;

        for (int r = 0; r < word.length(); r++) {
            if (set.contains(word.charAt(r))) {
                map.put(word.charAt(r), map.getOrDefault(word.charAt(r), 0) + 1);
            } else {
                non_vowel++;
            }
            while (map.size() == 5 && non_vowel >= k) {
                result += word.length() - r;
                if (set.contains(word.charAt(l))) {
                    map.put(word.charAt(l), map.getOrDefault(word.charAt(l), 0) - 1);
                    if (map.get(word.charAt(l)) == 0) {
                        map.remove(word.charAt(l));
                    }
                } else {
                    non_vowel--;
                }
                l += 1;
            }
        }

        return result;
    }
}
