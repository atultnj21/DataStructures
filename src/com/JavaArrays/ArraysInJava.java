package com.JavaArrays;

import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] numbers ={10,20,30};
        System.out.println(numbers);//[I@4dd8dc3
        System.out.println(numbers.length);//3
        System.out.println(Arrays.toString(numbers));//[10, 20, 30]
    }
}
