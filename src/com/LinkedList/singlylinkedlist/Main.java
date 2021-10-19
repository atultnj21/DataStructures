package com.LinkedList.singlylinkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list= new MyLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addLast(4);
        list.addLast(5);
        list.addFirst(1);
        list.show();
        System.out.println(list.indexOf(4));
        System.out.println(list.indexOf(6));
        System.out.println(list.contains(2));
        System.out.println(list.contains(39));
        list.removeFirst();
        list.show();//2->3->4->5
        list.removeLast();
        list.show();//2->3->4
        System.out.println(list.size());//3
        list.addFirst(1);
        list.show();//1->2->3->4
        System.out.println(list.size());//4
        int[] array=list.toArray();
        System.out.println(Arrays.toString(array));//[1, 2, 3, 4]
        System.out.println(array[2]);//3
        list.show();//1->2->3->4
        list.reverse();
        list.show();//4->3->2->1

        //Find the Kth node from the end
        //of a linked list in one pass.
        // [10 -> 20 -> 30 -> 40 -> 50]
        //              *           *

        //K = 1 (50) (distance = 0)
        //K = 2 (40) (distance = 1)
        //K = 3 (30) (distance = 2)

        //4->3->2->1
        System.out.println(list.kthNodeFromTheEnd(1));//1
        System.out.println(list.kthNodeFromTheEnd(2));//2
        System.out.println(list.kthNodeFromTheEnd(10));
        /* Exception in thread "Main" java.lang.IllegalArgumentException:
        list is not that long: k>size */
    }
}
