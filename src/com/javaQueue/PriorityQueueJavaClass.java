package com.javaQueue;

import java.util.PriorityQueue;

public class PriorityQueueJavaClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        /* these items are not gonna come out in the order
           we added them to the queue */
        while (!queue.isEmpty())
            System.out.println(queue.remove());

        /* output:-
          1
          2
          3
          5*/

        /* if we create a priority queue of integers in java
           by default the smallest number will pop out first

           so everytime we add a number to this queue that number
           is not gonna join the back of the queue its gonna be
           inserted exactly where it should be so all these numbers
           are sorted */
    }
}
