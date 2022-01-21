// AVLTree
package com.Tree.AVLTree;

class myAvlTree{
    private class Node{
         int value;
         int height;
         Node leftChild;
         Node rightChild;

        Node(int value){
            this.value=value;
            this.height=1;
        }
    }
    private Node root;

    //insert
    public void insert(int data){
        this.root=insert(this.root,data);
    }
    private Node insert(Node node,int data){

        if(node==null){
            Node newnode = new Node(data);
            return newnode;
        }

        if (data>node.value)
            node.rightChild=insert(node.rightChild,data);
        else
            node.leftChild=insert(node.leftChild,data);

        node.height=Math.max(height(node.leftChild),height(node.rightChild))+1;
        int bf = balanceFacor(node);

        //LL case (rightRotation)
        if(bf>1 && data<node.leftChild.value){
            return rightRotate(node);
        }
        //RR case (leftRotation)
        if(bf< -1 && data>node.rightChild.value){
            return leftRotate(node);
        }
        //LR case (leftRightRotation)
        if(bf>1 && data>node.leftChild.value){
            node.leftChild = leftRotate(node.leftChild);
            return rightRotate(node);
        }
        //RL case (rightLeftRotation)
        if(bf< -1 && data<node.rightChild.value){
            node.rightChild = rightRotate(node.rightChild);
            return leftRotate(node);
        }


        return node;
    }

    //rightRotate
    private Node rightRotate(Node c){
        Node b = c.leftChild;
        Node t3 = b.rightChild;
        //rotation
        b.rightChild=c;
        c.leftChild=t3;
        //height update
        c.height = Math.max(height(c.leftChild),height(c.rightChild))+1;
        b.height = Math.max(height(b.leftChild),height(b.rightChild))+1;
        return b;
    }
    //leftRotate
    private Node leftRotate(Node c){
        Node b = c.rightChild;
        Node t2 = b.leftChild;
        //rotation
        b.leftChild=c;
        c.rightChild=t2;
        //height update
        c.height = Math.max(height(c.leftChild),height(c.rightChild))+1;
        b.height = Math.max(height(b.leftChild),height(b.rightChild))+1;
        return b;
    }
    //height
    private int height(Node node){
        if(node==null)
            return 0;
        return node.height;
    }
    //balanceFactor
    private int balanceFacor(Node node){
        if(node==null)
            return 0;
        return height(node.leftChild)-height(node.rightChild);
    }

    //DisplayAvlTree
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        if(node==null)
            return;
        String str = "";
        if(node.leftChild==null)
            str += ".";
        else
            str += node.leftChild.value;

        str += "->"+node.value+"<-";

        if(node.rightChild==null)
            str += ".";
        else
            str += node.rightChild.value;

        System.out.println(str);

        display(node.leftChild);
        display(node.rightChild);
    }

}


public class AvlTree {
    public static void main(String[] args) {
        myAvlTree tree = new myAvlTree();
        tree.insert(20);
        tree.insert(25);
        tree.insert(30);
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(27);
        tree.insert(19);
        tree.insert(16);
        tree.display();
    }
}
