package com.Algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void sorter(int[] array){
        //Outer Loop for Passes
        for(int i = 0 ; i< array.length-1;i++){
            Boolean isSorted =true;
            //inner loop for iterations / comparisons
            for(int j = 0 ; j< array.length - i -1 ; j++){
                if(array[j]>array[j+1]) {
                    swap(array, j, j + 1);
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
        }
    }

    //swap
    private static void swap(int[] array,int index1,int index2){
        int temp=0;
        temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static void main(String[] args) {
        int[] array = {15,16,6,8,5};
        sorter(array);
        System.out.println(Arrays.toString(array));
        //[5, 6, 8, 15, 16]
    }
}
