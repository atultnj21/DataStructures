package com.JavaStacks;

import java.util.Stack;

class aStringReverser{
    public String reverse(String input){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++)
            stack.push(input.charAt(i));

        char[] reverse = new char[input.length()];
        int i=0;
        while (!stack.empty()){
            reverse[i]=stack.pop();
            i++;
        }
//        return String.valueOf(reverse);
//        return String.copyValueOf(reverse);
        return new String(reverse);
    }
}
public class aReverseStringProblem {
    public static void main(String[] args) {
        aStringReverser rev = new aStringReverser();
        var result=rev.reverse("abcd");
        System.out.println(result);//dcba
    }
}
