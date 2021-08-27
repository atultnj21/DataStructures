package com.Tree.BinaryTrees;
class aTree{
    private class Node{
        private Node leftChild;
        private int value;
        private Node rightChild;
        public Node(int value){
            this.value=value;
        }
        @Override
        public String toString(){
            return "Node= "+value;
        }
    }
    private Node root;

    //INSERT
    public void insert(int value){

        Node newNode = new Node(value);

        if (root==null){
            root=newNode;
            return;
        }
        var current = root;

        while (true){

            if(value< current.value){
                if(current.leftChild==null){
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;
            }
            else{
                if(current.rightChild==null){
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }

        }

    }

    //Find
    public boolean find(int value){
        var current = root;

        while (current!=null){
            if(value< current.value)
                current=current.leftChild;
            else if (value > current.value)
                current=current.rightChild;
            else
                return true ;
        }

        return false;
    }
}

public class aTreeImplementation {
    public static void main(String[] args) {
        aTree tree = new aTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(7));//true
    }
}
/*
              (7)
           /       \
         (4)        (9)
       /    \      /    \
     (1)    (6)  (8)     (10)

*/