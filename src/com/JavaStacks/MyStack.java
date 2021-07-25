// stack implemented using Array
package com.JavaStacks;

import java.util.Arrays;

public class MyStack {
    private int[] arr = new int[5];
    private int count =0;

    public void push(int data){
        if(count == arr.length)
            throw new StackOverflowError();

        arr[count]=data;
        count++;
    }

    public int pop(){
        if(count==0)
            throw new IllegalStateException();

        int top=arr[count-1];
        count--;
        return top;
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();

        return arr[count-1];
    }

    @Override
    public String toString(){
        var content=Arrays.copyOfRange(arr,0,count);
        return  Arrays.toString(content);
    }

    public boolean isEmpty(){
        return count==0;
    }

    public int min(){
        if(isEmpty())
            throw new IllegalStateException();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<count;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
