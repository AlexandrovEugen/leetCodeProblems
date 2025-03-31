package com.eval.year2025.medium.puzzle763;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        final HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charredAt = s.charAt(i);
            map.put(charredAt, i);
        }
        int end = 0;
        int prevPartitionEnd = -1;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Integer lastIndex = map.get(s.charAt(i));
            if (lastIndex > end) {
                end = lastIndex;
            }
            if (i == end){
                result.add(i - prevPartitionEnd);
                prevPartitionEnd = i;
            }
        }
        return result;
    }
}
