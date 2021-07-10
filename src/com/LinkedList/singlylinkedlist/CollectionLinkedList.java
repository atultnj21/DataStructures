package com.LinkedList.singlylinkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);

        //similarly we have removeFirst and we can pass an index too
        list .removeLast();
        System.out.println(list.contains(20));//true
        System.out.println(list.indexOf(20));//2
        System.out.println(list.size());//3
        var array =list.toArray();
        System.out.println(Arrays.toString(array));//[5, 10, 20]
    }
}
