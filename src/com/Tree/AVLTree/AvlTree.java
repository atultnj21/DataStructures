//AVLTree
//AVLNode
//insert() - recursion
package com.Tree.AVLTree;

class MyAVLTree{
    private class AVLNode{
        private int data;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;
        public AVLNode(int data){
            this.data=data;
        }

        @Override
        public String toString() {
            return "VALUE= "+this.data;
        }
    }
    private AVLNode root;

    public void insert(int data){
        root=insert(root,data);
    }
    private AVLNode insert(AVLNode root ,int data){
        AVLNode newNode = new AVLNode(data);
        if(root==null)
            return newNode;
        if(data<root.data)
            root.leftChild=insert(root.leftChild,data);
        else
            root.rightChild=insert(root.rightChild,data);

        root.height=Math.max(height(root.leftChild),height(root.rightChild))+1;

        return root;
    }
    private int height(AVLNode node){
        return (node==null) ? -1 : node.height;
    }
}
public class AvlTree {
    public static void main(String[] args) {
        var tree = new MyAVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
    }
}
