package com.JavaHashTables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortingHashmap {
    static HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        map.put("Tony Stark",99);
        map.put("Steve Rogers",94);
        map.put("Thor",93);
        map.put("Black Panther",94);
        map.put("Peter Parker",95);
        map.put("Stephen Strange",95);
        map.put("Winter soldier",90);
        sortByKey();
    }

    public static void sortByKey(){
        ArrayList<String> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        for(String key:sortedKeys){
            System.out.println(key+" "+map.get(key));
        }
    }
}

/*
Black Panther 94
Peter Parker 95
Stephen Strange 95
Steve Rogers 94
Thor 93
Tony Stark 99
Winter soldier 90
*/