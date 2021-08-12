///* for a given string write code to examine
//   weather pairs and orders of brackets are
//   correct
//
//   eg:
//   "( 1 + 2 )" -> balanced
//   "( 1 + 2 " -> not balanced
//   ") 1 + 2 (" -> not balanced
//   "( 1 + 2 >" -> not balanced
//   "(( a+b ))" -> balanced
//   "(([1] + <2>)) [a]" -> balanced */
//
//package com.JavaStacks;
//
//import java.util.Stack;
//
//class expressionChecker{
//    Stack<Character> stack= new Stack<>();
//    public boolean isBalanced(String input){
//        for(int i=0 ; i<input.length();i++){
//            if(input.charAt(i)=='(' ||
//                    input.charAt(i)=='<'||
//                    input.charAt(i)=='[' ||
//                    input.charAt(i)=='{')
//            {
//                stack.push(input.charAt(i));
//            }
//            else if(
//                    (input.charAt(i)==']' && stack.peek()=='[') ||
//                    (input.charAt(i)=='>' && stack.peek()=='<') ||
//                    (input.charAt(i)==')' && stack.peek()=='(') || -> stack.peek() throws empty stack exception
//                    (input.charAt(i)=='}' && stack.peek()=='{')
//            )
//            {
//                stack.pop();
//            }
//        }
//       return stack.empty();
//    }
//}
//public class BalancedExpression {
//    public static void main(String[] args) {
//        expressionChecker expression = new expressionChecker();
//        var result = expression.isBalanced("(()))");  -> this code breaks here check aBalancedExpression.java for working code
//        System.out.println(result);//false
//    }
//}