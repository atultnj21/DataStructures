package com.javaQueue;

import java.util.Stack;

class StackQueue{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    //o(1)
    public void enqueue(int data){
        stack1.push(data);
    }
    //o(n)
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return stack2.pop();
    }
    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public boolean isEmpty(){
        return (stack1.empty())&&(stack2.empty());
    }

}
public class QueueUsingStack {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        var front= queue.dequeue();
        System.out.println(front);//20
    }
}
