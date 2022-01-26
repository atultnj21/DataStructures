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
    //remove()
    public void remove(){
        if(size==0)
            throw new IllegalStateException();
        // put the last element into the root
        items[0]=items[size-1];
        // decrement the size (deleting the last element)
        size--;

        int index = 0 ;
        while(index<=size && !isValidParent(index)){
            int largerChildIndex = largerChildIndex(index);
            swap(index,largerChildIndex);
            index=largerChildIndex;

        }
    }

    // HELPER METHODS
    //largerChildIndex
    private int largerChildIndex(int index){
        return (leftChild(index)>rightChild(index)) ?
                leftChildIndex(index) :
                rightChildIndex(index) ;
    }
    // isValidParent
    private boolean isValidParent(int index){
        return items[index]>=leftChild(index) &&
                items[index]>=rightChild(index);
    }
    //leftChildIndex
    private int leftChildIndex(int index){
        return (index*2)+1;
    }
    //leftChild
    private int leftChild(int index){
        return items[leftChildIndex(index)];
    }

    //rightChildIndex
    private int rightChildIndex(int index){
        return (index+1)+2;
    }
    //rightChild
    private int rightChild(int index){
        return items[rightChildIndex(index)];
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
