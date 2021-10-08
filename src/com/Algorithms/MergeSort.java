package com.Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] Array){
        int lb = 0;
        int ub = Array.length-1;
        mergeSort(Array, lb ,  ub);
    }
    private static void mergeSort(int[] Array,int lb , int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(Array,lb,mid);
            mergeSort(Array,mid+1,ub);
            merge(Array,lb,ub,mid);
        }
    }
    private static void merge(int[] Array,int lb , int ub, int mid){
        int [] tempArray = new int[Array.length];
        int i , j , k;
        k=lb;
        i = lb;
        j = mid+1;
        while(i<=mid && j<=ub){
            if(Array[i]<=Array[j]){
                tempArray[k]=Array[i];
                i++;
            }
            else{
                tempArray[k]=Array[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=ub){
                tempArray[k]=Array[j];
                j++;
                k++;
            }
        }
        else {
            while (i <= mid) {
                tempArray[k] = Array[i];
                i++;
                k++;
            }
        }

        for(k=lb;k<=ub;k++){
            Array[k]=tempArray[k];
        }
    }

    public static void main(String[] args) {
        int [] Array ={15,5,24,8,1,3,16,10,20};
        mergeSort(Array);
        System.out.println(Arrays.toString(Array));
        //[1, 3, 5, 8, 10, 15, 16, 20, 24]
    }
}
