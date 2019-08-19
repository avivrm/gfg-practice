/**
 * 
 */
package com.gfg.practice.jatin.recursion.plusminus.pattern;

import java.util.Arrays;

/**
 * @author jatin
 *
 */
public class Pattern {
	
	public static void main(String[] args) {
		Pattern pattern = new Pattern();
		pattern.executeTestCases(4, 10, 18, -8, 0);
	}
	
	public void executeTestCases(int t, Integer... numbers) {
		
		if(t <= 0 || null == numbers || numbers.length == 0 || t != numbers.length) {
			return;
		}
		
		Arrays.stream(numbers).forEach(number -> {
			System.out.println();
			printPattern(number, number, -5);});
	}
	
	public void printPattern(int number, int numberCopy, int delimiter) {
		if(numberCopy <= 0) {
			System.out.println("Invalid number : " + numberCopy);
			return;
		}
		if(number > numberCopy) {
			return;
		}
		if(number <= 0) {
			delimiter *= -1;
			
		} 
		System.out.print("\t" + number);
		number += delimiter;
		printPattern(number, numberCopy, delimiter);
	}

}
