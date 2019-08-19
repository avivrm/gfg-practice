package com.gfg.practice.avinash.tree;



class Node{

    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

class BinaryTree{

    Node root;
/*

    BinaryTree(Node node){
        this.node = node;
    }
*/

    public void inOrder(Node node){

        if(node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data +" ");
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node == null)
            return;

        System.out.print(node.data +" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        //  System.out.println(" **** " + node.data + " **** " );

        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data +" ");
    }

}

public class OrderPrint {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder(tree.root);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.inOrder(tree.root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder(tree.root);

    }

}
