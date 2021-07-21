package com.JavaArrays;

public class Array {

    private int[] items;
    private int size;

    public Array(int length){
        //storing items into a regular java array
        items=new int[length];
    }

    public void print(){
        for(int i=0;i < size;i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int data){
        // If the array is full,resize it
        if(items.length==size){
            //create new array(twice the size)
            int[] newItems = new int[size*2];
            //copy all the existing items
            for(int i=0;i < size;i++){
                newItems[i]=items[i];
            }
            //set "items" to this new array
            items=newItems;
        }
        // Add the new item at the end
        items[size]=data;
        size++;
    }

    public void removeAt(int index){
        //validation
        if(index<0 || index>=size)
            throw new IllegalArgumentException();
        //shift items  to the left to fill the hole
        for(int i=index ; i<size ; i++){
            items[i]=items[i+1];
        }
        size--;
    }

    public int indexOf(int item){
        for (int i = 0;i<size;i++){
            if(items[i]==item){
                return i;
            }
        }
        return -1;
    }
}
