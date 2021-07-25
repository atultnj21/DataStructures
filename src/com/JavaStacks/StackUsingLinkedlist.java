package com.JavaStacks;

public class StackUsingLinkedlist {

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
    }
    private Node top;

    //isEmpty()
    public boolean isEmpty(){
        return top == null;
    }
    //push
    public void push(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }

    //pop
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        Node current = top;
        top=top.next;
        current.next=null;
        return current.data;
    }

    //print
    public void print(){
        if(isEmpty()){
            return;
        }
        Node current = top;
        while(current.next!=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);
    }

    //peek
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return top.data;
    }

}
