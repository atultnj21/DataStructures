//Binary tree using recursion
package com.Tree.BinaryTrees;


import java.util.Scanner;
class Node{
    int data;
    Node leftChild;
    Node rightChild;
    public Node(int data){
        this.data=data;
    }
    @Override
    public String toString(){
        return "data "+this.data;
    }
}
public class BinaryTree {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        createTree();
    }
    public static Node createTree(){
        Node root = null;
        System.out.println("enter data: ");
        int data= sc.nextInt();
        if(data==-1)
            return null;
        root = new Node(data);
        System.out.println("enter left to "+ data);
        root.leftChild=createTree();
        System.out.println("enter right to "+ data);
        root.rightChild=createTree();
        return root;
    }
}
