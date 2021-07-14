package com.timecomplexity;

import java.util.Scanner;

public class BigOnlogn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //log n
        for (int i =1;i<=n; i=i*2){//log n
            System.out.println(i);
        }

        System.out.println("nlogn");//O(1)
        //nlogn
        for (int a=1;a<=n;a++){//n
            for(int b=1;b<=n;b=b*2){//logn
                System.out.println(a+" " + b);
            }
        }

    }
}
