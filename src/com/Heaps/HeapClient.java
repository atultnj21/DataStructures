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
        if(!hasLeftChild(index))
            return index;
        //we fill the complete binary tree from left
        //if node does'nt have right child it will have leftChild
        if(!hasRightChild(index))
            return leftChildIndex(index);
        return (leftChild(index)>rightChild(index)) ?
                leftChildIndex(index) :
                rightChildIndex(index) ;
    }
    // isValidParent
    private boolean isValidParent(int index){
        //if it does'nt have left child it will not have right child
        //it will be a valid parent
        if(!hasLeftChild(index))
            return true;
        //if it does not have right child it will have left child
        //check if leftChild is smaller than its parent .
        if (!hasRightChild(index))
            return items[index]>=leftChild(index);
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
    //hasLeftChild(edge cases)
    //if a node has a left child its index must be less than or equal to size
    private boolean hasLeftChild(int index){
        return leftChildIndex(index)<=size;
    }
    //rightChildIndex
    private int rightChildIndex(int index){
        return (index+1)+2;
    }
    //rightChild
    private int rightChild(int index){
        return items[rightChildIndex(index)];
    }
    //hasRighttChild(edge cases)
    //if a node has a right child its index must be less than or equal to size
    private boolean hasRightChild(int index){
        return rightChildIndex(index)<=size;
    }
    // swap
    private void swap(int first,int second){
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
    //printHeap
    public void printHeap(){
        for(int i=0;i<size;i++)
            System.out.print(items[i]+" ");
        System.out.println();
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
        heap.remove();
        heap.printHeap();
        System.out.printf("done");
    }
}
