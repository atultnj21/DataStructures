/*
Calculate Power

Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints :
1 <= x <= 30
0 <= n <= 30
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
*/
package com.Reccursion;

public class PowerOf {
    public static int power(int x ,int n){
        if(x==0 && n==0)
            return 1;
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        int smallAns=power(x,n-1);
        return x * smallAns;
    }
    public static void main(String[] args) {
        int ans = power(3,4);
        System.out.println(ans);//81
    }
}
