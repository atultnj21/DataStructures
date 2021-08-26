/*
Print Numbers

Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
*/
package com.Reccursion;

public class PrintNumbers {
    public static void printNum(int n){
        if(n==0)
            return ;
        printNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printNum(8);
    }
}
