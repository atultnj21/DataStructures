/*
 ArrayQueue (ArrayDeque)
 enqueue
 dequeue
 peek
 isEmpty
 isFull
  [10 , 20 , 30 , 40]
   F              R
 F=0
 R=3
*/

package com.javaQueue;

import java.util.Arrays;

class ArrayQueue{
    private int[] arr;
    private int rear;
    private int count;
    private int front;

    public ArrayQueue(int capacity){
        arr = new int[capacity];
    }

    public void enqueue(int item){
        if(count==arr.length)
            throw new IllegalStateException();
        arr[rear] = item;
        rear++;
        count++;
    }

    public int dequeue(){
        var item= arr[front];
        arr[front]=0;
        front++;
        count--;
        return item;
    }

    @Override
    public String toString(){
        //var content = Arrays.copyOfRange(arr,front,rear);
        //return Arrays.toString(content);
        return Arrays.toString(arr);
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);//[10, 20, 30, 0, 0]
        queue.dequeue();
        var front=queue.dequeue();
        System.out.println(front);//20
        System.out.println(queue);//[0, 0, 30, 0, 0]
        /*
        Now this implementation has a problem we have
        added 3 items and removed 2 of them currently
        we have one item in our queue and given that
        out queue have a capacity for 5 items we should
        be able to add 4 extra items in this queue but
        that is not going to work
         */
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);//[0, 0, 30, 40, 50]
        //queue.enqueue(60);
        // throws ArrayIndexOutOfBoundsException
        // but we were supposed to throw an illegal state exception
        //count =1   arr.length = 5
        // rear pointer is pointing out of the array so the exception occurred
        //we can solve this problem using circular arrays.
    }
}
