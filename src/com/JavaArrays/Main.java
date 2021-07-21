package com.JavaArrays;

public class Main {
    public static void main(String[] args) {
        Array numbers= new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.print();
        /* 10
           20
           30
           40
           50 */
        numbers.removeAt(0);
        numbers.print();
        /* 20
           30
           40
           50 */
        numbers.removeAt(3);
        numbers.print();
        /* 20
           30
           40 */
        numbers.removeAt(1);
        numbers.print();
        /* 20
           40 */
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.print();
        /* 20
           40
           50
           60
           70 */
        System.out.println(numbers.indexOf(40));//1
    }
}
