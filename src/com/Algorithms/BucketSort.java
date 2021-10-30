package com.Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BucketSort {
    //sorter
    public static void sorter(int[] Array,int numberOfBuckets){

        // Create n empty buckets

        LinkedList<Integer>[] Buckets = new LinkedList[numberOfBuckets];
        for(int j=0;j<numberOfBuckets;j++){
            Buckets[j] = new LinkedList<Integer>();
        }

        // Put array elements in different buckets
        for(int i =0 ;i< Array.length;i++){
            var index = Array[i]/ numberOfBuckets;
            Buckets[index].add(Array[i]);
        }
        // Printing buckets
        System.out.println(Arrays.toString(Buckets));

        //sort individual buckets
        int count = 0;
        for(int k =0 ; k<Buckets.length;k++){
            Collections.sort(Buckets[k]);
            //  put the items back into input array
            for(int i=0 ; i<Buckets[k].size();i++) {
                int item = Buckets[k].get(i);
                Array[count]=item;
                count++;
            }
        }

        System.out.println("Sorted");
        System.out.println(Arrays.toString(Array));
    }

    //main
    public static void main(String[] args) {
        int[] Array ={7,1,3,5,3};
        sorter(Array,3);
    }
}
