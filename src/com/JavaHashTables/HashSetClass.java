package com.JavaHashTables;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        int[] numbers={1,2,3,3,2,1,4};
        for (var number: numbers)
            set.add(number);
        System.out.println(set);
        //[1, 2, 3, 4]
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c","d"));
        Set<String> set2 = new HashSet<>(Arrays.asList("d","e","f","g"));

        // Intersection
        set1.retainAll(set2);
        System.out.println(set1);//[d]

        // Union
        set1.addAll(set2);
        System.out.println(set1);//[d, e, f, g]

        //difference
        set1.removeAll(set2);
        System.out.println(set1);//[]
    }
}