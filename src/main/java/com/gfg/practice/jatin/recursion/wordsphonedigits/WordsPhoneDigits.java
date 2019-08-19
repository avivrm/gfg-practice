package com.gfg.practice.jatin.recursion.wordsphonedigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * <pre>
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. T testcases follow. Each testcase contains two lines of input.
 * The first line of each test case is N, N is the number of digits. The second
 * line of each test case contains D[i], N number of digits.
 *
 * Output: Print all possible words from phone digits with single space in lower
 * case.
 *
 * Constraints: 1 <= T <= 10 1 <= N <= 10 2 <= D[i] <= 9
 *
 * Example: Input: 1 3 2 3 4
 *
 * Output: adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh
 * bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
 *
 */

// TODO - Apply code validations
public class WordsPhoneDigits {

	private static Map<Integer, List<String>> digitMap;
	static {
		digitMap = new HashMap<>();
		digitMap.put(1, Arrays.asList(new String[] { "" }));
		digitMap.put(2, Arrays.asList(new String[] { "A", "B", "C" }));
		digitMap.put(3, Arrays.asList(new String[] { "D", "E", "F" }));
		digitMap.put(4, Arrays.asList(new String[] { "G", "H", "I" }));
		digitMap.put(5, Arrays.asList(new String[] { "J", "K", "L" }));
		digitMap.put(6, Arrays.asList(new String[] { "M", "N", "O" }));
		digitMap.put(7, Arrays.asList(new String[] { "P", "Q", "R", "S" }));
		digitMap.put(8, Arrays.asList(new String[] { "T", "U", "V" }));
		digitMap.put(9, Arrays.asList(new String[] { "W", "X", "Y", "Z" }));
		digitMap.put(0, Arrays.asList(new String[] { "" }));

	}
	private int testCaseCount;
	private List<TestData> testData;

	public WordsPhoneDigits() {
		testData = new ArrayList<TestData>();
	}

	public static void main(String[] args) {

		WordsPhoneDigits test = new WordsPhoneDigits();

		test.setTestCaseCount(test.getTestCaseCountInput());
		List<TestData> testDataList = new ArrayList<>();
		test.setTestData(testDataList);
		test.populateTestData(testDataList, test.getTestCaseCount(), 0);
		System.out.println(test);

		test.printWordCombinations();
	}

	private void printWordCombinations() {
		List<TestData> testData = getTestData();
		for (TestData testCase : testData) {
			System.out.println(executeTestCase(testCase));
		}

	}

	private String executeTestCase(TestData testCase) {
			int[] digits = testCase.getDigits();
			String combinedResult = "";
			List<String> results = combineLiterals(digitMap.get(digits[0]), 1, digits);
			for(String result : results) {
				combinedResult += " " + result;
			}
			return combinedResult;
	}

	private List<String> combineLiterals(List<String> firstList, int digitsCounter, int[] digits) {
		
		if(digitsCounter >= digits.length) {
			return firstList;
		}
		List<String> combinedString = new ArrayList<>();
		List<String> secondList = digitMap.get(digits[digitsCounter]);
		for(String item1 : firstList) {
			for(String item2 : secondList) {
				combinedString.add(item1 + item2);
			}
		}
		return combineLiterals(combinedString, ++digitsCounter, digits);
		
	}

	// Test Data Creation
	public void populateTestData(List<TestData> testData, int testCaseCount, int counter) {
		if (counter >= testCaseCount) {
			return;
		} else {
			System.out.println("Test Case " + (counter + 1) + " Details: ");
			TestData testCase = new TestData();
			testCase.setDigitCount(populateDigitCount());
			int[] digits = new int[testCase.getDigitCount()];
			testCase.setDigits(digits);
			populateDigits(testCase, 0);
			testData.add(testCase);
			populateTestData(testData, testCaseCount, ++counter);
		}
	}

	private void populateDigits(TestData testCase, int counter) {
		if (counter >= testCase.getDigitCount()) {
			return;
		} else {

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter digit " + (counter + 1) + " : ");
			testCase.getDigits()[counter] = scan.nextInt();
			populateDigits(testCase, ++counter);
		}
	}

	private int populateDigitCount() {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of digits to be used : ");
			int digitCount = scan.nextInt();
			return digitCount;
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input. Please enter a valid number.");
			populateDigitCount();
		}
		return 0;

	}

	private int getTestCaseCountInput() {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of test cases : ");
			int testCaseCount = scan.nextInt();
			return testCaseCount;
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input. Please enter a valid number.");
			getTestCaseCountInput();
		}
		return 0;
	}

	/**
	 * @return the testCaseCount
	 */
	public int getTestCaseCount() {
		return testCaseCount;
	}

	/**
	 * @param testCaseCount
	 *            the testCaseCount to set
	 */
	public void setTestCaseCount(int testCaseCount) {
		this.testCaseCount = testCaseCount;
	}

	/**
	 * @return the testData
	 */
	public List<TestData> getTestData() {
		return testData;
	}

	/**
	 * @param testData
	 *            the testData to set
	 */
	public void setTestData(List<TestData> testData) {
		this.testData = testData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WordsPhoneDigits [testCaseCount=" + testCaseCount + ", testData=" + testData + "]";
	}

}
