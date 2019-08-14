package com.personal.examples.recursion;


public class Spiral {

	
										
	/*public static void main(String[] args) {
		Spiral spiral = new Spiral();
		int startRow = 0;
		int startCol = 0;
		int endRow = 4;
		int endCol = 0;
		spiral.printOriginalArray(spiral.numbers, 5, 1);
		spiral.printSpiral(spiral.numbers, startRow, startCol, endRow, endCol);
		
	}*/
	
	private void printOriginalArray(int[][] numbers, int rows, int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
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

