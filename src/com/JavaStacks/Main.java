package com.JavaStacks;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);//[10, 20, 30]
        System.out.println(stack.pop());//30
        System.out.println(stack);//[10, 20]
        System.out.println(stack.peek());//20
        System.out.println(stack.isEmpty());//false
        System.out.println(stack.min());//10
        stack.push(4);
        System.out.println(stack.min());//4
    }
}
