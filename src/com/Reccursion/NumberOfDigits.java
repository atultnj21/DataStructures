/*Number of Digits

Given the code to find out and return the number of
digits present in a number recursively.
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
156
Sample Output 1 :
3
Sample Input 2 :
7
Sample Output 2 :
1*/
package com.Reccursion;

public class NumberOfDigits {
    public static int noOfDigit(int n){
        if (n==0)
            return 0;
        int smallAns=noOfDigit(n/10);
        int ans=smallAns+1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(noOfDigit(12343));
    }
}
