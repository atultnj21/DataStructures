/*
1- Find the middle of a linked list in one pass. If the list has an even
number of nodes, there would be two middle nodes. (Note: Assume that
you don’t know the size of the list ahead of time.)
*/
package com.LinkedList.singlylinkedlist;

class testLinkedList{
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    //isEmpty
    private boolean isEmpty(){
        return head==null;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    //size
    public int size(){
        return size;
    }

    //printMiddle
    public void printMiddle(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        Node fast = head;
        Node slow = head;
        while(fast!=tail && fast.next!=tail){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==tail){
            System.out.println(slow.value);
        }else{
            System.out.println(slow.value+" "+ slow.next.value);
        }
    }
}
public class QuestionOne {
    public static void main(String[] args) {
        testLinkedList list = new testLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.printMiddle();//3 4
    }
}
