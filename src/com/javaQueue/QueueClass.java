package com.javaQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        /*
        [10, 20, 30]
        F         B
        here is front of the queue and back of the queue
        as we add new items they join the back of the queue
        as we remove it gets remove from the front
         */
        var front=queue.remove();
        System.out.println(front);//10
        System.out.println(queue);//[20, 30]

    }
}
