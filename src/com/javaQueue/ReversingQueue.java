//Q) Reversing a Queue Using Stack
package com.javaQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        //[10, 20, 30]
        // F        B
        ReversingQueue.reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            var front = queue.remove();
            stack.push(front);
        }
        /*
        System.out.println(stack);
        [10, 20, 30]
                 Top
         */

        while(!stack.empty()){
            var top = stack.pop();
            queue.add(top);
        }
        /*
        System.out.println(queue);
        [30, 20, 10]
        F        B
        */
    }
}
