package com.LinkedList.singlylinkedlist;

import java.util.NoSuchElementException;

public class MyLinkedList {

    //Node class
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
//            tail = head;
//            while(tail.next!=null){
//                tail=tail.next;
//            }
//            tail.next=newNode;
        }
        size++;
    }

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty())
            head=tail=newNode;
        else{
        newNode.next=head;
        head=newNode;
        }
        size++;
    }

    //indexOf
    public int indexOf(int data){
        int index=0;
        Node current = head;
        while(current!=null){
            if(current.value==data)
                return index;
            current=current.next;
            index++;
        }
        return -1;
    }
    //Contains
    public boolean contains(int data){
//        Node current = head;
//        while(current!=null){
//            if(current.value==data){
//                return true;
//            }
//            current=current.next;
//        }
//        return false;
        return indexOf(data)!=-1;
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
//            return;
        }
        else {
            Node prev = getPrevious(tail);
            prev.next=null;
            tail=prev;
        }
//            Node current=head;
//            while(current.next!=tail){
//                current=current.next;
//            }
//            current.next=null;
//            tail=current;

            size--;
    }
    //getPrevious
    public Node getPrevious(Node node){
        Node current = head;
        while (current.next!=null) {
            if (current.next == node)
                return current;
            current=current.next;
        }
        return null;
    }

    //size

    /* //O(n)
       One approach is to traverse the list,so we
       start from the beginning go all the way to
       the end ,everytime we get a node we incremenmt
       a counter variable
       problem with this method is everytime we
       call this method we have to recalculate the size
       and this is not efficient

       O(1)
       we can declare a private field in this class
       call it size everytime we add or remove an item
       we will update that field size method will simply
       return the value of that feild*/
    public int size(){
        return size;
    }
    //toArray
    public int[] toArray(){
        int array[]=new int[size];
        int index=0;
        Node current = head;
        while(current!=null){
            array[index]=current.value;
            index++;
            current=current.next;
        }
        return array;
    }
    //show
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.print(node.value+ "->");
            node=node.next;
        }
        System.out.println(node.value);
    }

}