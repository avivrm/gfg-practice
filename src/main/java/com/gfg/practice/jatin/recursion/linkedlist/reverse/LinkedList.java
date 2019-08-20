/**
 * 
 */
package com.gfg.practice.jatin.recursion.linkedlist.reverse;

/**
 * @author jatin
 *
 * Reverse a singly linked list
 */
public class LinkedList {

	public static void main(String[] args) {
		Node root = Node.createLinkedList(new Integer[] {1, 2, 3, 4, 5, 6, 7});
		System.out.println(root);
		root = reverseList(null, root);
		System.out.println(root);
		
	}
	
	public static Node reverseList(Node previousNode, Node currentNode) {
		if(currentNode == null) {
			return previousNode;
		} else {
			Node nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			return reverseList(currentNode, nextNode);
		}
	}
}
