package com.eval.year2025.medium.puzzle2349;

import java.util.*;

class NumberContainers {

    private final Map<Integer, Integer> indexToNumber;
    private final Map<Integer, TreeSet<Integer>> numberToIndexes;

    public NumberContainers() {
        indexToNumber = new HashMap<>();
        numberToIndexes = new HashMap<>();
    }

    public void change(int index, int number) {
        Integer prevNumber = indexToNumber.get(index);
        if (prevNumber != null) {
            numberToIndexes.get(prevNumber).remove(index);
        }
        indexToNumber.put(index, number);
        numberToIndexes.computeIfPresent(number, (_, set) -> {
            set.add(index);
            return set;
        });
        numberToIndexes.computeIfAbsent(number, _ -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        final TreeSet<Integer> indexes = numberToIndexes.get(number);
        if (indexes == null || indexes.isEmpty()) {
            return -1;
        }else {
            return numberToIndexes.get(number).getFirst();
        }
    }
}

/*
  Your NumberContainers object will be instantiated and called as such:
  NumberContainers obj = new NumberContainers();
  obj.change(index,number);
  int param_2 = obj.find(number);
 */