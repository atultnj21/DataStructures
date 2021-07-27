package com.javaQueue;
import java.util.Arrays;

class aArrayQueue{
    private int[] arr;
    private int rear;
    private int count;
    private int front;

    public aArrayQueue(int capacity){
        arr = new int[capacity];
    }

    public boolean isFull(){
        return count== arr.length;
    }

    public boolean isEmpty(){
        return front==0;
    }

    public void enqueue(int item){
        if(count==arr.length)
            throw new IllegalStateException();
        arr[rear] = item;
        rear=(rear+1)%arr.length;
        count++;
    }

    public int dequeue(){
        var item= arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        count--;
        return item;
    }

    public int peek(){
        return arr[front];
    }
    @Override
    public String toString(){
//        var content = Arrays.copyOfRange(arr,front,rear);
//        return Arrays.toString(content);
        return Arrays.toString(arr);
    }
}
public class circularArrays {
    public static void main(String[] args) {
        aArrayQueue queue = new aArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);//[10, 20, 30, 0, 0]
        queue.dequeue();
        var front=queue.dequeue();
        System.out.println(front);//20
        System.out.println(queue);//[0, 0, 30, 0, 0]
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);//[0, 0, 30, 40, 50]
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println(queue);//[60, 70, 30, 40, 50]
        queue.dequeue();
        System.out.println(queue);//[60, 70, 0, 40, 50]
        queue.enqueue(80);
        System.out.println(queue);//[60, 70, 80, 40, 50]
        var result=queue.peek();
        System.out.println(result);//40
        System.out.println(queue.isFull());//true
        queue.dequeue();
        System.out.println(queue.isFull());//false
        System.out.println(queue.isEmpty());//false
        System.out.println(queue);//[60, 70, 80, 0, 50]
        System.out.println(queue.peek());//50
    }
}
