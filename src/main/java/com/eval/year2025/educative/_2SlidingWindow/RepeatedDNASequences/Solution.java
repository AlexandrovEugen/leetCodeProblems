package com.eval.year2025.educative._2SlidingWindow.RepeatedDNASequences;

import java.util.*;

class Solution {


    public List<String> findRepeatedDnaSequencesPassButNotThatEfficient(String s) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }

        return new ArrayList<>(map.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList());
    }


    public List<String> findRepeatedDnaSequences(String s) {
//        int cap = 'A' - '0';
        List<Integer> codes = new ArrayList<>();
        for (char c : s.toCharArray()) {
            codes.add((c - '0'));
        }

        int k = 10;

        if (k > s.length()) return new ArrayList<>();

        int a = 4;
        int h = 0;
        int ak = 1;

        for (int i = 0; i < k; i++) {
            h = h * a + codes.get(i);
            ak *= a;
        }


        final Set<String> output = new HashSet<>();
        final Set<Integer> seenHash = new HashSet<>();

        seenHash.add(h);

        for (int l = 1; l <= codes.size() - k; l++) {

            h = h * a - codes.get(l - 1) * ak + codes.get(l + k - 1);

            if (seenHash.contains(h)) {
                output.add(s.substring(l, l + k));
            } else {
                seenHash.add(h);
            }
        }


        return new ArrayList<>(output);
    }
}
