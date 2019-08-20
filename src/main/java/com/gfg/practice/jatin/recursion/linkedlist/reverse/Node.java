/**
 * 
 */
package com.gfg.practice.jatin.recursion.linkedlist.reverse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jatin
 *
 */
public class Node {

	public Node(int value) {
		this.value = value;
	}
	private int value;
	private Node next;
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	public static Node createLinkedList(Integer... values) {
		List<Node> nodes = new ArrayList<>();
		for(int value : values) {
			nodes.add(new Node(value));
		}
		createLinks(nodes);
		
		return nodes.get(0);
	}
	
	private static void createLinks(List<Node> nodes) {
		Node node = nodes.get(0);
		for(int i=1; i < nodes.size(); i++) {
			node.setNext(nodes.get(i));
			node = node.getNext();
		}
		nodes.get(nodes.size()-1).setNext(null);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}
	
}
