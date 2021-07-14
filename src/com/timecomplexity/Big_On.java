package com.timecomplexity;

import java.util.ArrayList;

public class Big_On {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<String> stringList= new ArrayList<>();
        stringList.add("A");
        stringList.add("T");
        stringList.add("U");
        stringList.add("L");

        //O(n+m) = O(n)
        for(int number : list)//O(n)
            System.out.println(number);

        for(String element : stringList)//O(m)
            System.out.println(element);

    }
}
