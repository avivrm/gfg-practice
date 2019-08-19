package com.gfg.practice.avinash.linkedList;

class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedListOperations {
    static Node head = null;

    public static void main(String[] args) {

        //Node head = null;

        insert(7);

        insert( 9);

        print();
    }


    public static void insert(int val){
        if(head == null){
            head = new Node(val, null);
        }else{

            Node node = new Node(val,head);

            head = node;
        }

    }

    public static void print() {

        while(head.data != 0) {

            if(head != null && head.data != 0) {
                System.out.println(head.data);
                //if(head.next != null)
                      head = head.next;
            }

        }
    }
}



