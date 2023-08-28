package com.eval.easy.implementStackUsingQueues;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class MyStack {

    Queue<Integer> queue1 = new LinkedList<>();
     Queue<Integer> queue2 = new LinkedList<>();


    public void push(Integer x) {
        queue2.add(x);

        while (!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        Queue<Integer> tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;

    }

    public Integer pop() {
        return queue1.poll();
    }

    public Integer top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.size() == 0;
    }
}




