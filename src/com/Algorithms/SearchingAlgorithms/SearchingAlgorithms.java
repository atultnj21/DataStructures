package com.Algorithms.SearchingAlgorithms;

class Search{
    //linearSearch
    public int linearSearch(int[] Array,int target){
        for(int i=0;i< Array.length;i++)
            if(Array[i]==target)
                return i;

        return -1;
    }

    //Binary Search Recursive
    public int binaryRecursive(int[] Array , int target){
        int left =0;
        int right = Array.length-1;
        return binaryRecursive(Array,target,left,right);
    }
    private int binaryRecursive(int[] Array , int target, int left, int right){
        while (left<=right){
            int middle = (left+right)/2;
            if(target==Array[middle])
                return middle;
            else if(Array[middle]>target)
                return binaryRecursive(Array,target,left,middle-1);
            else if(Array[middle]<target)
                return binaryRecursive(Array,target,middle+1,right);

        }

        return -1;
    }

    // BinarySearch Iterative
    public int binarySearchIterative(int[] Array, int target){
        int left =0;
        int right = Array.length-1;


        while(left<=right){
            int middle = (left+right)/2;

            if(target==Array[middle])
                return middle;

            if(target<Array[middle])
                right=middle-1;
            else
                left=middle+1;


        }
        return -1;
    }

    // TernarySearch Recursive
    public int ternarySearchRecursion(int[] array , int target){
        return ternarySearchRecursion(array,target,0,array.length-1);
    }
    private int ternarySearchRecursion(int[] array , int target ,int left,int right){
        while (left<=right){
            int partitionSize,mid1,mid2;
            partitionSize = (right-left)/3;
            mid1=left+partitionSize;
            mid2=right-partitionSize;
            if(target>array[mid2])
                return ternarySearchRecursion(array,target,mid2+1,right);
            if(target==array[mid2])
                return mid2;
            if(target<array[mid2]&&target>array[mid1])
                return ternarySearchRecursion(array, target,mid1+1,mid2-1);
            if(target<array[mid1])
                return ternarySearchRecursion(array,target,left,mid1-1);
            if(target==array[mid1])
                return mid1;
        }
        return -1;
    }

}

public class SearchingAlgorithms {
    //main
    public static void main(String[] args) {
        int[] arr = {7,1,3,6,5};
        int[] arrSorted ={3,5,6,9,11,18,20,21,24,30};
        Search search = new Search();

        System.out.println("Linear Search");
        var index=search.linearSearch(arr,6);
        System.out.println(index);

        System.out.println("Binary Search Recursive");
        var ind = search.binaryRecursive(arrSorted,20);
        System.out.println(ind);

        System.out.println("Binary Search Iterative");
        var indx = search.binarySearchIterative(arrSorted,5);
        System.out.println(indx);

        System.out.println("Ternary Search Recursive");
        var i = search.ternarySearchRecursion(arrSorted,30);
        System.out.println(i);
    }

}
