/**
 * 
 */
package com.gfg.practice.jatin.recursion.mergesort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * @author jatin
 *
 */
public class MergeSort {

	public static void main(String[] args) throws InterruptedException {
//		int[] items = {20,70,56,78,23,42,11,89,65,49,61,3,74,40,4,82};
//		int[] items = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//		int[] items = {5, 1};
		
		
		try {
		int[] items = Files.lines(Paths.get("InputData_InversionCount.txt"))
        .map(s -> s.trim())
        .mapToInt(s -> Integer.parseInt(s))
        .toArray();
		
		mergeSort(items, 0, items.length-1);
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	private static void mergeSort(int[] items, int startCounter, int endCounter) {
		
		if(startCounter >= endCounter) {
			return;
		}
		int mid = (startCounter + endCounter)/2;
		mergeSort(items, startCounter, mid);
		mergeSort(items, mid+1, endCounter);
		merge(items, startCounter, mid, endCounter);
	}
	private static int counter = 1;
	private static long inversionCount = 0;
	private static void merge(int[] items, int startCounter, int mid, int endCounter) {

		System.out.println("\nIteration :" + counter++ );
		int[] leftArray = new int[mid-startCounter+1];
		int[] rightArray = new int[endCounter-mid];
		
		for(int j=0, i = startCounter; i <= mid; i++, j++) {
			leftArray[j] = items[i];
		}
		
		for(int j = 0, i = mid+1; i <= endCounter; i++, j++) {
			rightArray[j] = items[i];
		}
		int i = startCounter;
		int j = 0;
		int k = 0;
		while(i <= endCounter) {
			
			if(j >= leftArray.length ) {
				items[i] = rightArray[k];
				k++;
			} else if(k >= rightArray.length) {
				items[i] = leftArray[j] ;
				j++;
			} else if(leftArray[j] <= rightArray[k]) {
				
				items[i] = leftArray[j];
				j++;
			} else {
				items[i] = rightArray[k];
				k++;
				inversionCount += leftArray.length - j;
			}
			i++;
		}
//		System.out.print("Left Array: \t");
//		Arrays.stream(leftArray).forEach(n -> System.out.print(n + "\t"));
//		System.out.println();
//		
//		System.out.print("Right Array: \t");
//		Arrays.stream(rightArray).forEach(n -> System.out.print(n + "\t"));
//		System.out.println();
//		Arrays.stream(items).forEach(n -> System.out.print(n + "\t"));
//		System.out.println();
		System.out.println("Total Inversions : " + inversionCount);
		
	}
}
