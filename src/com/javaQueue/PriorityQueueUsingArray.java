package com.javaQueue;

import java.util.Arrays;

class PriorityQueue{
    private int[] arr ;
    private int count=0;
    public PriorityQueue(int capacity){
        arr =new int[capacity];
    }

    //add
    public void add(int data){
        if(isFull()){
            int[] newArr = new int[count*2];
            //copy all the existing items
            for(int i=0;i < count;i++){
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        var i = shiftItemsToInsert(data);
        arr[i]=data;
        count++;
    }

    //remove
    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return arr[--count];
    }

    //isEmpty
    public boolean isEmpty(){
        return count==0;
    }

    //isFull
    public boolean isFull(){
        return count == arr.length;
    }


    @Override
    public String toString(){
        //var content=Arrays.copyOfRange(arr,0,count);
        //return Arrays.toString(content);
        return Arrays.toString(arr);
    }

    //shiftItemsToInsert
    public int shiftItemsToInsert(int data){
        //for shifting items
        int i;
        for(i=count-1;i>=0;i--){
            if(arr[i]> data)
                arr[i+1]=arr[i];
            else
                break;
        }
        return i+1;
    }


}

public class PriorityQueueUsingArray {
    public static void main(String[] args) {
        //PriorityQueue
        //insert(2)
        // [1,3,5,7]
        // [1,3,3,5,7]          count=4
        //  0 1 2 3 4
        PriorityQueue queue = new PriorityQueue(5);
        queue.add(5);
        System.out.println(queue);//[5, 0, 0, 0, 0]
        queue.add(3);
        queue.add(4);
        queue.add(1);
        queue.add(2);
        System.out.println(queue);//[1, 2, 3, 4, 5]
        queue.add(6);
        System.out.println(queue);//[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        /*
        6
        5
        4
        3
        2
        1
        */
    }
}
