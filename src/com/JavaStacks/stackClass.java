package com.JavaStacks;

import java.util.Stack;

public class stackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);//[10, 20, 30]
        int top = stack.pop();//removes and returns the top element
        System.out.println(top);//30
        System.out.println(stack);//[10, 20]
        top=stack.peek();//returns the top element without removing
        System.out.println(top);//20
    }
}
