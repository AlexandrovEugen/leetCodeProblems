package com.eval.year2025.medium.puzzle3066;


import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

class Solution {


    @Deprecated
    public int minOperationsFastestFromLeetCode(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            if(num<k) pq.add(num);
        }
        int op = 0;

        while(!pq.isEmpty()){
            int x = pq.poll();
            op++;
            if(pq.isEmpty()) break;
            int y = pq.poll();
            long up = 2L * x + y;
            if(up<k) pq.add((int)up);
        }
        return op;
    }


    public int minOperations(int[] nums, int k) {
        int count = 0;

        PriorityQueue<Long> numbersInOrder = new PriorityQueue<>(nums.length);
        for(int num : nums) {
            numbersInOrder.add((long) num);
        }

        while(numbersInOrder.size() > 1 && numbersInOrder.peek() < k) {
            long x = numbersInOrder.poll();
            long y = Objects.requireNonNull(numbersInOrder.poll(), "It's not possible here to retrieve null");

            long newElem = Math.min(x, y) * 2 + Math.max(x, y);
            numbersInOrder.add(newElem);
            count++;
        }
        return count;
    }




    /*
    We could push the value that is bigger then the next one. And this algo is ignoring the size of the array.
     */
    @Deprecated
    public int minOperationsNotWorking(int[] nums, int k) {

        int count = 0;

        Arrays.sort(nums);
        int index = 0;
        int size = nums.length -1;
        while(index < nums.length && size > 2) {
            if(nums[index] >= k){
                return count;
            }
            if (nums[index + 1] >= k) {
                return count + 1;
            } else {
                int newMin = Math.min(nums[index], nums[index + 1]) * 2 + Math.max(nums[index], nums[index + 1]);
                nums[index + 1] = newMin;
                count++;
                index++;
            }
        }

        return count;
    }
}