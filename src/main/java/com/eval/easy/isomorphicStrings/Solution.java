package com.eval.easy.isomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {


    public boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        final Map<Character, Character> map = new HashMap<>();
        final Set<Character> set = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            final char c1 = str1.charAt(i);
            final char c2 = str2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (set.contains(c2)) return false;
                map.put(c1, c2);
                set.add(c2);
            }
        }
        return true;
    }


}
