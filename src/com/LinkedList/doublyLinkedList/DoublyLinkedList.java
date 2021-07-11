package com.LinkedList.doublyLinkedList;

import com.LinkedList.singlylinkedlist.MyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
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

    //isEmpty()
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
        }
        size++;
    }
    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
        size++;
    }
    //removeFirst
    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(head==tail){
            head=tail=null;
        }
        else {
            Node second = head.next;
            second.previous=null;
            head.next = null;
            head = second;
        }
        size--;
    }
    //removeLast
    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(head==tail){
            head=tail=null;
        }
        else {
            Node lastPrev = tail.previous;
            lastPrev.next=null;
            tail.previous=null;
            tail=lastPrev;
        }
        size--;
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
        while(current.next!=null){
            System.out.print(current.value+ "->");
            current=current.next;
        }
        System.out.println(current.value);
    }
    //reverse
    public void reverse(){
        if (isEmpty()){
            return;
        }
        Node current = tail;
        while(current.previous!=null){
            System.out.print(current.value + "->" );
            current=current.previous;
        }
        System.out.println(current.value);
    }
}
