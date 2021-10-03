package com.Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void sorter(int[] array){
        for(int i = 0 ; i < array.length-1 ; i++){
            int min_index=i;
            for( int j = i+1 ; j < array.length ; j++){
                if(array[j]<array[min_index])
                    min_index = j;
            }
            if(min_index!=i)
                swap(array,i,min_index);
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
        int [] array = {7,4,10,8,3,1};
        sorter(array);
        System.out.println(Arrays.toString(array));
        //[1, 3, 4, 7, 8, 10]
    }
}
