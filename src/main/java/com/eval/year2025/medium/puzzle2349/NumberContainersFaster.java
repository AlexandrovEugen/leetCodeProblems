package com.eval.year2025.medium.puzzle2349;

import java.util.HashMap;
import java.util.PriorityQueue;

@Deprecated
class NumberContainersFaster {

    HashMap<Integer, PriorityQueue<Integer>> res;
    HashMap<Integer,Integer> index_val;

    public NumberContainersFaster() {
        res = new HashMap<>();
        index_val = new HashMap<>();
    }

    @Deprecated
    public void change(int index, int number) {

        if(index_val.containsKey(index)){
            int num = index_val.get(index);
            if(num == number){
                return;
            }

            res.get(num).remove(index);
        }

        res.computeIfAbsent(number, _ -> new PriorityQueue<>()).offer(index);
        index_val.put(index, number);
    }

    @Deprecated
    public int find(int number)
    {
        PriorityQueue<Integer> pq = res.getOrDefault(number, new PriorityQueue<>());
        if(pq.isEmpty())
        {
            return -1;
        }
        return pq.peek();
    }
}

