package com.LinkedList.circularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(1);
        list.show();//1->2->3->4
        list.addAtPos(6,5);//end
        list.show();//1->2->3->4->6
        list.addAtPos(99,1);//beginning
        list.show();//99->1->2->3->4->6
        list.addAtPos(0,2);//middle
        list.show();//99->0->1->2->3->4->6
        list.removeFirst();
        list.removeLast();
        list.show();//0->1->2->3->4
        list.addAtPos(6,4);
        list.show();//0->1->2->6->3->4
        list.deleteAtPos(4);
        list.show();//0->1->2->3->4
        list.addFirst(21);
        list.addLast(32);
        list.show();//21->0->1->2->3->4->32
        list.deleteAtPos(1);
        list.deleteAtPos(6);
        list.show();//0->1->2->3->4
    }
}
