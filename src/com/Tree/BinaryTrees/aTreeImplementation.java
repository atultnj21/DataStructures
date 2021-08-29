//BST
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

    public void traversePreorder(){
        traversePreorder(root);
    }
    //preOrder : root left right
    public void traversePreorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        traversePreorder(root.leftChild);
        traversePreorder(root.rightChild);
    }

    public void traverseInorder(){
        traverseInorder(root);
    }
    //InOrder : left root right
    public void traverseInorder(Node root){
        if(root==null){
            return;
        }
        traverseInorder(root.leftChild);
        System.out.print(root.value+" ");
        traverseInorder(root.rightChild);
    }

    public void traversePostorder(){
        traversePostorder(root);
    }
    //preOrder :  left right root
    public void traversePostorder(Node root){
        if(root==null) {
            return;
        }
        traversePostorder(root.leftChild);
        traversePostorder(root.rightChild);
        System.out.print(root.value+" ");
    }

// height
// 1+max(height(L),height(R))
    public int height(){
        return height(root);
    }
    private int height(Node root){
        // What if our tree is empty?
        if(root==null)
            return -1;

        if(root.leftChild==null && root.rightChild==null)
            return 0;
        return 1+ Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

//Minimun  O(n)
    public int minValue(){
        return minValue(root);
    }
    private int minValue(Node root){
        if(root.leftChild==null && root.rightChild==null)
            return root.value;
        var left = minValue(root.leftChild);// minValue returns int
        var right = minValue(root.rightChild);
        return Math.min(Math.min(left,right),root.value);
    }


     /*if we are given a BST we will have a simpler way
     to find the minimum value , we will just simply return the
     left most value
    public int minV(){
        return minV(root);
    }
    private int minV(Node root){
        if(root.leftChild==null )
            return root.value;
        var ans = minV(root.leftChild);
        return ans;
    }*/

    //O(log n)
    public int minV(){
        if(root==null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current!=null){
            last=current;
            current=current.leftChild;
        }
        return last.value;
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
        tree.traversePreorder();
        System.out.println();
        tree.traverseInorder();
        System.out.println();
        tree.traversePostorder();
        System.out.println();
        System.out.println(tree.height());//2
        System.out.println(tree.minValue());//1
        System.out.println(tree.minV());//1
    }
}
/*
              (7)
           /       \
         (4)        (9)
       /    \      /    \
     (1)    (6)  (8)     (10)

*/