package com.Algorithms;

import com.JavaArrays.Array;

import java.util.Arrays;

public class QuickSort {

    // quickSort()
    public static void quickSort(int[] Array){
        int low = 0;
        int high = Array.length -1;
        quickSort(Array,low,high);
    }
    private static void quickSort(int[] Array,int low,int high){
        //At-least two element is present
        if(low<high){
            int pivot = partition(Array,low,high);
            quickSort(Array,low,pivot-1);
            quickSort(Array,pivot+1,high);
        }
    }

    // partition()
    public static int partition(int[] Array,int low , int high){
        int i,j,pivot;
        pivot=Array[low];
        i=low;
        j=high;
        while(i<j) {
            while (Array[i] <= pivot) i++;
            while (Array[j] > pivot) j--;
            if(i<j)
                swap(Array,i,j);
        }
        swap(Array,j,low);

        return j;
    }

    //swap
    private static void swap(int[] Array,int index1,int index2){
        int temp=0;
        temp=Array[index1];
        Array[index1]=Array[index2];
        Array[index2]=temp;
    }

    public static void main(String[] args) {
        int[] Array={4,6,2,5,7,9,1,3};
        quickSort(Array);
        System.out.println(Arrays.toString(Array));
    }
}
