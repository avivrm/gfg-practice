/**
 * 
 */
package com.personal.examples.recursion.wordsphonedigits;

import java.util.Arrays;

/**
 * @author jatin
 *
 */
public class TestData {

	private int digitCount;
	private int[] digits;
	
	
	/**
	 * @return the digitCount
	 */
	public int getDigitCount() {
		return digitCount;
	}
	/**
	 * @param digitCount the digitCount to set
	 */
	public void setDigitCount(int digitCount) {
		this.digitCount = digitCount;
	}
	/**
	 * @return the digits
	 */
	public int[] getDigits() {
		return digits;
	}
	/**
	 * @param digits the digits to set
	 */
	public void setDigits(int[] digits) {
		this.digits = digits;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestData [digitCount=" + digitCount + ", digits=" + Arrays.toString(digits) + "]";
	}
}
