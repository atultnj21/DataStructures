package com.JavaHashTables;

import java.util.HashMap;
import java.util.Map;

public class HashFunction {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1929264,"Atul");
        /* let's say our array has a capacity of 100
          items,so we should map this employee number
          to a number between 0-99 */
        System.out.println(hash(1929264));//64
    }
    // Simplest implementation of a hashFunction
    public static int hash(int number){
        return number%100;
    }
}
// what if our keys are strings ?
// check aHashFunction.java.