/**
 * 
 */
package com.personal.examples.recursion.adjaent.duplicates;

import java.util.Arrays;

/**
 * @author jatin
 * <pre>
 * Given a string s, recursively remove adjacent duplicate characters from the string s. The output string should not have any adjacent duplicates.
 

Input:
The first line of input contains an integer T, denoting the no of test cases. Then T test cases follow. Each test case contains a string str.

Output:
For each test case, print a new line containing the resulting string.

Constraints:
1<=T<=100
1<=Length of string<=50

Example:
Input:
2
geeksforgeek
acaaabbbacdddd

Output:
gksforgk
acac 
 *
 */
public class AdjacentDuplicates {

	public static void main(String[] args) {
		AdjacentDuplicates adjacentDuplicates = new AdjacentDuplicates();
		adjacentDuplicates.executeAllTestCases(1, "aaaaabbbbbaaaabbbaakajkdjdhddhsd");
	}
	
	public void executeAllTestCases(int t, String... words) {
		
		if(t <= 0 || null == words || words.length == 0 || t != words.length) {
			return;
		}
		Arrays.stream(words).forEach(word -> System.out.println(word + " :\t" + removeAdjacentDuplicates(word, 0)));
		
		
	}
	
	public String removeAdjacentDuplicates(String word, int counter) {
		if(counter >= word.length()) {
			return word;
		} else {
			char c = word.charAt(counter);
			word = removeAdjacentDuplicateCharacter(c, counter+1, word);
			return removeAdjacentDuplicates(word, ++counter);
		}
	}
	
	public String removeAdjacentDuplicateCharacter(char c, int counter, String word) {
		if(counter >= word.length()) {
			return word;
		}
		char nextChar = word.charAt(counter);
		if(nextChar != c) {
			return word;
		} else {
			String firstPart = word.substring(0, counter);
			String secondPart = word.substring(counter+1, word.length());
			word = firstPart + secondPart;
			
			return removeAdjacentDuplicateCharacter(c, counter, word);
		}
	}
}
