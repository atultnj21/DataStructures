package com.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BigOn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //O(n^2)
        for (int i=1 ; i<=n;i++){//o(n)
            for(int j=1;j<=n;j++){//o(n)
                System.out.print(i+" "+j);
            }
        }
    }
}
