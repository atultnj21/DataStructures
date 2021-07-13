package com.LinkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(1);
        list.show();//1->2->3->4
        list.printReverse();//4->3->2->1
        list.removeFirst();
        list.show();//2->3->4
        list.removeLast();
        list.show();//2->3
        System.out.println(list.size());//2
        list.show();//2->3
        list.reverse();
        list.show();//3->2
        list.printReverse();//2->3
    }
}
