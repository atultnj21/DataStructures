package com.Heaps;

class Heap{
    private int[] items = new int[10];
    private  int size;
    // Insert
    //here we are starting from index 0
    public void Insert(int value){
        if(size==items.length)
            throw new IllegalStateException();
        items[size]=value;
        size++;
        int index = size-1;
        while(index>0){

            int parentIndex = (index-1)/2;
            if(items[index]>items[parentIndex]){
                swap(index,parentIndex);
                index = parentIndex;
            }
            else{
                return;
            }

        }

    }
    // swap
    private void swap(int first,int second){
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}
public class HeapClient {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.Insert(10);
        heap.Insert(5);
        heap.Insert(17);
        heap.Insert(4);
        heap.Insert(22);
        System.out.printf("done");
    }
}
