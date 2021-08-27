// Tree (root)
// Node (leftChild,value,rightChild)
// Insert(value)
// find(value):boolean
package com.Tree.BinaryTrees;
class Tree{

    private class Node{
        private  Node leftChild;
        private int value;
        private Node rightChild;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    //Insert()
    public void insert(int item){
        Node newNode = new Node(item);
        if(root==null){
            root = newNode;
        }
        else{
            if(newNode.value< root.value){
                Node current = root;
                while(current.leftChild!=null){
                    current=current.leftChild;
                }
                current.leftChild=newNode;
            }
            else if(newNode.value> root.value){
                Node current = root;
                while(current.rightChild!=null){
                    current=current.rightChild;
                }
                current.rightChild=newNode;
            }
        }
    }

    //Find
    public boolean Find(int item){
        if(item== root.value)
            return true;
        if(item<root.value){
            Node current = root;
            while(current!=null){
                if(current.value==item)
                    return true;
                current=current.leftChild;
            }
        }
        else if(item> root.value){
            Node current = root;
            while(current!=null){
                if(current.value==item){
                    return true;
                }
                current=current.rightChild;
            }
        }
        return false;
    }
}
public class TreeImplementation {
    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert(5);
        myTree.insert(4);
        myTree.insert(6);
        myTree.insert(1);
        System.out.println(myTree.Find(4));//true
    }
}
