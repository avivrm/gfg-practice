package com.gfg.practice.jatin.recursion.Spiral;

/**
 * Given a 2D array, print it in spiral form. See the following examples.
 * <pre>
 * Examples:
 * Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 


Input:
        1   2   3   4  5   6
        7   8   9  10  11  12
        13  14  15 16  17  18
Output: 
1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11</pre>
 * @author jatin
 *
 */
public class Spiral {

	public void executeSpiral(int[][] numbers) {
		if(null == numbers || numbers.length == 0) {
			return;
		}
		int startRow = 0;
		int endRow = numbers.length-1;
		int startCol = 0;
		int endCol = numbers[0].length-1;
		printSpiral(numbers, startRow, startCol, endRow, endCol);
	}
	
	
	private void printSpiral(int[][] numbers, int startRow, int startCol, int endRow, int endCol) {
		
		if(startRow > endRow || startCol > endCol) {
			return;
			
		} else {
			
			printRightLine(numbers, startRow, startCol, endRow, endCol);
			++startRow;
			if(startRow <= endRow) { 
				printDownLine(numbers, startRow, endCol, endRow, startCol);
				--endCol;
			}
			if(startRow <= endRow && startCol <= endCol) {
				printLeftLine(numbers, endRow, endCol, startRow, startCol);
				--endRow;
			}
			if(startRow <= endRow && startCol <= endCol) {
				printUpLine(numbers, endRow, startCol, startRow, endCol);
				++startCol;
			}
			printSpiral(numbers, startRow, startCol, endRow, endCol);
		}
		
	}
	
	private void printUpLine(int[][] numbers, int startRow, int startCol, int endRow, int endCol) {
		
		if(startRow < endRow) {
			return;
		} else {
			System.out.println(numbers[startRow][startCol]);
			printUpLine(numbers, --startRow, startCol, endRow, endCol);
		}
	}
	
	private void printLeftLine(int[][] numbers, int startRow, int startCol, int endRow, int endCol) {
		if(startCol < endCol) {
			return;
		} else {
			System.out.println(numbers[startRow][startCol]);
			printLeftLine(numbers, startRow, --startCol, endRow, endCol);
		}
	}
	
	private void printDownLine(int[][] numbers, int startRow, int startCol, int endRow, int endCol) {
		if(startRow > endRow) {
			return;
		} else {
			System.out.println(numbers[startRow][startCol]);
			printDownLine(numbers, ++startRow, startCol, endRow, endCol);
		}
	}
	
	private void printRightLine(int[][] numbers, int startRow, int startCol, int endRow, int endCol) {
		
		if(startCol > endCol) {
			return;
		} else {
			System.out.println(numbers[startRow][startCol]);
			printRightLine(numbers, startRow, ++startCol, endRow, endCol);
		}
	}
}

