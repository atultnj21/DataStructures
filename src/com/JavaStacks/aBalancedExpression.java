package com.JavaStacks;

import java.util.Stack;

class aExpressionChecker{
    public boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();
        for(char ch: expression.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);
            if(isRightBracket(ch)){
                if(stack.empty())
                    return false;
                var top = stack.pop();
                if(bracketsNotMatch(top,ch))
                    return false;
            }
        }
        return stack.empty();
    }
    private boolean isLeftBracket(char ch){
        return (ch == '(' || ch == '{' || ch == '[');
    }
    private boolean isRightBracket(char ch){
        return (ch == ')' || ch == '}' || ch == ']');
    }
    private boolean bracketsNotMatch(char left,char right){
        return (
                (right == ')' && left != '(')||
                (right == '}' && left != '{')||
                (right == ']' && left != '[')
        );
    }
}
public class aBalancedExpression {
    public static void main(String[] args) {
        aExpressionChecker exp = new aExpressionChecker();
        var result=exp.isBalanced("(()))");
        System.out.println(result);//false
    }
}
