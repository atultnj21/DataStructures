package com.javaQueue;
class CircularListQueue{
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }
    private Node front;
    private Node rear;
    private int count;

    public boolean isEmpty(){
        return count==0;
    }
    public void enqueue(int item){
        Node newNode = new Node(item);
        if(isEmpty()){
            front=rear=newNode;
            rear.next=front;
        }
        else {
            rear.next=newNode;
            rear=rear.next;
            rear.next=front;
        }
        count++;
    }
    public int dequeue(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        else if(front==rear){
            front=rear=null;
            count--;
        }
        else{
            Node temp = front;
            front=front.next;
            temp.next=null;
            count--;
            rear.next=front;
            return temp.data;
        }
        return -1;
    }

    public void print(){
        if (isEmpty()){
            return;
        }
        Node temp = front;
        while(temp.next!=front){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
public class circularQueueUsingLL {
    public static void main(String[] args) {
        CircularListQueue list = new CircularListQueue();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.enqueue(50);
        list.print();//10->20->30->40->50
        list.dequeue();
        var front=list.dequeue();
        System.out.println(front);//20
        list.print();//30->40->50
    }
}
