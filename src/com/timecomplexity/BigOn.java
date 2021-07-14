package com.timecomplexity;

import java.util.ArrayList;

public class BigOn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //O(1+n+n+1)= O(2+2n) = O(n)
        System.out.println("list");//O(1)

        for(int number : list)//O(n)
            System.out.println(number);
        /* cost of this algorithm increases linearly
           and in direct proportion to the size of
           the input if we have 5 items we will have
           5 operations , million items million operations*/

        for(int number : list)//O(n)
            System.out.println(number);

        System.out.println();//O(1)
    }
}
