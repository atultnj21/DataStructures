//Doubly circular Linked List
package com.LinkedList.doublyCircularLL;

import com.LinkedList.doublyLinkedList.DoublyLinkedList;

public class doublyCircularLL {
    private class Node{
        private int value;
        private Node next;
        private Node previous;
        public Node(int value){
            this.value=value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    //isEmpty
    public boolean isEmpty(){
        if(head==null)
            return true;
        return false;
    }
    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            tail.next=head;
            head.previous=tail;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=head;
            head.previous=tail;
        }
        size++;
    }
    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            tail.next=head;
            head.previous=tail;
        }
        else {
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
            head.previous=tail;
            tail.next=head;
        }
        size++;
    }
    //size
    public int size(){
        return size;
    }
    //show
    public void show(){
        if(isEmpty()){
            return;
        }
        Node current = head;
        while(current.next!=head){
            System.out.print(current.value+ "->");
            current=current.next;
        }
        System.out.println(current.value);
    }
    // PrintReverse
    public void printReverse(){
        if(isEmpty()){
            return;
        }
        else{
            Node current = tail;
            while(current.previous!=tail){
                System.out.print(current.value + "->");
                current=current.previous;
            }
            System.out.println(current.value);
        }
    }
    // Reverse
    public void reverse(){
        if(isEmpty()){
            return ;
        }
        Node current = tail;
        Node temp=null;
        /* swap next and prev for all nodes of
           doubly linked list */
        while(current.previous!=tail){
            temp=current.previous;
            current.previous=current.next;
            current.next=temp;
            current=current.next;
        }
        temp=current.previous;
        current.previous=current.next;
        current.next=temp;
        head=tail;
        tail=current;
    }
}
