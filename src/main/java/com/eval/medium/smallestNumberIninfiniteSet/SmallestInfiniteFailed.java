package com.eval.medium.smallestNumberIninfiniteSet;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class SmallestInfiniteFailed {


    private final Map<Integer, Integer> removedMap = new HashMap<>();
    private Integer smallest = 1;

    @Deprecated
    public int popSmallest() {
        var smallestToReturn = smallest;
        if (removedMap.isEmpty()) {
            removedMap.put(smallest, smallest + 1);
            smallest++;
            return smallestToReturn;
        } else if (removedMap.containsKey(smallest + 1)) {

            var next = removedMap.get(smallest + 1);
            while (removedMap.containsKey(next)) {
                next = removedMap.get(next);
            }
            removedMap.put(smallest, next);
            smallest = next;
            return smallestToReturn;
        } else {
            removedMap.put(smallest, smallest + 1);
            smallest++;
            return smallestToReturn;
        }
    }

    @Deprecated
    public void addBack(Integer num) {
        if (removedMap.containsKey(num)){
            removedMap.remove(num);
            if (num.compareTo(smallest) < 0){
                smallest = num;
            }
        }
    }
}

/*
  Your SmallestInfiniteSet object will be instantiated and called as such:
  SmallestInfiniteSet obj = new SmallestInfiniteSet();
  int param_1 = obj.popSmallest();
  obj.addBack(num);
 */