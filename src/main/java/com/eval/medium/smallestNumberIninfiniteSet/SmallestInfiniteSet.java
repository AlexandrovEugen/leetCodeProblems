package com.eval.medium.smallestNumberIninfiniteSet;



import java.util.HashSet;
import java.util.Set;


public class SmallestInfiniteSet {

    private int curr = 1;
    private final Set<Integer> setOfRemoved = new HashSet<>();

    public int popSmallest() {
        int ans = curr;

        setOfRemoved.add(curr);

        curr++;
        while (setOfRemoved.contains(curr)){
            curr++;
        }
        return ans;
    }

    public void addBack(int num) {
        if (setOfRemoved.contains(num)){
            setOfRemoved.remove(num);
            if (num < curr){
                curr = num;
            }
        }
    }

}
