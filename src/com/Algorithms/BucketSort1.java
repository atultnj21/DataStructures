package com.Algorithms;

import com.JavaArrays.Array;

import java.util.*;

public class BucketSort1 {
    public static void sort(int[] Array , int noOfBuckets){
        var buckets = createBuckets(Array , noOfBuckets);
        int i =0;
        for(var bucket : buckets) {
            Collections.sort(bucket);
            for(var item : bucket)
                Array[i++]= item;
        }
    }
    private static List<List<Integer>> createBuckets(int[] Array , int noOfBuckets){
        List<List<Integer>> buckets= new ArrayList<>() ;

        //initialise list with empty buckets
        for(int i =0 ; i< noOfBuckets ; i++){
            buckets.add(new ArrayList<>());
        }
        for(var item : Array)
            buckets.get(item/noOfBuckets).add(item);
        return buckets;
    }

    //main
    public static void main(String[] args) {
        int[] numbers = {7,1,3,5,3};
        sort(numbers,3);
        System.out.println(Arrays.toString(numbers));
        //[1, 3, 3, 5, 7]
        //here largest no = 7 so, noOfBuckets>= 7/2 = 3
    }
}
