package com.JavaStacks;

import java.util.Arrays;
import java.util.Stack;

class StringReverser{
    public String reverse(String input){

        if(input==null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for(char ch: input.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
public class ReverseStringProblem {
    public static void main(String[] args) {
        StringReverser rev = new StringReverser();
        var result=rev.reverse("abcd");
        System.out.println(result);//dcba
    }
}

/*Java StringBuffer class is used to create mutable
(modifiable) String objects. The StringBuffer class
in Java is the same as String class except it is mutable
i.e. it can be changed.*/