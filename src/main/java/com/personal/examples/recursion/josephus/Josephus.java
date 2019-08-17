/**
 * 
 */
package com.personal.examples.recursion.josephus;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jatin
 * 
 *         <pre>
 *         Given the total number of persons n and a number k which indicates
 *         that k-1 persons are skipped and kth person is killed in circle in a
 *         fixed direction.​ The task is to choose the safe place in the circle
 *         so that when you perform these operations starting from 1st place in
 *         the circle, you are the last one remaining and survive.
 * 
 *         Input Format: The first line of input contains an integer T denoting
 *         the number of test cases . Then T test cases follow. Each test case
 *         contains 2 integers n and k .
 * 
 *         Output Format: For each test case, in a new line, output will be the
 *         safe position which satisfies the above condition.
 * 
 *         Your Task: This is a function problem. You are required to complete
 *         the function josephus that takes two parameters n and k and returns
 *         an integer denoting safe position .
 * 
 *         Constraints: 1 <= T <= 100 1 <= k, n <= 20
 * 
 *         Example: Input: 2 3 2 5 3 Output 3 4
 * 
 *         Explanation: Testcase 1: There are 3 persons so skipping 1 person i.e
 *         1st person 2nd person will be killed. Thus the safe position is 3.
 *
 */
public class Josephus {

	public static void main(String[] args) {

		Josephus jose = new Josephus();
		System.out.println(jose.josephus(5, 3));
	}

	public int josephus(int n, int k) {
		if (n < 2 || k < 1) {
			return 0;
		}
		Node rootNode = createCircularList(n);
		Node lastRemainingNode = removeKthNode(rootNode, k, 1);
		return lastRemainingNode.getValue();
	}

	public Node removeKthNode(Node currentNode, int k, int counter) {
		if (currentNode == currentNode.getNextNode()) {
			return currentNode;
		}
		if (counter == k) {
			currentNode = removeNode(currentNode);
			counter = 1;
		}
		currentNode = currentNode.getNextNode();
		return removeKthNode(currentNode, k, ++counter);
	}

	public Node removeNode(Node currentNode) {
		Node previousNode = currentNode.getPreviousNode();
		Node nextNode = currentNode.getNextNode();
		previousNode.setNextNode(nextNode);
		nextNode.setPreviousNode(previousNode);
		System.out.println("Node Removed : " + currentNode.getValue());
		return nextNode;
	}

	public Node createCircularList(int n) {
		Node rootNode = null;
		Node previousNode = null;
		for (int i = 0; i < n; i++) {
			Node node = new Node(i + 1);
			if (i == 0) {
				rootNode = node;
			} else {
				previousNode.setNextNode(node);
				node.setPreviousNode(previousNode);
			}
			previousNode = node;
		}
		previousNode.setNextNode(rootNode);
		rootNode.setPreviousNode(previousNode);
		return rootNode;

	}

}
