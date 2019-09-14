/**
 * 
 */
package com.gfg.practice.jatin.recursion.mergesort;

import java.util.Arrays;

/**
 * @author jatin
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] items = {20,70,56,78,23,42,11,89,65,49,61,3,74,40,4,82};
		mergeSort(items, 0, items.length-1);
		
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
			}
			i++;
		}
		System.out.print("Left Array: \t");
		Arrays.stream(leftArray).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		System.out.print("Right Array: \t");
		Arrays.stream(rightArray).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		Arrays.stream(items).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
	}
}
