package com.Reccursion;

public class SumOfnNuaturalNumbers {
    public static int sum(int n){
        if(n==1)
            return 1;
        int smallAns = sum(n-1);
        return n + smallAns;
    }
    public static void main(String[] args) {
        int ans = sum(4);
        System.out.println(ans);
    }
}
