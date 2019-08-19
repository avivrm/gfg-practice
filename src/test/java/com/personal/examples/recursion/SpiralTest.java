package com.personal.examples.recursion;

import org.junit.Test;

import com.personal.examples.recursion.Spiral.Spiral;

import junit.framework.TestCase;

public class SpiralTest extends TestCase {
	
	Spiral spiral = new Spiral();

	@Test
	public void testSpiral_General() {
		int[][] numbers = new int[][] { { 1, 2, 3, 4, 5 }, 
										{ 6, 7, 8, 9, 10 }, 
										{ 11, 12, 13, 14, 15 },
										{ 16, 17, 18, 19, 20 }, 
										{ 21, 22, 23, 24, 25 } };
		spiral.executeSpiral(numbers);

		
	}
	
	@Test
	public void testSpiral_SingleColumn() {
		 int[][] numbers = new int[][] {{1}, {2}, {3}, {4}, {5}};
		 spiral.executeSpiral(numbers);
	}
	
	@Test
	public void testSpiral_SingleRow() {
		 int[][] numbers = new int[][] {{1, 2, 3, 4, 5}};
		 spiral.executeSpiral(numbers);
	}
	
	@Test
	public void testSpiral_SingleElement() {
		 int[][] numbers = new int[][] {{1}};
		 spiral.executeSpiral(numbers);
	}
	
	@Test
	public void testSpiral_nullMatrix() {
		 int[][] numbers = null;
		 spiral.executeSpiral(numbers);
	}
	
	@Test
	public void testSpiral_EmptyMatrix() {
		 int[][] numbers = new int[][] {{}};
		 spiral.executeSpiral(numbers);
	}
}
