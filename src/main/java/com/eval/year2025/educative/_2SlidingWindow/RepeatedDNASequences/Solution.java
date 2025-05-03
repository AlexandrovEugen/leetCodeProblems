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
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('T', 2);
        map.put('G', 3);

        final List<Integer> codes = new ArrayList<>();

        for(char c: s.toCharArray()){
            codes.add(map.get(c));
        }

        int k = 10;

        if(k > codes.size()) return new ArrayList<>();

        int h = 0;
        int a = 4;
        int ak = 1;

        for(int i = 0; i < k; i++){
            h = h * a + codes.get(i);
            ak *= a;
        }

        Set<Integer> seenHash = new HashSet<>();
        Set<String> output = new HashSet<>();

        seenHash.add(h);

        for(int l = 1; l <= codes.size() - k; l++){
            h = h * a - codes.get(l - 1) * ak + codes.get(l + k - 1);

            if(seenHash.contains(h)){
                output.add(s.substring(l, l + k));
            }else {
                seenHash.add(h);
            }
        }

        return new ArrayList<>(output);
    }
}
