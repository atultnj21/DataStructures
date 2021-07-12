package com.LinkedList.doublyCircularLL;

public class Main {
    public static void main(String[] args) {
        doublyCircularLL list = new doublyCircularLL();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(1);
        list.show();//1->2->3->4
        list.printReverse();//4->3->2->1
        list.reverse();
        list.show();//4->3->2->1
        list.addLast(0);
        list.reverse();
        list.show();//0->1->2->3->4
    }
}
