package com.Reccursion;
// 0 ,1 , 1, 2, 3, 5, 8, 13
public class FiboRec {
    public static int fibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
}
