package com.JavaStacks;

public class MainForStackInLL {
    public static void main(String[] args) {
        StackUsingLinkedlist stack = new StackUsingLinkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
      /* 30
         20
         10  */
        System.out.println(stack.pop());//30
        stack.print();
        /* 20
           10 */
        System.out.println(stack.peek());//20
        System.out.println(stack.isEmpty());//false
    }
}
