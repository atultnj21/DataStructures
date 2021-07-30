//Insertion and deletion are allowed from both the ends
package com.javaQueue;

import java.util.Arrays;

class DequeArray{
    int[] arr;
    public DequeArray(int capacity){
        arr=new int[capacity];
    }
    private int count;
    private int front;
    private int rear;

    //enqueue front
    public void enqueueFront(int item){
        //if queue is full
        //[1,2,3,4,5]
        if(isFull())
            throw new IllegalStateException();
        //else if queue is empty
        //[]
        else if(isEmpty())
            arr[front]=item;
        //[2 0 0 0 0 ]
        // F
        else if(front==0){
            front=arr.length-1;
            arr[front]=item;
        }
        //[2 0 0 0 0 3]
        //           F
        else{
            front--;
            arr[front]=item;
        }
        count++;
    }

    //enqueue rear
    public void enqueueRear(int item){
        //if queue is full
        //[1,2,3,4,5]
        if(isFull())
            throw new IllegalStateException();
        //else if queue is empty
        // []
        else if(isEmpty())
            arr[rear]=item;
        //[ 0 3 0 0 4 ]
        //    F     R
        else if(rear==arr.length-1){
            rear=0;
            arr[rear]=item;
        }
        //[2 0 3 4 5]
        // R  F
        else{
            rear++;
            arr[rear]=item;
        }
        count++;
    }

    //dequeueFront
    public int dequeueFront(){
        if(isEmpty())
            throw new IllegalStateException();
        else if(front==rear){
            var item= arr[front];
            front=rear=-1;
            count--;
            return item;
        }
        else{
            var item= arr[front];
            arr[front]=0;
            front=(front+1)% arr.length;
            count--;
            return item;
        }
    }
    public int dequeueRear(){
        if(isEmpty())
            throw new IllegalStateException();
        else if(front==rear){
            var item= arr[rear];
            front=rear=-1;
            count--;
            return item;
        }
        else if(rear==0){
            var item= arr[rear];
            arr[rear]=0;
            rear=arr.length-1;
            count--;
            return item;
        }
        else{
            var item= arr[rear];
            arr[rear]=0;
            rear--;
            count--;
            return item;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return count==0;
    }

    //isFull
    public boolean isFull(){
        return count==arr.length;
    }

    //print
    //to print the actual queue
    //from front to rear
    public void print(){
        if(isEmpty())
            throw new IllegalStateException();
        int i= front;
        while (i!=rear){
            System.out.print(arr[i]+" ");
            i=(i+1)%arr.length;
        }
        System.out.println(arr[i]);
    }

    //getFront
    public int getFront(){
        if(isEmpty())
            throw new IllegalStateException();
        return arr[front];
    }

    //getRear
    public int getRear(){
        if(isEmpty())
            throw new IllegalStateException();
        return arr[rear];
    }

    //to se the implementation
    @Override
    public String toString(){
        return Arrays.toString(arr);
    }
}
public class DequeUsingCircularArray {
    public static void main(String[] args) {
        DequeArray queue = new DequeArray(5);
        queue.enqueueFront(2);
        queue.enqueueFront(5);
        queue.enqueueRear(-1);
        queue.enqueueRear(9);
        queue.enqueueFront(7);
        queue.print();//7 5 2 -1 9
        System.out.println(queue);//[2, -1, 9, 7, 5]
        System.out.println(queue.getFront());//7
        System.out.println(queue.getRear());//9
        queue.dequeueFront();
        queue.dequeueFront();
        System.out.println(queue.getFront());//2
        System.out.println(queue);//[2, -1, 9, 0, 0]
        queue.print();//2 -1 9
        queue.dequeueRear();
        queue.print();//2 -1

    }
}
