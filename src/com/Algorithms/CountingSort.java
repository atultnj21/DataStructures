package com.Algorithms;
import java.util.Arrays;

class CS{

    public void countingSort(int[] Array , int max){
        int[] counts = new int[max+1];

        //populating counts
        for(int item : Array){
            counts[item]++;
        }

        //Repopulating Array using counts
        int k=0;
        for(var i=0;i<counts.length;i++){
            for(var j=0;j<counts[i];j++){
                Array[k++]=i;
            }
        }
    }

}
public class CountingSort {


    //Main Method
    public static void main(String[] args) {
        int[] numbers = {5,1,7,2,6,4};
        CS sorter = new CS();
        sorter.countingSort(numbers,7);
        System.out.println(Arrays.toString(numbers));
    }
}
