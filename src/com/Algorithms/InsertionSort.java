package com.Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void sorter(int[] array){
        // start loop from the first element
        for(int i = 1 ; i< array.length;i++){
            int temp = array[i];
            //check for the elements on the left side
            int j = i-1;
            while (j>=0 && array[j]>temp) {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {8,4,1,5,9,2};
        sorter(array);
        System.out.println(Arrays.toString(array));
        //[1, 2, 4, 5, 8, 9]
    }
}
