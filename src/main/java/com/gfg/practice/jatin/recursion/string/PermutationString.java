/**
 * 
 */
package com.gfg.practice.jatin.recursion.string;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author jatin
 * <pre>
 * Given a string S. The task is to print all permutations of a given string.

Input:
The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:
Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA 
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA

Explanation:
Testcase 1: Given string ABC has permutations in 6 forms as ABC, ACB, BAC, BCA, CAB and CBA .
 *
 */
public class PermutationString {

	public static void main(String[] args) {
		PermutationString permutation = new PermutationString();
		permutation.printStringPermutation(3, new String[]{"ab", "abc", "abcd"});
	}
	
	public void printStringPermutation(int t, String... words) {
		
		if(null == words || words.length == 0 || words.length != t ) {
			return;
		}
		printPermutations(t, words, 0);
	}
	
	
	public void printPermutations(int t, String[] words, int counter) {
		if(counter >= t) {
			return;
		} else {
			printPermutation(words[counter]);
			printPermutations(t, words, ++counter);
		}
		
		
	}
	
	public void printPermutation(String word) {
		
		String[] alphabets = word.split("");
		Set<String> permutations = new TreeSet<>();
		permutations.add(alphabets[0]);
		permutations = findAllPermutations(permutations, alphabets, 1);
		System.out.println("\nNumber of permutations for " + word + " : " + permutations.size());
		permutations.stream().forEach(permutation -> System.out.print(permutation + "\t"));
	}
	
	public Set<String> findAllPermutations(Set<String> permutationWords, String[] alphabets, int counter) {
		if(counter >= alphabets.length) {
			return permutationWords;
		} else {
			Set<String> combinedWords = new TreeSet<>();
			for(String word : permutationWords) {
				combinedWords.addAll(combineWords(word, alphabets[counter]));
			}
			return findAllPermutations(combinedWords, alphabets, ++counter);
		}
		
	}
	
	public Set<String> combineWords(String word, String alphabet) {
		Set<String> combinedWords = new TreeSet<>();
		for(int i=0; i < word.length(); i++) {
			String firstPart = word.substring(0, i+1);
			String secondPart = word.substring(i+1, word.length());
			combinedWords.add(alphabet + firstPart + secondPart);
			combinedWords.add(firstPart + alphabet + secondPart);
			
		}
		return combinedWords;
	}
	
	
	
}
