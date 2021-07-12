package com.LinkedList.circularLinkedList;

import com.LinkedList.doublyLinkedList.DoublyLinkedList;
import com.LinkedList.singlylinkedlist.MyLinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {

    private class Node{
        private int value;
        private Node next;
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
            tail.next=head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
        size++;
    }
    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            tail.next=head;
        }
        else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
        size++;
    }
    //addAtPos

    public void addAtPos(int data,int position){
        if(position>size+1){
            throw new IllegalStateException("position > size");
        }
        if(position==size+1){
            addLast(data);
            return;
        }
        if(position==1){
            addFirst(data);
        }
        else{
        Node newNode = new Node(data);
        Node current=head;
        for(int i=1;i<position-1;i++){
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;

        size++;
        }
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
            Node current = head.next;
            head.next=null;
            head=current;
            tail.next=head;
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
            tail.next=null;
            Node prev = getPrevious(tail);
            prev.next=null;
            tail=prev;
            tail.next=head;
        }
        size--;
    }
    public void deleteAtPos(int position){
        if(isEmpty()){
            throw new IllegalStateException("list is empty");
        }
        if(position>size){
            throw new IllegalStateException("position > size");
        }
        if(position==size){
            removeLast();
            return;
        }
        if(position==1){
            removeFirst();
        }
        else{
            Node current=head;
            for(int i=1;i<position-1;i++){
                current=current.next;
            }
            Node node=current.next;
            current.next=node.next;
            node.next=null;
            size++;
        }
    }
    //getPrevNode
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
    public int size(){
        return size;
    }
    //show
    public void show(){
        Node node = head;
        while(node.next!=head){
            System.out.print(node.value+ "->");
            node=node.next;
        }
        System.out.println(node.value);
    }
}
