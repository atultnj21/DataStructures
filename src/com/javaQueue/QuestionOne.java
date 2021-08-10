/*
1- Given an integer K and a queue of integers, write code to
reverse the order of the first K elements of the queue.
Input: Q = [10, 20, 30, 40, 50], K = 3
Output: Q = [30, 20, 10, 40, 50]

Solution Steps

1.Create an empty stack.
2.Dequeue K items from the queue and push them into the stack, one by one.
3.Enqueue the contents of the stack at the back of the queue
4.Dequeue (size-k) elements from the front and enqueue them one by one in the same queue.

*/
package com.javaQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QuestionOne {
    static Queue<Integer> queue;
    public static void main(String[] args) {
        queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        reverseFirstKElements(3);
        System.out.println(queue);//[30, 20, 10, 40, 50]

    }
    //reverse
    public static void reverseFirstKElements(int k){

        if(queue.isEmpty() || k>queue.size()){
            return;
        }
        if (k<=0){
            return;
        }
        Stack<Integer> stack = new Stack<>();

        // push first K elements into stack
        for(int i=0;i<k;i++){
            stack.push(queue.remove());
        }
        // pop the elements from and add at the end of the queue
        while (!stack.empty()){
            queue.add(stack.pop());
        }
        // remove the remaining elements from the queue and add at the end
        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.remove());
        }
    }
}
